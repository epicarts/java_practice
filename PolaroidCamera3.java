public class PolaroidCamera3 extends Camera3 implements Printable {
    public PolaroidCamera3(String name) {
        super(name);
    }

    public void takePicture(){
        System.out.println(name + "프린터를 예열한다.");
    }

    public void print() {
        System.out.println(name + "프린터로 프린트한다.");
    }
}
