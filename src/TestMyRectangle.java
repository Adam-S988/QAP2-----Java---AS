public class TestMyRectangle {
    public static void main(String[] args) {
        MyPoint topLeft = new MyPoint(2, 0);
        MyPoint bottomRight = new MyPoint(7, 4);
        MyRectangle r1 = new MyRectangle(topLeft, bottomRight);

        double height = r1.getHeight();
        System.out.println("Height: " + height);

        double width = r1.getWidth();
        System.out.println("Width: " + width);

        double area = r1.getArea();
        System.out.println("Area: " + area);

        double perimeter = r1.getPerimeter();
        System.out.println("Perimeter: " + perimeter);

        System.out.println(r1.toString());
    }
}
