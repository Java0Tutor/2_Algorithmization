package by.learn.array;

import java.util.Scanner;

public class SecondArray {
    public static void main(String[] args){
        System.out.println("Дана последовательность действительных чисел а1,а2 ..., аn. Заменить все ее члены, большие данного числа Z этим числом. Подсчитать количество замен.");
        Scanner in = new Scanner(System.in);
        int N= 20;
        int count=0;
        System.out.println("N= " + N);
        double arr[]=new double[N];
        for(int i=0; i<N;i++) arr[i]= Math.random()*10;
        System.out.print("введите Z: ");
        double z=in.nextDouble();
        System.out.print("масив: ");

        for (int i=0; i<N;i++){
            if(arr[i]>z){
                count++;
                arr[i]=z;
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Количество замен = "+ count);
    }
}
