package gr.aueb.cf.ch13;

public class MainPoint {

    public static void main(String[] args) {
        PointXYZ p1 = new PointXYZ(2,5,1);
        PointXYZ p2 = new PointXYZ(7,10,3);

        System.out.println("Point p1:");
        System.out.println(p1.getXZDistance());
        System.out.println(p1.getYZDistance());
        System.out.println(p1.getXYZDistance());
        System.out.println();
        System.out.println("Point p2:");
        System.out.println(p2.getXZDistance());
        System.out.println(p2.getYZDistance());
        System.out.println(p2.getXYZDistance());
    }
}
