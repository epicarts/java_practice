package designpatterns.duck;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack!! 꽥꽥 ");
    }
}
