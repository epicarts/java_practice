import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        Date currentDate = new Date();//현재 시스템 시간으로 객체생성
        long start = currentDate.getTime();

        System.out.println(currentDate.toString());
        System.out.println(currentDate.toLocaleString());

        currentDate = new Date();
        long end = currentDate.getTime();
        System.out.println("프로그램 수행에 걸린시간: " + (end - start + "(ms)초"));
    }
}
