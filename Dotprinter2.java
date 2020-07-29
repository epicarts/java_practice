public class Dotprinter2 extends Printer implements Printable {
    public Dotprinter2(String name) {
        super(name);
    }

    public void ready(){
        System.out.println(name + "프린터를 예열한다.");
    }

    public void print() {
        System.out.println(name + "프린터로 프린트한다.");
    }
}
