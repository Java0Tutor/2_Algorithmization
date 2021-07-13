package by.learn.array;


import java.util.Random;

public class TenArray {
    public static void main(String[] args){
        System.out.println("Дан целочисленный массив с количеством элементом n. Сжать массив, выбросив из него каждый второй элемент(освободившиеся элементы заполнить нулями). " +
                "Примечание. Дополнительный массив не использовать");
        Random random = new Random();
        int N= 10;
        int even=0;
        if((N%2)!=0) even=1;//проверка на четность массива
        System.out.println("N= " + N);
        int arr[]=new int[N];
        int x;
        System.out.print("Массив:              ");
        for(int i=0; i<N;i++) {
            arr[i]= random.nextInt(10);
            System.out.print(arr[i]+ " ");
        }

        //Выбрасываем каждый второй элемент
        System.out.println();
        System.out.print("Выброс каждого 2-го: ");
        for (int i=1; i<N;i+=2) arr[i]=0;
        for(int i=0; i<N;i++) System.out.print(arr[i]+ " ");

        //Сжатие массива
        System.out.println();
        System.out.print("Сжатый массив:       ");
        for (int i=0, y=1;i<(N/2)+even;i++,y++){
            for (int j=1+i;j<N-y;j++){
                x=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=x;
                }
            }
        for(int i=0; i<N;i++) System.out.print(arr[i]+ " ");

    }
}
