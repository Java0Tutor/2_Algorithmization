# 2_Algorithmization
Описание файлов:
 -  [Practice (tasks).pdf](https://drive.google.com/file/d/1EIDMT_GgnzgORfQauELjavOSmMVfpoHK/view) - файл содержит список задач, которые нужно решить для завершения этапа.
 - Questions.pdf - файл содержит вопросы, на которые нужно уметь отвечать по завершению этапа.
 - Recommendations.pdf - файл содержит рекомендуемые материалы (видео и книги), к которым следует обратиться при возникновении трудностей при решении задач или ответах на вопросы.
 
 Решение задач
 
 ```java
 import java.util.Arrays;
import java.util.Scanner;

   1.ENG:Natural numbers are entered in the array A [N]. 
     Find the sum of those elements that are multiples of a given K.
   1. RUS: В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class Task_1 {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a size of array:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter natural number k ");
        int k = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.print(Arrays.toString(array) + "\n");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0) {
                sum = sum + array[i];
            }
        }
        System.out.print("The sum of elements that are multiples of " + k + " is " + sum);
    }
}
 ```
 __________________________________________________________________________________________________________________________________
 ```java
 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_11 {
    public static void main(String[] args) {
        /*  ENG 1. A matrix is given. Display all the odd columns
         *          whose first element is larger than the last.
         *  RUS 1. Дана матрица. Вывести на экран все нечетные столбцы,
         *          у которых первый элемент больше последнего.
         */
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter quality of strings");
            int n = Integer.parseInt(read.readLine());
            System.out.println("Enter quality of columns");
            int m = Integer.parseInt(read.readLine());
            int[][] matrix = new int[n][m];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    int positiveNegative = Math.random() < 0.5 ? -1 : 1;
                    matrix[i][j] = (int) (Math.random() * 100) * positiveNegative;
                    System.out.printf("%3d ", matrix[i][j]);
                }
                System.out.println();
            }
            System.out.println();

            //Output result of matrix
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if(j%2==0 && matrix[0][j] > matrix[n-1][j])
                      System.out.printf(" %3d", matrix[i][j]);
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
 ```
______________________________________________________________________________________________________________________________
``` java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*      Eng:
        In the numerical matrix, swap two columns of any column,
        i.e., put all the elements of one column at the corresponding
        positions of the other, and move the elements of the second to the first.
        Column numbers are entered by the user from the keyboard.
        */
/*      Rus:
        В числовой матрице поменять местами два столбца любых столбца,
        т. е. все элементы одного столбца поставить на соответствующие
        им позиции другого, а его элементы второго переместить в первый.
        Номера столбцов вводит пользователь с клавиатуры.
        */
public class Task_18 {
    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter quality of strings");
            int n = Integer.parseInt(read.readLine());
            System.out.println("Enter quality of columns");
            int m = Integer.parseInt(read.readLine());
            int[][] matrix = new int[n][m];
            int swap;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    int positiveNegative = Math.random() < 0.5 ? -1 : 1;
                    matrix[i][j] = (int) (Math.random() * 100) * positiveNegative;
                    System.out.printf("%3d ", matrix[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("Choose the number 1 of column that you want to change: ");
            int s = Integer.parseInt(read.readLine()) - 1;
            System.out.println("Choose the number 2 of column that you want to change: ");
            int z = Integer.parseInt(read.readLine()) - 1;

            for (int i = 0; i < matrix.length; i++) {
                swap = matrix[i][s];
                matrix[i][s] = matrix[i][z];
                matrix[i][z] = swap;
            }

            for (int[] array : matrix) {
                for (int element : array) {
                    System.out.printf("%3d ", element);
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
__________________________________________________________________________________________________________________________________

```
