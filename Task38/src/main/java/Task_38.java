import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
        Eng:
        On the plane, n matrix are given by their coordinates.
		Write a method (s) defining between which of the pairs of matrix
		the greatest distance. Indication Coordinates of matrix to put in an array.

        Rus:
        На плоскости заданы своими координатами n точек.
        Написать метод(методы), определяющие, между какими из пар точек
        самое большое расстояние. Указание. Координаты точек занести в массив.
*/
class Task_38 {
    private static double maxDistance;

    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter quality of strings");
            int n = Integer.parseInt(read.readLine());
            System.out.println("Enter quality of columns");
            int m = Integer.parseInt(read.readLine());
            int[][] matrix = new int[n][m];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    int positiveNegative = Math.random() < 0.5 ? -1 : 1;
                    matrix[i][j] = (int) (Math.random() * 100) * positiveNegative;
                    System.out.printf("%3d ", matrix[i][j]);
                }
                System.out.println();
            }
            int [] result = findMaximumDistance(matrix);
            System.out.printf("Maximum distance between of points is %d and %d, that equals %.2f %n",
                    result[0], result[1], maxDistance);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static double distanceCounter (int [][] matrix) {
        return Math.sqrt(Math.pow((matrix[0][0] - matrix[1][0]), 2)
                + Math.pow((matrix[0][1] - matrix[1][1]), 2));
    }
    private static int [] findMaximumDistance (int [][] matrix) {
        int [] result = new int[2];
        double distance;
        maxDistance = 0;
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                int [][] currentPoints = {{matrix[i][0], matrix[i][1]},
                        {matrix[j][0], matrix[j][1]}};
                distance = distanceCounter(currentPoints);
                if (distance > maxDistance) {
                    maxDistance = distance;
                    result[0] = i + 1;
                    result[1] = j + 1;
                }
            }
        }
        return result;
    }
}
