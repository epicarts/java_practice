public class Shape {
    int x;
    int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw() {
        System.out.println("(" + x + ", " + y + ") 좌표에 도형을 그린다");
   }
}
