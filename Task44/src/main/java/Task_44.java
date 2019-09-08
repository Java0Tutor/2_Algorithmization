import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
     Eng:
     Given a natural number N. Write a method (methods) to form an array whose elements
     are the digits of the number N.

     Rus:
     Дано натуральное число N. Написать метод(методы) для формирования массива,
     элементами которого являются цифры числа N
*/
class Task_44 {
    private static void creationOfArray (int m, int n) {
        int [] array = new int [m];
        for(int i = 0; i < array.length;i++){
            array[i] = n;
            System.out.printf("%d, ", array[i]);
        }
    }
    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the size of array: ");
            int m = Integer.parseInt(read.readLine());
            System.out.println("Enter number N: ");
            int n = Integer.parseInt(read.readLine());

            creationOfArray (m, n);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}