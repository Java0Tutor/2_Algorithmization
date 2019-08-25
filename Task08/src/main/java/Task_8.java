import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
        Rus 8. Дана последовательность целых чисел a 1 , a 2 ,  , a n . Образовать новую последовательность, выбросив из
        исходной те члены, которые равны min( a 1 , a 2 ,  , a n ) .
        Eng 8.Given a sequence of integers a 1, a 2, , a n. Form a new sequence by throwing out
         the initial terms are those that are min (a 1, a 2, , a n).
*/
public class Task_8 {
    public static void main(String[] args) {
        try (BufferedReader rd = new BufferedReader(new InputStreamReader(System.in))) {
            int[] firstArray;
            int min, n, count;
            int[] secondArray;
            System.out.println("Enter the size for array :");
            n = Integer.parseInt(rd.readLine());
            //filling array of random values
            firstArray = new int[n];
            for (int i = 0; i < firstArray.length; i++) {
                int sing = Math.random() < 0.5 ? -1 : 1;
                firstArray[i] = (int) (Math.random() * 100) * sing;
                System.out.print(firstArray[i] + ",");
            }
            //lets find min value and determinate of amount
            min = Integer.MAX_VALUE;
            count = 0;
            for (int element : firstArray) {
                if (element < min) {
                    min = element;
                    count = 1;
                } else if (element == min) {
                    count++;
                }
            }
            //initialization and filling new array
            secondArray = new int[firstArray.length - count];
            for (int i = 0, j = 0; i < firstArray.length; i++, j++) {
                if (firstArray[i] != min) {
                    secondArray[j] = firstArray[i];
                } else {
                    j--;
                }
            }
            System.out.printf("%n%n The value last array: %d%n", min);
            //Output new array
            System.out.println("\n New array:");
            for (int element : secondArray)
                System.out.printf("%3d ", element);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}