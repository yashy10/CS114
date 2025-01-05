class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }
}

class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException("The sum of any two sides must be greater than the other side.");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public String toString() {
        return "Triangle with sides: " + side1 + ", " + side2 + ", " + side3;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Triangle triangle = new Triangle(1, 3, 1);
            System.out.println(triangle);
        } catch (IllegalTriangleException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
