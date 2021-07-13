package by.learn.array;

public class SixArray {
    public static void main(String[] args){
        System.out.println("Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются простыми числами");
        int N= 50;
        System.out.println("N= " + N);
        double arr[]= new double[N];
        double sum=0;
        for(int i=0; i<N;i++) arr[i]= Math.random() * 10;

        for(int i=0; i<N;i++){
            int x=0;
            for(int j=2; j<i;j++) {
                if ((i%j)==0) {
                    x++;
                    break;
                }
            }
            if(x==0)sum+=arr[i];
        }
        System.out.println("Сумма: "+ sum);

    }
}
