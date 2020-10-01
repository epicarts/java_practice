package swexpertacademy;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {
    public static void main(String[] args) {
        Vector list = new Vector(3);
        list.addElement(new Integer(10));
        list.addElement(new Double(10.0));
        list.addElement(new String("자바"));

        Enumeration e = list.elements();
        System.out.println();
        System.out.println("Enumerateion 요소들");
        while (e.hasMoreElements()) {
            System.out.println("e의 요소 :" + e.nextElement());
        }
    }
}