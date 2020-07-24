public class CallByReferenceTest {
    public static void main(String[] args) {
        int[] scoreList = {40, 78, 98};
        System.out.println("reference address1: " + scoreList);
        System.out.println("reference score: " + scoreList[0]);

        changeScore(scoreList);

        System.out.println("reference address3: " + scoreList);
        System.out.println("reference score: " + scoreList[0]);
    }

    private static int[] changeScore(int[] scoreList) {
        scoreList[0] = 100;

        System.out.println("reference address2: " + scoreList);

        return scoreList;
    }
}
