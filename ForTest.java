import java.util.Vector;

public class ForTest {
    public static void main(String[] args) {
        int[] scoreList = { 50, 45, 99, 85, 100 };
        int scoreSum = 0;
        for (int score : scoreList) {
            scoreSum = scoreSum + score;
        }
        System.out.println("점수의 총합: " + scoreSum);


        Vector<String> subjectList = new Vector<String>();
        subjectList.add("자바");
        subjectList.add("C++");
        subjectList.add("Servlet");

        for (String subject : subjectList) {
            System.out.println(subject);
        }
    }
}
