/**
 * 파일명: CommentsTest.java
 * 작성일: 2013/12/24
 */

/* 다음 클래스는 다음과 같은 두 줄의 내용을 출력하는
자바 프로그램이다.
 */

public class CommentsTest{

    static String s = "출력될 내용은 다음과 같습니다\n";

    //두 번째 줄에 내용을 출력하는 메서드 선언
    static String getMessage() {
        return "처음 작성한 자바 프로그램";
    }
    public static void main(String args[]) {
        System.out.println(s + getMessage());//도스 창 출력
    }
}