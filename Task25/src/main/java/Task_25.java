import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*      Eng:
        Find the largest element of the matrix and replace all odd elements with it
        */
/*      Rus:
        Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
        */

public class Task_25 {
    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter quantity of strings");
            int n = Integer.parseInt(read.readLine());
            System.out.println("Enter quantity of columns");
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
            int max = Integer.MIN_VALUE;
                for (int [] array : matrix) {
                    for (int element : array) {
                        if (element > max) {
                            max = element;
                            }
                        }
                    }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] % 2 != 0) {
                        matrix[i][j] = max;
                    }
                }
            }
            for (int[] array : matrix) {
                for (int element : array) {
                    System.out.printf("%3d ", element);
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
Example of output:

        Enter quantity of strings
        6
        Enter quantity of columns
        7

        -79  82  -7  81  89  42  48
        40  -1   0  48 -30  -8 -42
        6  98 -65 -67  14  -1 -37
        -44  18  17 -78 -91 -43 -70
        60 -80 -80  16  84  79  20
        -75  50  83  80  42 -73  26

        98  82  98  98  98  42  48
        40  98   0  48 -30  -8 -42
        6  98  98  98  14  98  98
        -44  18  98 -78  98  98 -70
        60 -80 -80  16  84  98  20
        98  50  98  80  42  98  26
*/
