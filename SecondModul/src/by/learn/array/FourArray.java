package by.learn.array;

public class FourArray {
    public static void main(String[] args) {
        System.out.println("Дана действительные числа а1,а2 ..., аn. Поменять местами наибольший и наименьший элементы.");
        int N = 10;
        double min = 0;
        double max = 0;
        System.out.println("N= " + N);
        double arr[] = new double[N];
        for (int i = 0; i < N; i++) arr[i] = Math.random() * 10;

        max= arr[0];
        min= arr[0];
        int max_i=0;
        int min_i=0;
        System.out.print("массив до замены: ");
        for (int i = 0; i < N; i++){
            if(arr[i]>max) {
                max=arr[i];
                max_i=i;
            }
            if(arr[i]<min) {
                min=arr[i];
                min_i=i;
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        arr[max_i]=min;
        arr[min_i]=max;
        System.out.print("массив после замены: ");
        for (int i = 0; i < N; i++) System.out.print(arr[i]+" ");
    }
}
