import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*      Eng:
         A matrix of non-negative numbers is given.
         Calculate the sum of the elements in each column.
         Determine which column contains the maximum amount.
        */
/*      Rus:
        Задана матрица неотрицательных чисел.
        Посчитать сумму элементов в каждом столбце.
        Определить, какой столбец содержит максимальную сумму.
        */
public class Task_20 {
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

            System.out.println("\nPositive elements of main diagonal : ");
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][i] > 0) {
                    System.out.printf("%d, ", matrix[i][i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*      Example of output:
        Enter quality of strings
        5
        Enter quality of columns
        6

        -11 -16  10 -30  -8 -26
        -96 -53  41  95 -75   1
        49   7  42 -51   0  25
        -29  57  -4  18   7  16
        -27  87 -59 -52  83  58

        Positive elements of main diagonal:
        42, 18, 83,
 */