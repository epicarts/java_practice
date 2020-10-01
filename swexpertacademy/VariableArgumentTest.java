package swexpertacademy;

public class VariableArgumentTest {
    public static double scoreSum(double... score){
        double sum = 0;
        for (int i=0; i < score.length; i++ ){
            sum = sum + score[i];
        }
        return sum;
    }

    public static void main(String args[]){
        System.out.println("국어 점수 총합: " + scoreSum(80, 60, 90));
        System.out.println("영어 점수 총합: " + scoreSum(80, 100));
        System.out.println("자바 점수 총합: " + scoreSum(54, 2 , 3, 4));
    }
}
