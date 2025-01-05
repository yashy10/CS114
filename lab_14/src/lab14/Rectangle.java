package lab14;

public class Rectangle {

    double width;
    double height;
    String color;

    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
        this.color = "white";
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        this.color = "white";
    }

    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public String getColor() {
        return color;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimiter() {
        return (2 * (width + height));
    }
}
