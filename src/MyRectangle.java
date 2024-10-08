public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    //Constructors
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    //Methods
    public double getHeight() {
        return bottomRight.getY() - topLeft.getY();
    }

    public double getWidth() {
        return bottomRight.getX() - topLeft.getX();
    }

    public double getArea() {
        return getHeight()*getWidth();
    }

    public double getPerimeter(){
        return (getHeight()*2)+(getWidth()*2);
    }

    public String toString(){
        return "MyRectangle: [TopLeft=" + topLeft.toString() + ", BottomRight=" + bottomRight.toString() +"]";
    }
}