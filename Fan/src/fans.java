public class fans {

    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5.0;
    private String color = "blue";

    public fans(){
        //initializes default values
    }

    //accessor Methods
    public int getSpeed(){
        return speed;
    }
    public boolean getOn(){
        return on;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }

    //mutator methods
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setOn (boolean on){
        this.on = on;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }

    //string
    public String toString(){
        if (on){
            System.out.println("Speed: " + speed + ", Color: " + color + ", Radius is: " + radius + ", Fan is on");
        }else{
            System.out.println("Speed: " + speed + ", Color: " + color + ", Radius is: " + radius + ", Fan is off");
        }
        return "";
    }
}
