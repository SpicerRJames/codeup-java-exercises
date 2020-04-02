package shapes;

abstract class Quadrilateral extends Shape implements Measurable {

        protected double length;
        protected double width;

        public Quadrilateral(double length, double width){
            this.length = length;
            this.width = width;
        }

//    public Quadrilateral(Measurable myShape) {
//        super();
//    }

    @Override
        public double getPerimeter() {
            double perimeter = (2 * length) + (2 * width);
            return perimeter;
        }

        @Override
        public double getArea() {
            double area = length * width;
            return area;
        }

        public abstract void setLength();

        public abstract void setWidth();
    }

