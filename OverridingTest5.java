class Printer5{
    String name;
    int sheets;

    public void redy(){
        System.out.println(name + "프린터를 예열한다.");
    }
    public final void printLogic() {
        redy();
        for (int i = 0; i < 3; i++) {
            System.out.println(name + "로" + sheets + "장씩 출력한다.");
        }
        close();
    }
    public void close() {
        System.out.println(name + "프린터를 종료한다.");
    }
}
class DotPrinter extends Printer5 {
    int batteryGage;
}

public class OverridingTest5 {
    public static void main(String[] args) {
        DotPrinter printer = new DotPrinter();
        printer.name = "P-308";
        printer.sheets = 2;
        printer.batteryGage = 80;
        printer.printLogic();
    }
}
