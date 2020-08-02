import java.util.Date;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        Vector list = new Vector(3);
        System.out.println("저장 능력" + list.capacity());
        System.out.println("저장 요소 개수" + list.size());
        list.addElement(new Integer(10));
        list.addElement(new Double(10.0));
        list.addElement(new String("자바"));
        list.addElement(new Date());
        list.addElement("자바");
        list.addElement(123.2);


        System.out.println("저장 능력" + list.capacity());
        System.out.println("저장 요소 개수" + list.size());

        if (list.contains("자바")) {
            System.out.println("\"자바\" 스트링은 " + list.indexOf("자바"));
            System.out.println("번 인덱스에 존재한다");
        }
        System.out.println("벡터에[ 저장된 요소들");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + "번째 요소는 " + list.elementAt(i));
        }
    }
}
