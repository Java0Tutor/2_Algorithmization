package by.jonline.onedimarrays;

public class Task7 {

	public static void main(String[] args) {
		double[] a = { 1.1, 2.1, 2.2, 2.3, 3.1, 4.1, 3.2, 3.9, 4.2, 5.2, 10, 10.1 };
		double max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];

			}
		}
		System.out.println(max);
	}

}
