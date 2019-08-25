import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
        ENG:
        Given two one-dimensional arrays with a different number of elements and a natural number k. Combine them into
        one array, including the second array between the kth and (k + 1) - m elements of the first, without using
        additional array.

        RUS:
        3.1 Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
        один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
        дополнительный массив.
*/
public class Task_27 {
    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Enter quantity an elements of first array: ");
            int n = Integer.parseInt(read.readLine());
            int [] firstArray = new int [n];

            for (int i = 0; i < firstArray.length; i++) {
                firstArray[i]= (int) (Math.random()*100)-50;
                System.out.print(firstArray[i] + ", ");
            }

            System.out.println("\n\nEnter quantity an elements of second array: ");
            int m = Integer.parseInt(read.readLine());
            int [] secondArray = new int [m];

            for (int i = 0; i < secondArray.length; i++) {
                secondArray[i]= (int) (Math.random()*100)-50;
                System.out.print(secondArray[i] + ", ");
            }

            System.out.println("\n\nChoose number from first array: ");
            int k = Integer.parseInt(read.readLine());

            System.out.println("\n\nResult of joining two arrays : ");
            for (int i = 0; i < firstArray.length; i++) {
                System.out.print(firstArray[i] + ", ");
                if (k == firstArray[i]) {
                    for (int j = 0; j < secondArray.length; j++) {
                        System.out.print(secondArray[j] + ", ");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*
    Example of output:
        Enter quantity an elements of first array:
        8
        31, -21, 22, -10, 5, 2, 30, -40,

        Enter quantity an elements of second array:
        9
        -27, -27, 22, 49, 22, -17, 16, -41, 5,

        Choose number from first array:
        22

        Result of joining two arrays :
        31, -21, 22, -27, -27, 22, 49, 22, -17, 16, -41, 5, -10, 5, 2, 30, -40,

 */
