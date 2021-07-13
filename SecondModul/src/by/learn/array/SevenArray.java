package by.learn.array;

public class SevenArray {
    public static void main(String[] args){
        System.out.println("Дана действительные числа а1,а2 ..., аn. Найти max(a1+a2n, a2+a2n-1, ...,an+an-1)");
        int N= 50;
        System.out.println("N= " + N);
        double arr[]= new double[N];
        double max=Double.MIN_VALUE;
        for(int i=0; i<N;i++) arr[i]= Math.random() * 10;

        for(int i=0, j=arr.length-1; i<j;i++, j--){
            max=Double.max(max, arr[i]+arr[j]);
        }
        System.out.print("max: "+ max);
    }
}
