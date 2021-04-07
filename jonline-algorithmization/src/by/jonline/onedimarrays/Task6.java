package by.jonline.onedimarrays;

public class Task6 {

	public static void main(String[] args) {
		double[] a = { 1.1, 1.1, 1.1, 1.1, 1.1, 1.1, 1.1, 1.1, 1.1, 1.1, 1.1, 1.1, 1.1, 1.1, 1.1, 1.1, 1.1, 1.1, 1.1,
				1.1, 1.1, 1.1, 1.1, 1.1 };
		boolean check = true;
		double sum = 0;

		for (int i = 2; i < a.length; i++) {
			check = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					check = false;
					break;
				}
			}
			if (check) {
				sum += a[i];
			}
		}
		// sum += a[i];
		System.out.printf("Сумма элементов с простыми порядковыми номерами = %.1f", sum);
	}
}
