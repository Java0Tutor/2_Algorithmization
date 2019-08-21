import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  Сформировать квадратную матрицу порядка N по правилу:
 *  A[I,J] = sin((I^2 - J^2) / N)
 *  и подсчитать количество положительных элементов в ней.
 */

public class Task_17 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the square matrix with even number n: ");
            int n = Integer.parseInt(reader.readLine());
            double [][] matrix = new double[n][n];
            int count;

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = Math.sin((i * i - j * j) / n);
                    System.out.printf("%10f",matrix[i][j]);
                }
                System.out.println();
            }

            count = 0;
            for (double [] array : matrix) {
                for (double element : array) {
                    if (element > 0) {
                        count++;
                    }
                }
            }
            System.out.printf("%n Amount of positive numbers: %d", count);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}