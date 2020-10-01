package designpatterns.duck;

//모형 오리 클래스
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay(); // 날지못하고
        quackBehavior = new MuteQuack(); // 짖지 못합니다.
    }

    @Override
    public void display() {
        System.out.println("모형 오리입니다.");
    }
}
