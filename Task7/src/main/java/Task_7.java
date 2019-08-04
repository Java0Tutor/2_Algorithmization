import java.util.Arrays;
import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {

       // char[] charArray = { 'q', 'w', 'e', ';', 'r', 't', 'y' }; //массив символов
      //  String str = new String(charArray); //из массива символов формируется строка
      //  String[] stringArray = str.split(';', "gkl;jk"); //из строки формируется массив строк. Разделитель - символ ';'
      //  String str2 = String.join(";", stringArray); //массив строк объединяется в строку с добавлением разделителя ';'
      //  char[] charArray1 = str2.toCharArray(); //из строки формируется массив символов

        // 7. Даны действительные числа  //a a an   , , ,  1 2 . Найти max( , , , )

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a size of array: ");
        int n = scanner.nextInt();
        String [] array = new String [n];
        for (int i = 0; i < array.length; i++) {
            array[i] = String.valueOf((Math.random() * 100) - 50);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Преобразую всё в строку ");
        String stringArray = String.join(",", array);
        System.out.println(" Преобразую в массив символов ");
        System.out.println(stringArray.toCharArray());
        System.out.println("Выполню поиск макисимальную сумму элемента массива ");
        System.out.println(getMaxSum(stringArray.toCharArray()));

    }
        public static int getMaxSum(char [] array) {
        int maxSum = array[0] + array[array.length - 1];
        for (int i = 1; i < array.length / 2; i++) {
            if ((array[i] + array[array.length - i - 1]) > maxSum) {
                maxSum = array[i] + array[array.length - i - 1];
            }

        }
        return maxSum;
    }

}
