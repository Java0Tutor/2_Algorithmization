import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
       ENG:
       Create a program that finds the second largest number in the array A [N] (print a number,
       which is less than the maximum element of the array, but larger than all other elements).

       RUS:
       Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
       которое меньше максимального элемента массива, но больше всех других элементов).
*/
public class Task_39 {
    public static void main(String[] args) {

        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the size numbers:");
            int n = Integer.parseInt(read.readLine());
            int [] array = new int [n];
            for (int i=0; i<array.length;i++){
                int positiveNegative = Math.random() < 0.5 ? -1 : 1;
                array[i] = (int) (Math.random() * 100) * positiveNegative;
                System.out.printf("%d, ", array[i]);
                }

                System.out.println("\nSecond maximum number of array is: ");
                findSecondMaxNumber(array);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void findSecondMaxNumber(int [] array){
        int swap;
        for (int i=0; i<array.length;i++) {
            for (int j = 0; j < i; j++) {
                if(array[i] < array[j]) {
                    swap = array[i];
                    array[i] = array[j];
                    array[j] = swap;
                }
            }
        }
        System.out.printf("%d, ", array[array.length - 2]);
    }
}
/*
    Example of output:
    Enter the size numbers:
        10
        10, 42, -25, -29, 44, -68, 71, -16, 81, -36,
        Second maximum number of array is:
        71,
 */