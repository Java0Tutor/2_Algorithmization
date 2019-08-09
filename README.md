# Algorithmization
Описание файлов:
 - Practice (tasks).pdf - файл содержит список задач, которые нужно решить для завершения этапа.
 - Questions.pdf - файл содержит вопросы, на которые нужно уметь отвечать по завершению этапа.
 - Recommendations.pdf - файл содержит рекомендуемые материалы (видео и книги), к которым следует обратиться при возникновении трудностей при решении задач или ответах на вопросы.
 
 Решение задач
 
 ```java
 import java.util.Arrays;
import java.util.Scanner;

// 1.ENG:Natural numbers are entered in the array A [N]. 
     Find the sum of those elements that are multiples of a given K.
// 1. RUS: В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

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
 
 ```
