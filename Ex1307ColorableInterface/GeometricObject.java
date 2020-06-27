package be.vdab.Ex1307ColorableInterface;

public class GeometricObject {

    private String color = "white";
    private boolean filled;
    private boolean colorable = false;
    private java.util.Date dateCreated;

    // Construct a default geometric object
    public GeometricObject() {
        dateCreated = new java.util.Date();
    }

    /* Construct a geometric object with the specified color
     * and filled value */
    public GeometricObject(String color, boolean fil0led) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public boolean isColorable() {
        return colorable;
    }
    public void setColorable(boolean colorable) {
        this.colorable = colorable;
    }
    public java.util.Date getDateCreated() {
        return dateCreated;
    }
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }
    public double getArea() {
        return 0.0;
    }
    public void howToColor() {};
}




