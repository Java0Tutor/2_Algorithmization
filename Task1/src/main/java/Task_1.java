import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
// 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a size of array:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter natural number k ");
        int k = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
                    System.out.print("|"+ array[i]);
            if (k % array[i] == 0)
                System.out.print("\n this number is multiple: " + array[i]);

        }
    }
    }

