package swexpertacademy;

import swexpertacademy.Dice;

public class StaticTest {
    public static void main(String[] args) {
        System.out.println("눈이 " + Dice.dotCount + "개인 주사위를 굴린다.");
        System.out.println(Dice.playGame());
    }
}
