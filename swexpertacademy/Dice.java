package swexpertacademy;

public class Dice {
    public static int dotCount = 6;

    public static String playGame() {
        return "생성된 숫자 : " + rollingDice();
    }

    public static int rollingDice() {
        int generatedNum = (int) (Math.random() * dotCount ) + 1;
        return generatedNum;
    }
}
