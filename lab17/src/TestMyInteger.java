public class TestMyInteger {
    public static void main(String[] args) {
        MyInteger myInt1 = new MyInteger(5);
        MyInteger myInt2 = new MyInteger(4);

        System.out.println("Testing myInt1 (value = 5):");
        System.out.println("isEven: " + myInt1.isEven());
        System.out.println("isOdd: " + myInt1.isOdd());
        System.out.println("isPrime: " + myInt1.isPrime());

        System.out.println("Testing myInt2 (value = 4):");
        System.out.println("isEven: " + myInt2.isEven());
        System.out.println("isOdd: " + myInt2.isOdd());
        System.out.println("isPrime: " + myInt2.isPrime());

        System.out.println("Static methods with myInt1:");
        System.out.println("isEven: " + MyInteger.isEven(myInt1));
        System.out.println("isOdd: " + MyInteger.isOdd(myInt1));
        System.out.println("isPrime: " + MyInteger.isPrime(myInt1));

        System.out.println("Equals tests:");
        System.out.println("myInt1.equals(5): " + myInt1.equals(5));
        System.out.println("myInt1.equals(myInt2): " + myInt1.equals(myInt2));
    }
}
