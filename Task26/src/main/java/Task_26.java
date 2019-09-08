import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*

A magic square of order n is a square matrix of size n x n composed of numbers 1, 2, 3,
         ..., n 2 so that the sums for each column, each row and each of the two large diagonals are equal between
         by myself. Build such a square.
         An example of a magic square of order 3:
         6 1 8
         7 5 3
         2 9 4

        Магическим квадратом порядка n называется квадратная матрица размера n x n, составленная из чисел 1, 2, 3,
        ..., n 2 так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
        собой. Построить такой квадрат.
        Пример магического квадрата порядка 3:
        6 1 8
        7 5 3
        2 9 4
 */
public class Task_26 {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int [][] square;
            int n;

            System.out.println("Create an order of magic square: ");
            n = Integer.parseInt(reader.readLine());

            while (n < 3) {
                System.out.printf("Magic square an order %d not exist %n", n);
                System.out.println("Create new order of magic square: ");
                n = Integer.parseInt(reader.readLine());
            }
            if ((n - 1) % 2 == 0) {
                square = oddMagicSquare(n);
            } else if (n % 4 == 0) {
                square = evenMagicSquare(n);
            } else {
                square = evenOddMagicSquare(n);
            }
            System.out.println("\nTo get magic square: ");
            printMatrix(square);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static int [][] oddMagicSquare (int n){
        int [][] square = new int[n][n];
        int i = 0;
        int j = (n - 1) / 2;
        square[i--][j++] = 1;
        for (int k = 2; k <= n * n; i--, j++, k++) {
            if (i < 0 && j > n - 1) {
                i += 2;
                j--;
            }
            if (i < 0) {
                i = n - 1;
            }
            if (j > n - 1) {
                j = 0;
            }
            if (square[i][j] != 0) {
                i += 2;
                j--;
            }
            square[i][j] = k;
        }
        return square;
    }
    private static int [][] evenMagicSquare (int n){
        int [][] square = new int[n][n];
        int temp;
        int k = 1;

        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square.length; j++) {
                square[i][j] = k;
                k++;
            }
        }

        for (int i = 0; i < n; i += 4 ) {
            for (int j = 1; j < n; j += 4) {
                square[i][j] = n * n + 1 - square[i][j];
                square[i + 3][j] = n * n + 1 - square[i + 3][j];
                square[i][j + 1] = n * n + 1 - square[i][j + 1];
                square[i + 3][j + 1] = n * n + 1 - square[i + 3][j + 1];
            }
        }
        for (int i = 1; i < n; i += 4 ) {
            for (int j = 0; j < n; j += 4) {
                square[i][j] = n * n + 1 - square[i][j];
                square[i + 1][j] = n * n + 1 - square[i + 1][j];
                square[i][j + 3] = n * n + 1 - square[i][j + 3];
                square[i + 1][j + 3] = n * n + 1 - square[i + 1][j + 3];
            }
        }
        return square;
      }
       private static int [][] evenOddMagicSquare (int n){
        int [][] square = new int[n][n];
        int [][] squareT = evenMagicSquare(n - 2);
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                square[i][j] = squareT[i - 1][j - 1] + 2 * (n - 1);
            }
        }
        int m = n / 2;
        int d = n * n + 1;

        square[0][0] = 3 * m - 1;
        square[0][n - 1] = 1;
        square[n - 1][0] = d - 1;
        square[n - 1][n - 1] = d - 3 * m + 1;

        int i, j;
        for (i = 1; i <= m - 2; i++) {
            square[0][i] = 2 * i + 1;
        }
        for (j = 1; j <= m; j++) {
            square[0][j + i - 1] = d - 2 * j;
        }
        for (j = 1; j < n - 1; j++) {
            square[n - 1][j] = n * n + 1 - square[0][j];
        }
        square[1][0] = 2 * m - 1;
        for (i = 1; i <= m / 2; i++) {
            square[i + 1][0] = 3 * m - 1 - i;
        }
        i--;
        for (j = 1; j <= m / 2 + 1; j++) {
            square[i + j + 1][0] = d - 4 * m + 1 + j;
        }
        j--;
        for (int q = 1; q <= m / 2 - 1; q++, i++){
            square[i + j + q + 1][0] = 3 * m - 1 + q;
            square[i + j + q + 2][0] = d - 2 * m - q;
        }

        for (i = 1; i < n - 1; i++) {
            square[i][n - 1] = n * n + 1 - square[i][0];
        }

        return square;
    }

    private static void printMatrix (int [][] square) {
        for (int[] array : square) {
            for (int element : array) {
                System.out.printf("%4d ", element);
            }
            System.out.println();
        }
    }
}