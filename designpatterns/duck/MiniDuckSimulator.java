package designpatterns.duck;

//오리 시뮬레이터
public class MiniDuckSimulator extends MallardDuck {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("\n");
        Duck model = new ModelDuck();
        model.performQuack();
        model.performFly(); // 생성자를 이용해 초기화.

        //세터를 사용해 이후에도 변경.
        model.setFlyBehavior(new FlyRocketPowered()); //로켓 객체를 생성하여 참조값을 전달.
        model.performFly();
    }
}
