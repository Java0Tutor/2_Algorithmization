import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_13 {
    // ENG 3. The matrix is given. Print the kth row and pth column of the matrix
    // RUS 3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter quality of strings");
            int strings = Integer.parseInt(reader.readLine());
            System.out.println("Enter quality of strings");
            int columns = Integer.parseInt(reader.readLine());
            int[][] matrix = new int[strings][columns];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    int positiveNegative = Math.random() < 0.5 ? -1 : 1;
                    matrix[i][j] = (int) (Math.random() * 100) * positiveNegative;
                    System.out.printf("%3d ", matrix[i][j]);
                }
                System.out.println();
            }
            System.out.println("Choose the string");
            int k = Integer.parseInt(reader.readLine());
            System.out.println("Choose the column");
            int p = Integer.parseInt(reader.readLine());

            System.out.println("The string is ");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (i == k-1)
                        System.out.printf("%3d ", matrix[i][j]);
                }
                System.out.println();
            }

            System.out.println("The column is ");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (j == p-1)
                        System.out.printf("%3d ", matrix[i][j]);
                }
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}