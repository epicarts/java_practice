import java.util.Calendar;
import java.util.Formatter;

public class FormatterTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        Formatter formatter = new Formatter(sb);
        Calendar c = Calendar.getInstance();
        int i = 10;
        int j = 20;
        int k = i + j;
        String str = "연산결과";

        formatter.format("%s%n", str);
        formatter.format("%d + %d = %d %n", i, j, k);
        formatter.format("%tk시 %tM분 %tS초 입니다", c, c, c);
        System.out.println(formatter.toString());
    }

}
