package shapes;

public class MainClass {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        circle.draw();
        circle.getShapeName();
        System.out.println(circle.radius);

        Square sq = new Square(4);
        sq.draw();
        sq.getShapeName();
        System.out.println(sq.getArea());
    }
}
