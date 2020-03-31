/*Create a class named Square, also inside of shapes, that extends Rectangle. Square should define a constructor that
accepts one argument, side, and calls the parent's constructor to set both the length and width to
the value of side.

Test your code by creating a new class, ShapesTest (also inside of shapes) with a main method. Inside
the main method,*/

package shapes;

public class Square extends Quadrilateral {

//    private int side;
    public Square (int squSize){
        super(squSize, squSize);
//        side = squSize;
    }

    @Override
    public void setLength() {
        System.out.println("Square setLength");
    }

    @Override
    public void setWidth() {
        System.out.println("Square setWidth");
    }



//    public int sides(){
//        int area = side * side;
//        return area;
//    }
}
