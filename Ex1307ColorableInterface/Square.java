package be.vdab.Ex1307ColorableInterface;

public class Square extends GeometricObject implements Colorable {
    private double side;

    Square() {};
    Square(double side) {
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public boolean isColorable() {
        setColorable(true);
        return super.isColorable();
    }

    public void howToColor() {
        System.out.println("Color at four sides");
    }
    public double getArea() {
        return side*side;
    }
}
