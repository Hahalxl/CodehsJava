public class Area extends ConsoleProgram
{
        public class Rectangle {
        double length;
        double width;

        public Rectangle(double _length, double _width) {
            length = _length;
            width = _width;
        }

        public double area() {
            return (double) width * length;
        }
    }

    public void run() {
        double user_width = readDouble("What is the width of the rectangle? ");
        double user_length = readDouble("What is the height of the rectangle? ");

        Rectangle userRectangle = new Rectangle(user_length, user_width);
        System.out.println("The area of the rectangle is " + userRectangle.area() + " units squared.");
    }
}
