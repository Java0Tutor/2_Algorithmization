import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    Даны дроби p1/q1, p2/q2, ..., pn/qn (pi, qi - натуральнае). Составить программу,
    которая приводит эти дроби к общему знаменателю и упорядочивает их в  порядке возрастания.
 */

public class Task_34 {
    public static void main(String[] args) {
        Fraction [] array = {new Fraction(1, 3), new Fraction(2, 4),
                new Fraction(7, 12), new Fraction(5, 12),
                new Fraction(12, 3), new Fraction(17, 24),
                new Fraction(5, 6), new Fraction(13, 3)};

        setCommonDenominator(array);
        sortFractionArray(array);
        for (Fraction element : array) {
            System.out.print(element + ", ");
        }
        System.out.print("\b\b");
    }

    private static void setCommonDenominator (Fraction [] array) {
        boolean isCommon = false;
        int commonDenominator = 0;
        while (!isCommon) {
            isCommon = true;
            commonDenominator++;
            for (Fraction element : array) {
                if (commonDenominator % element.denom != 0) {
                    isCommon = false;
                    break;
                }
            }
        }

        for (Fraction element : array) {
            element.numer *= (double) commonDenominator / element.denom;
            element.denom = commonDenominator;
        }
    }

    private static void sortFractionArray (Fraction [] array) {
        for (int i = array.length - 1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j].numer > array[j + 1].numer) {
                    Fraction temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    static class Fraction {
        int numer;
        int denom;
        Fraction(int numer, int denom) {
            this.numer = numer;
            this.denom = denom;
        }

        @Override
        public String toString() {
            return String.format("%d/%d", numer, denom);
        }
    }

}