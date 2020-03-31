/*Inside of your shapes directory, create a class named Rectangle. (DONE)

It should have protected properties for both length and width. Rectangle should define a constructor that accepts two
numbers for length and width, and sets those properties.

Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values. The formulas for
both follow:

perimeter = 2 x length + 2 x width
area = length x width*/

package shapes;

public class Rectangle {
    protected int length;
    protected int width;


    //This is a constructor
    public Rectangle (int newLength, int newWidth){
        this.length = newLength;
        this.width = newWidth;
    }

    //This is a method
    public int getArea() {
        int area = length * width;
        return area;
    }

    //This is also a method
    public int getPerimeter() {
        int perimeter = (2 * length) + (2 * width);
        return perimeter;
    }

}
