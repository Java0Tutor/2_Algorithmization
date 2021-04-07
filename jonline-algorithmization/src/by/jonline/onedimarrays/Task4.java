package by.jonline.onedimarrays;

public class Task4 {

	public static void main(String[] args) {
		double[] a = { 1.2, 23.3, Math.PI, Math.E, 12.234, 444.312, 555.222 };
		System.out.println("Исходный массив: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		double max = a[0];
		double min = a[0];
		int index1 = 0;
		int index2 = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
				index1 = i;
			}
			if (a[i] < min) {
				min = a[i];
				index2 = i;
			}
		}
		double temp = a[index1];
		a[index1] = a[index2];
		a[index2] = temp;
		System.out.println();
		System.out.println("Итоговый массив: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
