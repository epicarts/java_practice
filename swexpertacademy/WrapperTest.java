package swexpertacademy;

public class WrapperTest {
    public static void main(String args[]) {
        Boolean b1 = new Boolean("TrUE");
        Boolean b2 = new Boolean("???");
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        Double d = new Double(10.0);

        System.out.println("Boolean 객체" + b1);
        System.out.println("Boolean 객체" + b2);
        System.out.println("Integer 객체" + i1);
        System.out.println("Double 객체" + d);

        System.out.println("int 의 최대값 : " + Integer.MAX_VALUE);
        System.out.println("int 의 최소값: " + Integer.MIN_VALUE);

        if(i1.equals(i2)) System.out.println("같다");
        System.out.println("a문자가 대문자 인가: " + Character.isUpperCase('a'));
        System.out.println("-1의 이진수: " + Integer.toBinaryString(-1));
        System.out.println("String 3.14를 실수로 변환" + Double.parseDouble("3.14"));


        String companyName1 = "자바전자";
        String companyName2 = "자바전자";

        String depName1 = new String("마케팅");
        String depName2 = new String("마케팅");

        System.out.println(companyName1.hashCode() + " " + companyName2.hashCode());
        if (companyName1 == companyName2) {
            System.out.println("컴퍼니 네임 둘이 같음. == 주소 같음.");
        }
        if (depName1 == depName2) {
            System.out.println("depName 이 같음. == 주소 같음");
        }

        String sr1 = 123 + "sadf";
        System.out.println(sr1);

        char[] charArr = { 'J', 'a', 'v', 'a'};
        byte[] byteArr = { 65, 66, 67, 68, 69};

        String str1 = new String(charArr);
        String str2 = new String(charArr, 0, 2); //2개의 문자만 추출. 0 ~ 2

        String str3 = new String("Program");
        String str4 = new String(byteArr);

        //
        System.out.println(str1.toString());
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        String compName = "Java JDJ";
        System.out.println(compName.concat("Program"));
        System.out.println(compName.toLowerCase());
        System.out.println(compName.toUpperCase());
        System.out.println(compName.length());
        System.out.println(compName.startsWith("Ja"));
        System.out.println(compName.endsWith("va"));
        System.out.println(compName.equals("Java JDJ"));
        System.out.println(compName.equalsIgnoreCase("java jdj"));//대소문자 무시 동일 확인
        System.out.println(compName.charAt(0));// 맨앞 문자열
        System.out.println(compName.charAt(compName.length() - 1)); //맨뒤 문자열
        System.out.println(compName.lastIndexOf("va"));//va 문자열의 인덱스 윛치를 확인함. 인덱스 검색은 뒤에서부
        System.out.println(compName.substring(0, 7));
        System.out.println(compName.substring(3));
        System.out.println(compName.replace('J', 'j'));


        String com = "회사명: ";
        com.concat("자바전자");
        System.out.println(com);

        StringBuffer combuff = new StringBuffer("회사명: ");
        combuff.append("자바전자");
        System.out.println(combuff);

        StringBuffer str = new StringBuffer("java");

        System.out.println("Capacity : " + str.capacity());
        System.out.println("Length : " + str.length());

        str.append(" language");
        System.out.println("문자열 결합 후 Capacitiy : " + str.capacity());
        System.out.println("문자열 결합 후 Length : " + str.length());

        System.out.println(str.toString());
        str.insert(5, "program ");
        System.out.println(str.toString());
    }
}
