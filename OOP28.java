public class OOP28 {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle(1, 2, 5);
        MyCircle c2 = new MyCircle(new MyPoint(4, 5), 3);
        System.out.println("Hình tròn c1: " + c1);
        System.out.println("Hình tròn c2: " + c2);
        System.out.println("Diện tích của c1: " + c1.getArea());
        System.out.println("Chu vi của c1: " + c1.getCircumference());
        System.out.println("Khoảng cách giữa tâm c1 và c2: " + c1.distance(c2));
        c1.setRadius(10);
        c1.setCenterXY(0, 0);
        System.out.println("\nSau khi thay đổi bán kính và tâm của c1:");
        System.out.println("Hình tròn c1: " + c1);
        System.out.println("Diện tích mới của c1: " + c1.getArea());
        System.out.println("Chu vi mới của c1: " + c1.getCircumference());
    }
}
