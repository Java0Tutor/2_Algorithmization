package by.jonline.onedimarrays;

public class Task8 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, -44, 5, 6, 7, -44, -10, -44, -22 };
		System.out.println("Исходный массив");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}
		System.out.println();

		int min = a[0];
		int counter = 0;

		for (int i = 0; i < a.length; i++) {// поиск минимального элемента
			if (a[i] < min) {
				min = a[i];
				counter = 0;
			}
			if (a[i] == min) {// находим количество минимальных элементов
				counter++;
			}
		}

		int[] b = new int[a.length - counter];// размерность нового массива без минимальных элементов

		for (int i = 0, j = 0; i < a.length; i++) {// присваиваем все элементы исходнего массива, кроме минимальных
			if (a[i] != min) {
				b[j] = a[i];
				j++;
			}
		}

		System.out.println("Конечный массив массив");
		for (int i = 0; i < b.length; i++) {
			System.out.print(" " + b[i]);
		}
	}

}
