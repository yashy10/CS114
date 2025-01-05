
import java.awt.*;
import java.util.Scanner;

class Circles {

    Point center; //null
    double radius; //0.0

    Circles(Point center, double radius){//constructor - which allows change of values
        this.center = center;
        this.radius = radius;
    }

    double getArea() {//returns area - behavior/action
        return Math.PI * Math.pow(this.radius,2);
    }

    double getPerimeter() {//returns perimeter - behavior/action
        return 2 * Math.PI * this.radius;
    }
    void setRadius(double radius){//sets radius which is not needed since constructer is now there
        this.radius = radius;
    }
    void setCenter(Point center){
        this.center = center;
    }
    //public Circles(setRadius(newRadius),setCenter(newCenter)){
        //getArea();
        //getPerimeter();
    //}
}

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Circles c1 = new Circles(new Point(1,2), 5.0);
        System.out.println(c1.center);
        c1.center = new Point(0,0);
        c1.radius = 5.0;
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());

    }
}