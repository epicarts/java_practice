package designpatterns.duck;

//작은 오리
public class MiniDuckSimulator extends  MallardDuck {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }
}
