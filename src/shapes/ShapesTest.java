/*
Test your code by creating a new class, ShapesTest (also inside of shapes) with a main method. Inside the main method,

-create a variable of the type Rectangle named box1 and assign it a new instance of the
Rectangle class with a width of 4 and a length of 5

-verify that the getPerimeter and getArea methods return 18 and 20, respectively.

-create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.

-verify that the getPerimeter and getArea methods return 20 and 25, respectively.
*/

package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4, 5);
        box1.getArea();
        box1.getPerimeter();

        System.out.println("\nThe area of the rectangle is: " + box1.getArea() + "ft");
        System.out.println("\nThe perimeter of the rectangle is: " + box1.getPerimeter() + "ft");

        Rectangle box2 = new Square(5);
//        box2.sides();
        System.out.printf("\nThe area of the square is: " + box2.getArea() + "ft");

    }
}
