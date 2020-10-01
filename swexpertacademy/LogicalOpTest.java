package swexpertacademy;

public class LogicalOpTest {
    public static void main(String arg[]) {
        int num1 = 9;
        int num2 = 2;
        int num3 = 0;
        System.out.println((num1 == num2) && ((num1 / num3) > 0));
//        System.out.println((num1 == num2) & ((num1 / num3) > 0));
        System.out.println((num1 != num2) || ((num1 / num3) > 0));
//        System.out.println((num1 == num2) | ((num1 / num3) > 0));

        int[] scoreList = new int[100];
        scoreList[0] = 1;
        scoreList[99] = 2;

        System.out.println(scoreList[0]);
        System.out.println(scoreList[99]);

        scoreList[100] = 98;
        System.out.println(scoreList[100]);
    }
}
