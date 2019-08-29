/*
    Eng:
    Two primes are called “twins” if they differ from each other
    by 2 (e.g. 41 and 43). Find and print all pairs of “twins” from the segment
    [n, 2n], where n is a given positive integer greater than 2. To solve the problem
    use decomposition.
    
    Rus:
    Два простых числа называются «близнецами», если они отличаются друг от друга
    на 2 (например, 41 и 43). Найти и напечатать все пары «близнецов» из отрезка
    n,2n], где n - заданное натуральное число больше 2. Для решения задачи
    использовать декомпозицию.
 */

class Task_47 {

    private static int [][] findTwin (int n) {
        int [][] twinNumbers = new int[n - 1][2];
        for (int i = 0; i < twinNumbers.length; i++) {
            twinNumbers[i][0] = n + i;
            twinNumbers[i][1] = twinNumbers[i][0] + 2;
        }
        return twinNumbers;
    }

    private static void printMatrix (int [][] square) {  //вывод матрицы
        for (int[] array : square) {
            for (int element : array) {
                System.out.printf("%2d ", element);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 40;
        int [][] twinNumbers = findTwin(n);
        System.out.printf("Numbers \"Twins\" on the distance from %d till %d:%n", n, n * 2);
        printMatrix(twinNumbers);
    }
}