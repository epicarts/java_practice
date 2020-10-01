package swexpertacademy;

interface Drawable {
    public int PLAIN_PEN = 1;
    public int BOLD_PEN = 2;
    public int ITALIC_PEN = 3;
    public void draw();
    public void move(int x, int y);
}

class Shape2 {
    int x = 0;
    int y = 0;

    Shape2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Circle2 extends Shape2 implements Drawable {
    int radius;
    Circle2(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public void draw() {
        System.out.println("(" + x + ", " + y + ") radius = " + radius);
    }

    public void move(int x, int y) {
        System.out.println("(" + (this.x + x) + " " + (this.y + y) + ")" +
                "radius = " + radius);
    }
}

class Rectangle2 extends Shape2 implements Drawable {
    int width;
    int height;
    Rectangle2(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public void draw() {
        System.out.println("(" + x + ", " + y + ") width = " + width + "," +
                "height = " + height);
    }

    public void move(int x, int y) {
        System.out.println("(" + (this.x + x) + ", " + (this.y + y) +
                ") width = " + width + ", height = " + height);
    }
}

public class InterfaceTest1 {
    public static void main(String args[]) {
        Circle2 c = new Circle2(10, 10, 100);
        c.draw();
        c.move(5, 5);

        Rectangle2 r = new Rectangle2(20, 20, 50, 50);
        r.draw();
        r.move(5, 10);

        System.out.println("형변환");

        Drawable d = new Circle2(10, 10, 100);
        d.draw();
        d.move(5,5);

        d = new Rectangle2(20, 20, 50, 50);
        d.draw();
        d.move(5, 10);
    }
}