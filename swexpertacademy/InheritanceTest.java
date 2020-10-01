package swexpertacademy;

import swexpertacademy.Circle;

public class InheritanceTest {
    public static void main(String[] args) {
        System.out.println("원을 그린다");
        Circle c = new Circle(100, 50, 200);
        c.draw();
        System.out.println("사각형을 그린다");
        Rectangle r = new Rectangle(100, 200, 300,200);
        r.draw();
    }
}
