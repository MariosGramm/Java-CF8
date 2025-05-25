package gr.aueb.cf.ch12;

public class PointMain {
    public static void main(String[] args) {


        Point p1 = new Point(1, 3);
        Point p2 = new Point(5, 2);

        p1.setX(4);

        p2.setY(10);

        Point p3 = new Point(20,50);

        System.out.println(Point.getNumberOfPoints());

    }
}
