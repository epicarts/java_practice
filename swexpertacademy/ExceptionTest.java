package swexpertacademy;

import swexpertacademy.Account2;
import swexpertacademy.BadBankingException2;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            Account2 hongAccount = new Account2("홍길동", 100);
            hongAccount.withdraw2(50);
            System.out.println(hongAccount.currentMoney);
            hongAccount.getAccountInfo();
            hongAccount.withdraw2(100);
            hongAccount.getAccountInfo();
        } catch (BadBankingException2 e) {
            System.out.println(e);
        }
    }
}
