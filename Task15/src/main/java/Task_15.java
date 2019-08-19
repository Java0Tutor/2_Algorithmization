
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *   Eng: Generate a square matrix of order n according to the given pattern (n is even):
 *   Rus: Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 *      1   1   1  ... 1   1   1
 *      2   2   2  ... 2   2   0
 *      3   3   3  ... 3   0   0
 *      .   .   .  ... .   .   .
 *     n-1 n-1  0  ... 0   0   0
 *      n   0   0  ... 0   0   0
 */

class Task_15 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the square matrix with even number n: ");
            int n = Integer.parseInt(reader.readLine());
            int[][] matrix = new int[n][n];
            if (n % 2 == 0) {
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        if (i > 0)  {
                            if (n - (i + j) <= 0) {
                                matrix[i][j] = 0;
                            } else {
                                matrix[i][j] = i + 1;
                            }
                            System.out.printf("%3d ", matrix[i][j]);
                        }
                        else {
                            matrix[i][j] = 1;
                            System.out.printf("%3d ", matrix[i][j]);
                        }
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Number n is odd!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
   /* Output:
        1   1   1   1   1   1
        2   2   2   2   2   0
        3   3   3   3   0   0
        4   4   4   0   0   0
        5   5   0   0   0   0
        6   0   0   0   0   0
   */