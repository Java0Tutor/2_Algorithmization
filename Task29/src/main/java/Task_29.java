import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
        ENG:
        Sort by selection. Given a sequence of numbers a1 <= a2 <= a3 <= ... <= aN. It is required to rearrange the elements so
        so that they are in descending order. To do this, in the array, starting from the first, the largest
        the element is put in first place, and the first - in place of the largest. Then, starting from the second, this procedure
        repeated. Write a sorting algorithm by choice.

        RUS:
        Cортировка выбором. Дана последовательность чисел a1<=a2<=a3<= ...<=aN .Требуется переставить элементы так,
        чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
        элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
        повторяется. Написать алгоритм сортировки выбором.

*/
public class Task_29 {
    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Enter quantity the elements of sequence: ");
            int n = Integer.parseInt(read.readLine());
            int[] array = new int[n + 1];
            for (int i = 1; i < array.length; i++) {
                array[i] = array[i - 1] + 3;
                System.out.print(array[i] + ", ");
            }
            System.out.println();

            int max;
            int temp;
            for (int i = 0; i < array.length; i++) {
                max = i;
                for (int j = i; j < array.length; j++) {
                    if (array[j] > array[max]) {
                        max = j;
                    }
                }
                temp = array[i];
                array[i] = array[max];
                array[max] = temp;
            }
            for (int i = 0; i < array.length-1; i++) {
                System.out.print(array[i] + ", ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*
    Example of output:
    Enter quantity the elements of sequence:
        5
        3, 6, 9, 12, 15,
        15, 12, 9, 6, 3,
 */