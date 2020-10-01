package designpatterns.duck;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("못나는 오리 입니다.");
    }
}
