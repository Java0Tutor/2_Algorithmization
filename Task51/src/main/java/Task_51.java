/*
    Eng:
   Subtract the sum of its digits from the given number. Subtract the sum of it from the result again.
   numbers, etc. How many of these actions must be done to get zero?
   To solve the problem, use the decomposition
    Rus:
   Из заданного числа вычТи сумму его цифр. Из результата вновь вычТи сумму его
   цифр и т.д. Сколько таких действий надо произвести, чтобы получился нуль?
   Для решения задачи использовать декомпозицию
 */
class Task_51 {
    private static int countSubtraction(int number) {
        int count = 0;
        while (number > 0) {
            number -= countSumOfDigits(number);
            count++;
        }
        return count;
    }

    private static int countSumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.print(sum + ", ");
        return sum;
    }

    public static void main(String[] args) {
        int n = countSubtraction(331);
        System.out.println("\nThe quantity of the substractions: " + n);
    }
}