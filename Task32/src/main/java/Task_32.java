import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 *  Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить
 *  его по возрастанию. Делается это следующим образом: сравниваются два сосед-
 *  них элемента ai и a(i + 1). Если ai <= a(i + 1), то продвигаются на один
 *  элемент вперед. Если ai > a(i + 1), то производится перестановка и сдвигаю-
 *  тся на один элемент назад. Составить алгоритм этой сортировки.
 */
    public class Task_32 {
        public static void main(String[] args) {
            try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {

                System.out.println("Enter quantity of the sequence. ");
                int n = Integer.parseInt(read.readLine());
                int[] array = new int[n];

                for (int i = 0; i < array.length; i++) {
                    int positiveNegative = Math.random() < 0.5 ? -1 : 1;
                    array[i] = (int) (Math.random() * 100) * positiveNegative;
                    System.out.print(array[i] + ", ");
                }

                System.out.println("\nResult after sorting: ");
                sortingShell(array);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
            private static void sortingShell(int[] array){
                int temp;
                int i = 1;
                while (i < array.length) {
                    if (array[i - 1] > array[i]) {
                        temp = array[i - 1];
                        array[i - 1] = array[i];
                        array[i] = temp;
                        if (i - 1 > 0) {
                            i--;
                        }
                    } else {
                        i++;
                    }
                }
                for (int value : array) {
                    System.out.print(value + ", ");
                }
            }
    }

    /*
    Example of output:

    Enter quantity of the sequence.
        7
    -57, 50, -52, -7, -4, -91, 85,
    Result after sorting:
    -91, -57, -52, -7, -4, 50, 85,

 */