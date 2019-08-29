import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
     Eng:
     The natural numbers K and N are given. Write a method (methods) of forming the array A,
	 whose elements are numbers whose sum of digits is equal to K and which are not
     greater than N.

      Rus:
      Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
      элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
*/
class Task_46 {

    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the number K: ");
            int k = Integer.parseInt(read.readLine());
            System.out.println("Enter the number N: ");
            int n = Integer.parseInt(read.readLine());

            int [] array = createArray(k, n);

            System.out.println("The result is: ");
            printArray(array);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static int [] createArray (int k, int n) {
        int [] array = new int[k];
        int i;
        for (i = 0; i < array.length && k > n; i++) {
            array[i] = (int) (Math.random() * n) + 1;
            k -= array[i];
        }
        array[i] = k;
        int [] arrayA = new int[i + 1];
        System.arraycopy(array, 0, arrayA, 0, i + 1);
        return arrayA;
    }

    private static void printArray (int [] array) {  //вывод массива
        for (int element : array) {
            System.out.printf("%3d ", element);
        }
    }
}
