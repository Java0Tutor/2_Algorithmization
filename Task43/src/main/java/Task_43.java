import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
  Eng:
  Given the numbers X, Y, Z, T - the lengths of the sides of the quadrangle. Write a method (s)
  computing its area if the angle between the sides of length X and Y is a straight line.
  
  Rus:
  Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы)
  вычисления его площади, если угол между сторонами длиной X и Y— прямой.
*/
class Task_43 {
    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the sizes of sides quadrangle: ");
            System.out.println("x = ");
            int x = Integer.parseInt(read.readLine());
            System.out.println("y = ");
            int y = Integer.parseInt(read.readLine());
            System.out.println("z = ");
            int z = Integer.parseInt(read.readLine());
            System.out.println("t = ");
            int t = Integer.parseInt(read.readLine());

            System.out.println("The area of quadrangle is: ");
            double quadrilateral = (float) calculateSquare(x, y, z, t);
            System.out.println(quadrilateral);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static double calculateSquare(double x, double y, double z, double t) {
        double diagonal = Math.sqrt(x * x + y * y);
        double s1 = x * y / 2;
        double p = (diagonal + z + t) / 2;
        double s2 = Math.sqrt(p * (p - diagonal) * (p - z) * (p - t));
        return s1 + s2;
    }
}