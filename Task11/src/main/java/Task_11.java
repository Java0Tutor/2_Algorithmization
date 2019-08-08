import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// RUS  11. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
// ENG  11 Given a matrix. Display all odd columns with the first element larger than the last.

public class Task_11 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the size of matrix.\n Enter amount of strings");
            int n = Integer.parseInt(reader.readLine());
            System.out.println("Enter amount of columns");
            int m = Integer.parseInt(reader.readLine());
            int[][] matrix = new int[n][m];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    int negativePositive = Math.random() < 0.5 ? -1 : 1; //determinate negative or positive values
                    matrix[i][j] = (int) (Math.random() * 100) * negativePositive; //filling
                    System.out.print(matrix[i][j] + ",");
                }
                System.out.println();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
