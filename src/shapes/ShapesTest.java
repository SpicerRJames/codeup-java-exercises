/*
Test your code by creating a new class, ShapesTest (also inside of shapes) with a main method. Inside the main method,

-create a variable of the type Rectangle named box1 and assign it a new instance of the
Rectangle class with a width of 4 and a length of 5

-verify that the getPerimeter and getArea methods return 18 and 20, respectively.

-create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.

-verify that the getPerimeter and getArea methods return 20 and 25, respectively.
*/

package shapes;

import org.w3c.dom.ls.LSOutput;

public class ShapesTest {

//    static Measurable myShape = new Measurable(){
//        @Override
//        public double getPerimeter() {
//            System.out.println("Shapes Test 1");
//            return 5;
//        }
//
//        @Override
//        public double getArea() {
//            System.out.println("Shapes Test 1");
//            return 10;
//        }
//    };

    public static void main(String[] args) {
        Measurable myShape;


//        Modify your ShapesTest class, use it to:
//
//        declare a variable of the type Measurable named myShape.
//        Test your code by creating instances of both Square and Rectangle and assigning them to myShape so you can display the shape's area and perimeter.


        Rectangle box1 = new Rectangle(3, 9);
        myShape = box1;
        box1.getArea();
        box1.getPerimeter();
//
        System.out.println("\nThe area of the rectangle is: " + myShape.getArea() + "ft");
//        System.out.println("\nThe perimeter of the rectangle is: " + box1.getPerimeter() + "ft");
//
//        Rectangle box2 = new Rectangle(5, 7);
//        System.out.println("\nThe area of the square is: " + box2.getArea() + "ft");







//        Rectangle box1 = new Rectangle(4, 5);
//        box1.getArea();
//        box1.getPerimeter();
//
//        System.out.println("\nThe area of the rectangle is: " + box1.getArea() + "ft");
//        System.out.println("\nThe perimeter of the rectangle is: " + box1.getPerimeter() + "ft");
//
//        Rectangle box2 = new Rectangle(5, 7);
//        System.out.println("\nThe area of the square is: " + box2.getArea() + "ft");

    }
}
