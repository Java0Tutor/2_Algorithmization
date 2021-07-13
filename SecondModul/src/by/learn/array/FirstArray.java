package by.learn.array;

import java.util.Random;
import java.util.Scanner;

public class FirstArray {
    public static void main(String[] args){
        System.out.println("Написать в массив A[N] натуральные числа. Найти сумму тех элементов, которые кратны данному k");
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int N= random.nextInt(100);
        System.out.println("N= " + N);
        int arr[]=new int[N];
        int sum=0;
        for(int i=0; i<N;i++) arr[i]= random.nextInt(1000);
        System.out.print("введите k: ");
        int k=in.nextInt();

        for(int i=0; i<N;i++) if((arr[i]%k)==0) sum+=arr[i];
        System.out.print("сумма: "+ sum);
    }
}
