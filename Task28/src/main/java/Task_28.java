import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    ENG:
    Two sequences a1 <= a2 <= a3 <= aN and b1 <= b2 <= b3 <= bM are given. To form a new sequence from them
    numbers so that it is also non-decreasing. Note. Do not use an additional array.

    RUS:
    Даны две последовательности a1<=a2<=a3<=aN и b1<=b2<=b3<=bM. Образовать из них новую последовательность
    чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
*/

public class Task_28 {
    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter quantity the elements of first sequence: ");
            int n = Integer.parseInt(read.readLine());
            int[] firstArray = new int[n + 1];

            for (int i = 1; i < firstArray.length; i++) {
                firstArray[i] = firstArray[i - 1] + 1;
                System.out.print(firstArray[i] + ", ");
            }

            System.out.println("\n\nEnter quantity the elements of second sequence: ");
            int m = Integer.parseInt(read.readLine());
            int[] secondArray = new int[m + 1];

            for (int i = 1; i < secondArray.length; i++) {
                secondArray[i] = secondArray[i - 1] + 2;
                System.out.print(secondArray[i] + ", ");
            }

           int[] joinArray = new int[firstArray.length + secondArray.length];

            for (int i = 0; i < joinArray.length; i++) {
                if (i < firstArray.length) {
                    joinArray[i] = firstArray[i];
                } else {
                    joinArray[i] = secondArray[i - firstArray.length];
                }
            }

            for (int i = joinArray.length - 1; i > 0 ; i--) {
                for (int j = 0; j < i; j++) {
                    if (joinArray[j] > joinArray[j + 1]) {
                        int temp = joinArray[j];
                        joinArray[j] = joinArray[j + 1];
                        joinArray[j + 1] = temp;
                    }
                }
            }
            System.out.println("\n\nNew sequence: ");
            for(int value : joinArray){
                System.out.print(value+ ", ");
            }

                  } catch(IOException e){
                        e.printStackTrace();
        }
    }
}

