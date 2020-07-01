public class VariableDemo {
    int sum; //전역 변수

    public void addScore(int javaScore) {
        int score = javaScore; // 지역변수
        sum = sum + score;
    }

    public int getSum() {
        return sum;
    }
}
