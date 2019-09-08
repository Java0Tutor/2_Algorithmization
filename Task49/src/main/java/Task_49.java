/*
    Eng:
 Find all natural n-digit numbers in which the numbers form a strictly increasing
 sequence (for example, 1234, 5789). To solve the problem, use decomposition.
    Rus:
  Найти все натуральные n-значные числа, цифры в которых образуют строго
  возрастающую последовательность (например, 1234, 5789). Для решения задачи
 использовать декомпозицию.
 */

class Task_49 {
    private static void findNumbers (int n) {
        int [] number = new int[n];
        number[0] = 1;
        while (number[n - 1] < 9) {
            for (int i = 1; i < number.length; i++) {
                number[i] = number[0] + i;
            }
            for (int element : number) {
                System.out.print(element);
            }
            System.out.print(", ");
            number[0]++;
        }
        System.out.println("\b\b");
    }

    public static void main(String[] args) {
        findNumbers(2);
        findNumbers(3);
        findNumbers(4);
        findNumbers(5);
        findNumbers(6);
        findNumbers(7);
        findNumbers(8);
        findNumbers(9);

    }
}