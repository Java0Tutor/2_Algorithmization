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
public class Task_19 {
    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter quality of strings");
            int n = Integer.parseInt(read.readLine());
            System.out.println("Enter quality of columns");
            int m = Integer.parseInt(read.readLine());
            int[][] matrix = new int[n][m];

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = (int) (Math.random() * 100);
                    System.out.printf("%3d ", matrix[i][j]);
                }
                System.out.println();
            }
            System.out.println();

            int maxColumn = 1;
            int maxSum = 0;
            int sum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                for (int i = 0; i < matrix.length; i++) {
                    sum += matrix[i][j];
                }
                System.out.printf("%nThe sum elements in column is №%d: %d", j + 1, sum);
                if (sum > maxSum) {
                    maxSum = sum;
                    maxColumn = j + 1;
                }
                sum = 0;
            }

            System.out.printf("\n\nColumn №%d consists max sum.", maxColumn);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*  Example of output:

    Enter quality of strings
        5
        Enter quality of columns
        5

        50  62  28   9  96
        55  92  83  85  47
        41  80  62   3  92
        30   2  24  97  29
        94  57  96  75  62

        The sum elements in column is №1: 270
        The sum elements in column is №2: 293
        The sum elements in column is №3: 293
        The sum elements in column is №4: 269
        The sum elements in column is №5: 326

        Column №5 consists max sum.

 */
