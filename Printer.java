public abstract class Printer {
    String name;

    public Printer(String name) {
        this.name = name;
    }

    public abstract void ready();
}
