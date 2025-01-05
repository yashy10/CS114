import java.util.Scanner;

class Complex {
    private double realPart;
    private double imaginaryPart;

    public Complex() {
        this.realPart = 0.0;
        this.imaginaryPart = 0.0;
    }

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public Complex add(Complex other) {
        return new Complex(this.realPart + other.realPart, this.imaginaryPart + other.imaginaryPart);
    }

    public Complex subtract(Complex other) {
        return new Complex(this.realPart - other.realPart, this.imaginaryPart - other.imaginaryPart);
    }

    @Override
    public String toString() {
        return "(" + this.realPart + ", " + this.imaginaryPart + ")";
    }
}

public class ComplexTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter real part of the first complex number: ");
        double real1 = input.nextDouble();
        System.out.print("Enter imaginary part of the first complex number: ");
        double imaginary1 = input.nextDouble();
        Complex c1 = new Complex(real1, imaginary1);

        System.out.print("Enter real part of the second complex number: ");
        double real2 = input.nextDouble();
        System.out.print("Enter imaginary part of the second complex number: ");
        double imaginary2 = input.nextDouble();
        Complex c2 = new Complex(real2, imaginary2);

        System.out.println("First complex number is: " + c1);
        System.out.println("Second complex number is: " + c2);

        Complex additionResult = c1.add(c2);
        System.out.println("Addition of the complex numbers is: " + additionResult);

        Complex subtractionResult = c1.subtract(c2);
        System.out.println("Subtraction of the complex numbers is: " + subtractionResult);

        input.close();
    }
}
