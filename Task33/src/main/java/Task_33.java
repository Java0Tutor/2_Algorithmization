import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Пусть даны две неубывающие последовательности действительных чисел
 * a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm. Требуется указать те места, на
 * которые нужно вставлять элементы последовательности b1 <= b2 <= ... <= bm в
 * первую последовательность так, чтобы новая последовательность оставалась
 * возрастающей.
 */

public class Task_33 {
    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Enter quantity of the first sequence. ");
            int n = Integer.parseInt(read.readLine());
            int[] firstArray = new int[n];

            for (int i = 0; i < firstArray.length; i++) {
                int positiveNegative = Math.random() < 0.5 ? -1 : 1;
                firstArray[i] = (int) (Math.random() * 100) * positiveNegative;
                System.out.print(firstArray[i] + ", ");
            }

            System.out.println("\nEnter quantity of the second sequence. ");
            int m = Integer.parseInt(read.readLine());
            int[] secondArray = new int[m];

            for (int i = 0; i < secondArray.length; i++) {
                int positiveNegative = Math.random() < 0.5 ? -1 : 1;
                secondArray[i] = (int) (Math.random() * 100) * positiveNegative;
                System.out.print(secondArray[i] + ", ");
            }

            int[] newArray = firstArray;

            System.out.println("\nResult after sorting: ");
            for (int element : secondArray) {
                int pointInsert = insert(newArray, element);
                int[] arrayTemp = new int[newArray.length + 1];
                for (int i = 0; i < newArray.length; i++) {
                    if (pointInsert > i) {
                        arrayTemp[i] = newArray[i];
                    } else if (pointInsert == i) {
                        arrayTemp[i] = element;
                        arrayTemp[i + 1] = newArray[i];
                    } else {
                        arrayTemp[i + 1] = newArray[i];
                    }
                }
                newArray = arrayTemp;
                System.out.printf("%n%nPosition of insert of new array \"%d\": i = %d", element, pointInsert);
                System.out.println("\n\n New sequence after sorting : ");

                printArray(newArray);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int insert(int[] array, int element) {
        int j = 0;
        int firstIndex = 0;
        int lastIndex = array.length - 1;

        while (firstIndex <= lastIndex) {
            j = (firstIndex + lastIndex) / 2;
            if (array[j] == element) {
                return j;
            } else if (array[j] < element) {
                firstIndex = j + 1;
            } else if (array[j] > element && j != 0 && !(array[j - 1] < element)) {
                lastIndex = j - 1;
            } else {
                break;
            }
        }
        return j;
    }

    private static void printArray(int[] a) {
        for (int element : a) {
            System.out.printf("%d ", element);
        }
    }
}