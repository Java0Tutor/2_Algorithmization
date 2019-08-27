
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * Написать метод(методы) для нахождения наибольшего общего делителя и
 * наименьшего общего кратного двух натуральных чисел:
 * НОК(А,В) = A*B / НОД(A,B)
 */
public class Task_35 {

        public static void main(String[] args) throws IOException {

            int a, b;
            int gcd, lcm;

            try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter two natural numbers:");
            a = Integer.parseInt(read.readLine());
            b = Integer.parseInt(read.readLine());
            gcd = findGcd(a, b);
            System.out.println("Largest Common Factor: " + gcd);
            lcm = findLcm(a, b);
            System.out.println("Least Common Multiple : " + lcm);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private static int findGcd(int a, int b) {
            a = Math.abs(a);
            b = Math.abs(b);
            for (int i = 0; i < 2; i++) {
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

        private static int findLcm(int a, int b) {
            return Math.abs(a * b / findGcd(a, b));
        }
    }


