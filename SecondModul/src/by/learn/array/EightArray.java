package by.learn.array;

import java.util.Random;

public class EightArray {
    public static void main(String[] args){
        System.out.println("Дана последовательность целых чисел a1,a2,...,an. Образовать новую последовательность выбросив из исходной те члены которые равны min(a1,a2,...an)");
        Random random = new Random();
        int N= 20;
        System.out.println("N= " + N);
        int arr[]= new int[N];
        int min= Integer.MAX_VALUE;
        int count=0;
        System.out.print("Начальный массив: ");
        for(int i=0; i<N;i++) {
            arr[i]= random.nextInt(5);
            System.out.print(arr[i]+ " ");
        }

        //поиск min(a1,a2,...an)
        for(int i=0; i<N;i++) {
            if (arr[i]<min){
                count=1;
                min=arr[i];
            }else if(arr[i]==min){
                count++;
            }
        }


        //Новая последовательность
        int newArr[] = new int[N-count];
        System.out.println();
        System.out.print("Изменненый массив: ");
        for(int i=0,j=0; i<N;i++) {
            if (arr[i]>min){
                newArr[j]=arr[i];
                System.out.print(newArr[j]+" ");
                j++;

            }
        }
    }
}
