/*
       ENG:
       Write a method (s) for calculating the sum of the factorials of all odd numbers from 1 to 9.
       RUS:
       Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
*/
public class Task_41 {
    public static void main(String[] args) {
        int [] array = {1, 3, 5, 7, 9};
        System.out.println(amountFactorial(array));
    }

    private static int amountFactorial (int [] array) {
        int amount = 0;
        for (int element : array) {
            amount += factorial(element);
        }
        return amount;
    }
    private static int factorial (int n) {
        int result = 1;
        if (n == 1 || n == 0) {
            return result;
        }
        result = n * factorial(n - 1);
        return result;
    }
}