import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {

        //    2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
        //    числом. Подсчитать количество замен.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a size of array:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter natural number z ");
        int z = scanner.nextInt();
        int count=0;
        for (int i=0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.print(Arrays.toString(array)+ "\n");

        for (int i=0; i < array.length; i++) {
            if (array[i] > z ) {
                array[i]=z;
                ++count;
            }
        }
        System.out.print(Arrays.toString(array)+ "\n" + "The amount of changing is " + count);
    }

















}
