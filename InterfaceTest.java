public class InterfaceTest {
    public static void main(String[] args) {
        Printable printer = new Dotprinter2("JV-5600");
        printer.print();

        printer = new PolaroidCamera3("인닥스 미니7S");
        printer.print();
    }
}
