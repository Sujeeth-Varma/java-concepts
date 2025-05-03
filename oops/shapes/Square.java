package shapes;

public class Square extends Shape {

    int side;

    Square(int side) {
        this.side = side;
    }

    @Override
    void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    void getShapeName() {
        System.out.println("Square");
    }

    public int getArea() {
        return this.side * this.side;
    }
}
