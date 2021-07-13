package by.learn.array;

import java.util.Random;

public class FiveArray {
    public static void main(String[] args){
        System.out.println("Даны целые числа а1,а2 ..., аn. Вывести на печать только те числа для которых ai>i.");
        Random random = new Random();
        int N= 50;
        System.out.println("N= " + N);
        int arr[]=new int[N];
        for(int i=0; i<N;i++) arr[i]= random.nextInt(50);

        System.out.print("Числа: ");
        for(int i=0; i<N;i++) if (arr[i]>i) System.out.print(arr[i]+" ");
    }
}
