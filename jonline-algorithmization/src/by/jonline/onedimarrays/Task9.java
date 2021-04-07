package by.jonline.onedimarrays;

public class Task9 {

	public static void main(String[] args) {

		int[] data = { 7, 1, 5, 2, 3, 5, 4, 7, 5, 8, 2, 9, 10, 7 };

		int[] counter = new int[data.length];// количество повторений
		boolean[] check = new boolean[data.length];// флаг, чтобы не проверять повторяющиеся элементы

		for (int i = 0; i < data.length; i++) { // поиск повторяющихся элементов
			if (!check[i]) {
				for (int j = i + 1; j < data.length; j++) {
					if (!check[j]) {
						if (data[i] == data[j]) {
							check[j] = true;
							counter[i]++;
						}
					}
				}
			}
		}

		int greatestVal = 0;
		int greatestCount = 0;
		for (int i = 0; i < counter.length; i++) {// поиск элемента с максимальным числом повторений
			if (counter[i] > greatestCount) { // и максимальным значением
				greatestCount = counter[i];
				greatestVal = data[i];
			}
			if ((greatestCount == counter[i]) && (data[i] > greatestVal)) {
				greatestVal = data[i];
			}
		}
		System.out.printf("Максимальное число повторений и максимальное значение у элемента " + greatestVal);

	}

}
