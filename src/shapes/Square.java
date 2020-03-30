/*Create a class named Square, also inside of shapes, that extends Rectangle. Square should define a constructor that
accepts one argument, side, and calls the parent's constructor to set both the length and width to
the value of side.

Test your code by creating a new class, ShapesTest (also inside of shapes) with a main method. Inside
the main method,

create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle
class with a width of 4 and a length of 5
verify that the getPerimeter and getArea methods return 18 and 20, respectively.

create a variable of the type Rectangle named box2 and assign it a new instance of the Square class
that has a side value of 5. verify that the getPerimeter and getArea methods return 20 and 25, respectively.
In the Square class, override the getArea and getPerimeter methods with the following definitions for
a square*/

package shapes;

public class Square {

    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.getArea();
        rec.getPerimeter();

        System.out.println("\nThe area of the rectangle is: " + rec.getArea() + "ft");
        System.out.println("\nThe perimeter of the rectangle is: " + rec.getPerimeter() + "ft");

    }
}
