class SuperClasss {
    int num1;

    public SuperClasss(){
        System.out.println("SuperClass 객체 생성");
        num1 = 100;
    }
}

class SubClasss extends SuperClasss{
    int num2;

    public SubClasss() {
        System.out.println("SuperClass 객체 생성");
        num2 = 10000;
    }
}

public class ConstructorTest {

    public static void main(String[] args) {
        SubClasss sub = new SubClasss();
        System.out.println(sub.num1);
        System.out.println(sub.num2);
    }
}

