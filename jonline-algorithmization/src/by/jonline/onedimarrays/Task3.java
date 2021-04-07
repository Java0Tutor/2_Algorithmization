package by.jonline.onedimarrays;

public class Task3 {

	public static void main(String[] args) {
		int[] a = { 1, -1, 0, 2, 3, -5, 0, 5, 6, 0, -4, -7, 3, -3 };
		int positive = 0;
		int negative = 0;
		int zero = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0)
				positive++;
			else if (a[i] == 0)
				zero++;
			else
				negative++;
		}
		System.out.println("Количество положительных элементов = " + positive);
		System.out.println("Количество нулевых элементов = " + zero);
		System.out.println("Количество отрицательных элементов = " + negative);
	}

}
