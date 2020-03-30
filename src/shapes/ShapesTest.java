package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Rectangle rec = new Rectangle(5, 6);
        rec.getArea();
        rec.getPerimeter();

        System.out.println("\nThe area of the rectangle is: " + rec.getArea() + "ft");
        System.out.println("\nThe perimeter of the rectangle is: " + rec.getPerimeter() + "ft");

        Square squ = new Square(7);
        squ.Sides();
        System.out.printf("\nThe area of the square is: " + squ.Sides() + "ft");

    }
}
