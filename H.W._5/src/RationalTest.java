import java.util.Scanner;

class Rational {
    private int numerator;
    private int denominator;

    public Rational() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            this.numerator = 0;
            this.denominator = 1;
        } else {
            int gcd = gcd(numerator, denominator);
            this.numerator = numerator / gcd;
            this.denominator = denominator / gcd;
            if (this.denominator < 0) {
                this.numerator = -this.numerator;
                this.denominator = -this.denominator;
            }
        }
    }

    public Rational add(Rational other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational subtract(Rational other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational multiply(Rational other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational divide(Rational other) {
        if (other.numerator == 0) {
            return new Rational(0, 1);
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Rational(newNumerator, newDenominator);
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}

public class RationalTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter numerator for the first rational number: ");
        int num1 = input.nextInt();
        System.out.print("Enter a non-zero denominator for the first rational number: ");
        int den1 = input.nextInt();
        Rational r1 = new Rational(num1, den1);

        System.out.print("Enter numerator for the second rational number: ");
        int num2 = input.nextInt();
        System.out.print("Enter a non-zero denominator for the second rational number: ");
        int den2 = input.nextInt();
        Rational r2 = new Rational(num2, den2);

        System.out.println("First rational number is: " + r1);
        System.out.println("Second rational number is: " + r2);

        System.out.println("Addition of the rational numbers is: " + r1.add(r2));
        System.out.println("Subtraction of the rational numbers is: " + r1.subtract(r2));
        System.out.println("Multiplication of the rational numbers is: " + r1.multiply(r2));
        System.out.println("Division of the rational numbers is: " + r1.divide(r2));

        input.close();
    }
}
