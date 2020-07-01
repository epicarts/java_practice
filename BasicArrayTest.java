public class BasicArrayTest {
    public static void main(String args[]) {
        int[] scoreList; //데이터 타입으로 된 일차원 배열 선언
        scoreList = new int[5]; //선언된 배열 변수에 5개의 정수를 저장할 수 있는 배열객체를 생성. 주소값 할당

        scoreList[0] = 80;
        scoreList[1] = 95;
        scoreList[2] = 68;
        scoreList[3] = 100;
        scoreList[4] = 54;

        System.out.println("socreList의 길이 = " + scoreList.length);

        System.out.println("< scoreList 배열 요소 출력 >");
        System.out.print(scoreList[0] + "\t");
        System.out.print(scoreList[1] + "\t");
        System.out.println(scoreList[2] + "\t");

        //String 타입으로 된 일차원 배열 선언.
        String nameList[];
        nameList = new String[3];//3개의 문자열을 저장할 수 있는 배열 객체 생성

        nameList[0] = "Java";
        nameList[1] = "sql";
        nameList[2] = "Servlet";
        System.out.println("nameList 길이 = " + nameList.length);

        System.out.println("< nameList 배열 요소 출력 >");
        System.out.print(scoreList[0] + "\t");
        System.out.print(scoreList[1] + "\t");
        System.out.println(scoreList[2] + "\t");
    }
}
