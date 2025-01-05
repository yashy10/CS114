package lab13;

public class Geometry {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
        double[][] points = new double[3][2];
        for (int i = 0; i < 3; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        double area = getTriangleArea(points);

        if (area == 0) {
            System.out.println("The three points are on the same line.");
        } else {
            System.out.printf("The area of the triangle is %.2f%n", area);
        }
    }

    public static double getTriangleArea(double[][] points) {
        double a = distance(points[0], points[1]);
        double b = distance(points[1], points[2]);
        double c = distance(points[2], points[0]);

        if (a + b <= c || a + c <= b || b + c <= a) {
            return 0;
        }

        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static double distance(double[] point1, double[] point2) {
        return Math.sqrt(Math.pow(point2[0] - point1[0], 2) + Math.pow(point2[1] - point1[1], 2));
    }
}
