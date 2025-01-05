public class ClassA {
    private int x;
    public ClassA(int x) {
        this.x = x;
    }
    public ClassA() {
    }
    public static void main(String[] args) {
        ClassB b = new ClassB();
    }
}
class ClassB extends ClassA{
    public ClassB() {
    }
}