public class OOP26 {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(0,0);
        System.out.println("Point 1: " + p1);
        MyPoint p2 = new MyPoint(3, 4);
        System.out.println("Point 2: " + p2);
        System.out.println("Distance from p1 to (3,4): " + p1.distance(3, 4));
        System.out.println("Distance from p1 to p2: " + p1.distance(p2));
        System.out.println("Distance from p2 to (0,0): " + p2.distance());
        p1.setXY(6, 8);
        System.out.println("Point 1 new position: " + p1);
        System.out.println("Distance from p1 to (0,0): " + p1.distance());
    }
}
