<<<<<<< HEAD
import java.util.Arrays;
import java.util.Scanner;
=======
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
>>>>>>> Task_7

public class Task_7 {
    public static void main(String[] args) {

<<<<<<< HEAD
<<<<<<< HEAD
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
=======
     //7. Даны действительные числа a 1 , a 2 ,  , a n . Найти
=======
        //7. Даны действительные числа a 1 , a 2 ,  , a n . Найти
>>>>>>> Task_8
        //max( a 1 + a 2 n , a 2 + a 2 n − 1 ,  , a n + a n + 1 ) .
        int[] array;
        int n, i, j;
        int max;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the size of array n: ");
            n = Integer.parseInt(reader.readLine());
            //инициализация и заполнение массива рандомными значениями от -1000 до 1000
            array = new int[n];
            for (i = 0; i < array.length; i++) {
                int negPos = Math.random() < 0.5 ? -1 : 1;
                array[i] = (int) (Math.random() * 1000) * negPos;
                System.out.print(array[i] + ", ");
            }
            i = 0;
            j = array.length - 1;
            max = Integer.MIN_VALUE;
            for (; i < j; i++, j--) {
                max = Integer.max(array[i] + array[j], max);
            }
            System.out.println("\nmax value is " + max);
        } catch (IOException e) {
            e.printStackTrace();
        }
<<<<<<< HEAD


>>>>>>> Task_7
=======
>>>>>>> Task_8
    }
}
