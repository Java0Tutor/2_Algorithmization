
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
            array[i] = (int) (Math.random() * 100) - 50;
        }
        System.out.print(Arrays.toString(array) + "\n");

        int max,min,swap;
        max=0;
        min=0;
        for (int i = 0; i < array.length; i++) {
            if(array[max]<array[i])
                max=i;
            if (array[min]>array[i])
                min=i;
        }
        System.out.println("max "+ array[max]+ " min "+ array[min]);
        swap=array[max];
        array[max]=array[min];
        array[min]=swap;
        System.out.print(Arrays.toString(array) + "\n");
    }
}

