package swexpertacademy;

import java.util.Vector;

public class GenericsTest {
    public static void main(String[] args) {
        Vector<Integer> list = new Vector<Integer>();
        list.addElement(new Integer(100));
        list.addElement(new Integer(23));
        list.addElement(new Integer(13));

        int sum = 0;
        for (int i = 0; i < list.size(); i++ ){
            Integer score = list.elementAt(i);
            sum = sum + score.intValue();
        }
        System.out.println("점수의 총합: " + sum);
    }
}
