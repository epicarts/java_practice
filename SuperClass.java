abstract public class SuperClass {
    //    부모 클래스가 추상
    public void methodA() {
        System.out.println("mothodA() 실행");
    }

    public abstract void methodB();
}

class SubClass extends SuperClass{
    public void methodB() {
        // 자식 클래스가 부모 클래스를 재정의
        System.out.println("methodB 실행");
    }
}
