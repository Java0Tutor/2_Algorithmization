import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
       ENG:
       Write a method (s) to check if the given three numbers are coprime.).

       RUS:
       Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
*/
public class Task_40 {
    public static void main(String[] args) {

        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter first number:" );
            int a = Integer.parseInt(read.readLine());

            System.out.println("Enter second number: ");
            int b = Integer.parseInt(read.readLine());

            System.out.println("Enter third number: ");
            int c = Integer.parseInt(read.readLine());

            int [] number = {a, b, c};
            System.out.println("What number is mutually number prime?  ");
            System.out.println(isMutually(number));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int findGcd(int [] number) {
        int a = Math.abs(number[0]);
        for (int element : number) {
            int b = Math.abs(element);
            while (a != 0 && b != 0) {
                if (a > b) {
                    a %= b;
                } else {
                    b %= a;
                }
            }
            a += b;
        }
        return a;
    }

    private static boolean isMutually (int[] a) {
        return findGcd(a) == 1;
    }
}