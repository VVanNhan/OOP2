public class OOP27 {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(4, 6);
        MyLine line = new MyLine(p1, p2);
        System.out.println("Line: " + line);
        System.out.println("Length: " + line.getLength());
        System.out.println("Gradient: " + line.getGradient());
        line.setEndXY(10, 12);
        System.out.println("Updated Line: " + line);
        System.out.println("Updated Length: " + line.getLength());
        System.out.println("Updated Gradient: " + line.getGradient());
    }
}
