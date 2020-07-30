public class ExceptionHandlerTest {
    public static void main(String args[]) {
        System.out.println("프로그램 시작.. ");
        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            System.out.println("나누기 결과: " + num1 / num2);
        } catch (ArithmeticException e) {
            System.out.println("정수를 0으로 나눌 수는 없습다");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("명령행 매개변수 2개가 필요합니다");
        } catch (NumberFormatException e) {
            System.out.println("매개변수는 정수만 허용됩니다.");
        } catch (Exception e) {
            System.out.println("프로그램 수행 중 문제 발생");
        } finally {
            System.out.println("무조건 실행됨");
        }
        System.out.println("프로그램 종료.. ");
    }
}
