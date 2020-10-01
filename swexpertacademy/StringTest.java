package swexpertacademy;

import swexpertacademy.Mystring2;

public class StringTest {
    public static void main(String[] args) {
        Mystring2 mystr1 = new Mystring2("자바");
        System.out.println(mystr1.leftPad(10, '#'));
        System.out.println(mystr1.leftPad(5, '#'));

        Mystring2 mystr2 = new Mystring2("###자바");
        System.out.println(mystr2.leftTrim('#'));

        Mystring2 myStr3 = new Mystring2("마트");
        Mystring2 myStr4 = new Mystring2("마트");
        if (myStr3.equals(myStr4)) {
            System.out.println("두 객체의 내용이 동일함");
        }
    }
}


