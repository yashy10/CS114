package Rectangle;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(){
    this.width = 1.0;
    this.height = 1.0;
    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return (this.width * 2) + (this.height * 2);
    }

    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }


}
