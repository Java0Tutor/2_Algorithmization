import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.Arrays;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        // 4. Даны действительные числа а 1 ,а 2 ,..., а n . Поменять местами наибольший и наименьший элементы.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a size of array:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 100) - 50);
        }
        System.out.print(Arrays.toString(array) + "\n");

        //bobble sort
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int a = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = a;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
                  int swap = array[0];
                  array[0] = array.length;
                  array.length = swap;
        }
        System.out.print(Arrays.toString(array) + "\n");
    }
}
