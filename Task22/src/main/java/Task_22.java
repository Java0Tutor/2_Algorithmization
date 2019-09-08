import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*      Eng:
        Sort matrix rows in ascending and descending order of element values.
        */
/*      Rus:
        Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
        */

public class Task_22 {
    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter quality of strings");
            int n = Integer.parseInt(read.readLine());
            System.out.println("Enter quality of columns");
            int m = Integer.parseInt(read.readLine());
            int[][] matrix = new int[n][m];

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    int positiveNegative = Math.random()<0.5?-1:1;
                    matrix[i][j] = (int) (Math.random()* 100)*positiveNegative;
                    System.out.printf("%3d ", matrix[i][j]);
                }
                System.out.println();
            }
            System.out.println();

            boolean isSorted;
            int swap;
            System.out.println("Sorting by ascending ");
            for (int i = 0; i < matrix.length; i++) {
                isSorted = false;
                while (!isSorted) {
                    isSorted = true;
                    for (int j = 0; j < matrix[i].length - 1; j++) {
                        if (matrix[i][j] > matrix[i][j + 1]) {
                            isSorted = false;
                            swap = matrix[i][j];
                            matrix[i][j] = matrix[i][j + 1];
                            matrix[i][j + 1] = swap;
                        }
                    }
                }
            }
            for (int[] ints : matrix) {
                for (int anInt : ints) {
                    System.out.printf("%3d ", anInt);
                }
                System.out.println();
            }

            System.out.println("\nSorting by descending  ");
            for (int i = 0; i < matrix.length; i++) {
                isSorted = false;
                while (!isSorted) {
                    isSorted = true;
                    for (int j = 0; j < matrix[i].length - 1; j++) {
                        if (matrix[i][j] < matrix[i][j + 1]) {
                            isSorted = false;
                            swap = matrix[i][j];
                            matrix[i][j] = matrix[i][j + 1];
                            matrix[i][j + 1] = swap;
                        }
                    }
                }
            }
            for (int[] ints : matrix) {
                for (int anInt : ints) {
                    System.out.printf("%3d ", anInt);
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}