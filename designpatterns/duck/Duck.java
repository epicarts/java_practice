package designpatterns.duck;

public abstract class Duck {

    // 오리는 수영하고, 짖고, 날수 있다.
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    // 생성자
    public Duck() {
    }

    public abstract void display();

    public void swim() {
        System.out.println("헤엄치는중... 모든 오리는 수영할 수 있다.");
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

}
