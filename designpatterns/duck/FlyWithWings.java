package designpatterns.duck;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly. 하늘을 난다!!");
    }
}
