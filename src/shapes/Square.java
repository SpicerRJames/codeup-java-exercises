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

public class Square extends Rectangle {

    private int side;
    public Square (int squSize){
        super();
        side = squSize;
        length = side;
        width = side;
    }

    public int Sides(){
        int area = side * side;
        return area;
    }
}
