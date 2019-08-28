import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
/*      Eng:
        Calculate the area of a regular hexagon with side (a)
        using the method of calculating the area of a triangle.
 
        Rus:
        Вычислить  площадь  правильного  шестиугольника  со  стороной  а,
        используя  метод  вычисления  площади треугольника.
*/

class Task_37 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the side of hexagon: ");
            double a = Double.parseDouble(reader.readLine());
            System.out.println("The area of hexagon: ");
            System.out.printf("%.1f", squareCounter(a));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static double squareCounter(double a) {
        return (3 * Math.sqrt(3) * Math.pow(a, 2)) / 2;
    }
}