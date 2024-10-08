import java.util.Arrays;

public class TestMyLine {
    public static void main(String[] args) {
        MyLine l1 = new MyLine(0,0,3,3);
        l1.setBeginXY(8, 4);
        l1.setEndXY(6, 10);

        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(4,4);
        MyLine l2 = new MyLine(p1,p2);

        System.out.println("Line 1 begin: " + l1.getBegin());
        System.out.println("Line 1 end: " + l1.getEnd());
        l1.setBeginXY(3, 8);
        l1.setEndXY(2, 11);
        l2.setEnd(p1);
        l2.setBegin(p2);
        System.out.println("Line 1 X-begin: " + l1.getBeginX());
        System.out.println("Line 1 X-end: " + l1.getEndX());
        System.out.println("Line 1 Y-begin: " + l1.getBeginY());
        System.out.println("Line 1 Y-end: " + l1.getEndY());
        l2.setBeginX(3);
        l2.setEndX(8);
        l2.setBeginY(7);
        l2.setEndY(12);
        System.out.println("Line 2 begin: " + Arrays.toString(l2.getBeginXY()));
        System.out.println("Line 2 begin: " + Arrays.toString(l2.getEndXY()));
        System.out.println("Line 1 length: " + l1.getLength());
        System.out.println("Line 2 gradient: " + l2.getGradient());
        System.out.println(l2.toString());

    }
}
