public class PromotionTest {
    public static void main(String args[]){
        byte b1 = 127;
        char c1 = '가';
        int i1;
        double d1;
        System.out.println("자동 형변환의 결과");

        i1 = b1;
        System.out.println("i1(int) = b1(byte) 형변환: " + i1);

        i1 = c1;
        System.out.println("i1(int) = c1(char) 형변환: " + i1);

        d1 = i1;
        System.out.println("d1(double) = i1(int) 형변환: " + d1);

        char c2 = 44032;
        System.out.println("44032 를 c(char) 형변환: " + c2);

        char c3 = 44033;
        System.out.println("44033 를 c(char) 형변환: " + c3);

        char c4 = 44034;
        System.out.println("44034 를 c(char) 형변환: " + c4);

        char c5 = 65;
        System.out.println("44032 를 c(char) 형변환: " + c5);

        char c6 = 29616;
        System.out.println("29616 를 c(char) 형변환: " + c6);

        char c7 = 65535;
        System.out.println("65535 를 c(char) 형변환: " + c7);

        char c8 = 0;
        System.out.println("0 를 c(char) 형변환: " + c8);

        char c9 = '\u205C';
        System.out.println("'\\u205C' 를 c(char) 형변환: " + c9);
    }
}
