// GeometricObject.java

public class GeometricObject {
    private String color;
    private boolean filled;

    // No-arg constructor for the GeometricObject class
    public GeometricObject() {
        this.color = "white";
        this.filled = false;
    }

    // Constructor with specified color and filled properties
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Accessor method for color
    public String getColor() {
        return color;
    }

    // Mutator method for color
    public void setColor(String color) {
        this.color = color;
    }

    // Accessor method for filled
    public boolean isFilled() {
        return filled;
    }

    // Mutator method for filled
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Method to return a string representation of the GeometricObject class
    @Override
    public String toString() {
        return "GeometricObject: color = " + color + ", filled = " + filled;
    }
}
