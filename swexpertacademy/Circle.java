package swexpertacademy;

public class Circle extends Shape {
    int radius;

    public Circle(int x, int y, int radius) {
        super(x,y);
        this.radius = radius;
    }

    public void draw() {
        super.draw();
        System.out.println("radius = " + radius + " 인 원을 그린다.");
    }
}
