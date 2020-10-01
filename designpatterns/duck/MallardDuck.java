package designpatterns.duck;

// 오리를 상속받은 Mallard오리 클래스 생성
public class MallardDuck extends Duck {

    // 생성자.
    public MallardDuck() {
        // Duck에 직접 넣어줌.
        quackBehavior = new Quack(); // MuteQuack, Squeak 등등 ..
        flyBehavior = new FlyWithWings(); //FlyNoWay 등등..
    }

    @Override
    public void display() {
        System.out.println("MallardDuck. 물오리입니다.");
    }
}
