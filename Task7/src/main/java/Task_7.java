import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_7 {
    public static void main(String[] args) {

     //7. Даны действительные числа a 1 , a 2 ,  , a n . Найти
        //max( a 1 + a 2 n , a 2 + a 2 n − 1 ,  , a n + a n + 1 ) .
        int [] mas;
        int n, i, j;
        int max;

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Enter the size of array n: ");
            n = Integer.parseInt(reader.readLine());

            //инициализация и заполнение массива рандомными значениями от -1000 до 1000
            mas = new int[n];
            for (i = 0; i < mas.length; i++) {
                int sing = Math.random() < 0.5 ? -1 : 1;
                mas[i] = (int) (Math.random() * 1000) * sing;
                System.out.print(mas[i]+", ");
            }

            i = 0;
            j = mas.length - 1;
            max = Integer.MIN_VALUE;
            for (; i < j; i++, j--) {
                max = Integer.max(mas[i] + mas[j], max);
            }

            System.out.println("\nmax value is " + max);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
