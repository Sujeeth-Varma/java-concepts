package shapes;

// Inheritance
class Circle extends Shape {

    int radius;
    
    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    void getShapeName() {
        System.out.println("Circle");
    }

    public double getArea() {
        return 3.14 * this.radius * this.radius;
    }
}
