package lab14;


public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4, 40);
        Rectangle rect2 = new Rectangle(3.5, 35.9);

        rect1.setColor("white");
        rect2.setColor("white");

        System.out.println("Rectangle 1:");
        System.out.println("Width: " + rect1.getWidth() + ", Height: " + rect1.getHeight());
        System.out.println("Area: " + rect1.getArea() + ", Perimeter: " + rect1.getPerimiter());

        System.out.println("Rectangle 2:");
        System.out.println("Width: " + rect2.getWidth() + ", Height: " + rect2.getHeight());
        System.out.println("Area: " + rect2.getArea() + ", Perimeter: " + rect2.getPerimiter());
    }
}
