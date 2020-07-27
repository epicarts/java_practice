public class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public void draw(){
        super.draw();
        System.out.println("width = " + width + ", height = " + height + "인 사각형을 그린다.");
    }
}
