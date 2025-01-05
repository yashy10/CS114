public class QuizException {
    public static void main(String[] args) {
        try {
            method1();
            System.out.println("statement1");
        }
        catch(Exception ex) {
            System.out.println("caught in main method");
        }
        System.out.println("statement2");
    }
    public static void method1() {
        try {
            method2();
            System.out.println("statement3");
        }
        catch(ArithmeticException ex) {
            System.out.println("Arithmetic Exception: method1()");
        }
        System.out.println("statement4");
    }
    public static void method2() {
        try {
            method3();
            System.out.println("statement5");
        }
        catch(IndexOutOfBoundsException ex) {
            System.out.println("Index out of bounds: method2()");
        }
        System.out.println("statement6");
    }
    public static void method3() {
        int[] x = new int[5];
        int z = 1/0;
    }
}