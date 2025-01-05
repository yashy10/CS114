public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    public boolean isPrime() {
        if (value <= 1) return false;
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    public static boolean isEven(MyInteger myInt) {
        return myInt.isEven();
    }

    public static boolean isOdd(MyInteger myInt) {
        return myInt.isOdd();
    }

    public static boolean isPrime(MyInteger myInt) {
        return myInt.isPrime();
    }

    public boolean equals(int otherValue) {
        return this.value == otherValue;
    }

    public boolean equals(MyInteger other) {
        return this.value == other.value;
    }

    public static void main(String[] args) {
        MyInteger myInt = new MyInteger(7);

        System.out.println("Value: " + myInt.getValue());
        System.out.println("Is Even? " + myInt.isEven());
        System.out.println("Is Odd? " + myInt.isOdd());
        System.out.println("Is Prime? " + myInt.isPrime());

        MyInteger anotherInt = new MyInteger(10);
        System.out.println("Static Is Even? " + MyInteger.isEven(anotherInt));
        System.out.println("Static Is Odd? " + MyInteger.isOdd(anotherInt));
        System.out.println("Static Is Prime? " + MyInteger.isPrime(anotherInt));

        System.out.println("Equals 7? " + myInt.equals(7));
        System.out.println("Equals another MyInteger(7)? " + myInt.equals(new MyInteger(7)));
    }
}
