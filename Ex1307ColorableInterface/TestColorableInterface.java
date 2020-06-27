package be.vdab.Ex1307ColorableInterface;

public class TestColorableInterface {
    public static void main(String[] args) {
        GeometricObject[] array = new GeometricObject[5];
        array[0] = new Square(2);
        array[1] = new Square(5);
        array[2] = new GeometricObject();
        array[3] = new Square(6);
        array[4] = new Square();
        for (int i = 0; i < array.length; i++) {
            System.out.println("OBJECT NUMBER " + i);
            System.out.println("Area: " + array[i].getArea());
            if (array[i].isColorable() == true)  array[i].howToColor();
            else {
                System.out.println("This object is not colorable");
            }
        }
    }
}
