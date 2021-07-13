package by.learn.array;

import java.util.Random;

public class NineArray {
    public static void main(String[] args){
        System.out.println("В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел несколько, то определить наименьшее из них.");
        Random random = new Random();
        int N= 30;
        System.out.println("N= " + N);
        int arr[]=new int[N];
        int count[]= new int[N];; //количество раз встречающихся чисел в массиве arr
        System.out.print("Массив:      ");
        for(int i=0; i<N;i++) {
            arr[i]= random.nextInt(10);
            System.out.print(arr[i]+ " ");
        }

        //Высчитываем сколько раз встречается
        System.out.println();
        System.out.print("Встречается: ");
        for (int i=0; i<N;i++){
            for (int j=0; j<N;j++){
                if (arr[i]==arr[j]){
                    count[i]++;
                }
            }
            System.out.print(count[i]+ " ");
        }

        //Поиск
        int min=arr[0];
        int count_min=count[0];
        for (int i=0; i<N;i++){
            if(count[i]>count_min){
                min=arr[i];
                count_min=count[i];
            }else if(count[i]==count_min && arr[i]<min) min=arr[i];
        }
        System.out.println();
        System.out.println("Наименьшее число "+min+" который встречается "+ count_min);
    }
}
