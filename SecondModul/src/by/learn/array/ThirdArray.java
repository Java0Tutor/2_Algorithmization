package by.learn.array;


public class ThirdArray {
    public static void main(String[] args){
        System.out.println("Дана массив действительных чисел размерность которого N. Подсчитать сколько в нем отрицательных, положительных и нулевых элементов");
        int N= 20;
        int max=0;
        int min=0;
        int zero=0;
        System.out.println("N= " + N);
        double arr[]=new double[N];
        for(int i=0; i<N;i++) arr[i]= (Math.random()*20)-10;
        for(int i=0; i<N;i++){
            if(arr[i]>0) max++;
            else if (arr[i]<0) min++;
            else zero++;
        }
        System.out.println("положительных= "+max+"; отрицательных= "+min+"; нулевых= "+zero);

    }
}
