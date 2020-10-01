package swexpertacademy;

class BadBankingException extends Exception {
    // Exception 클래스를 상속하여 사용자 정의 예외 클래스를 정의함.
    public BadBankingException(String s) {
        super(s);
    }
}

class Account {
    String name;
    int currentMoney;

    public Account(String name, int currentMoney) {
        this.name = name;
        this.currentMoney = currentMoney;
    }

    public void withdraw(int money) throws BadBankingException {
        if (currentMoney < money) {
            throw new BadBankingException("잔액이 부족합니다.");
        }
        currentMoney = currentMoney - money;
    }

    public String toString() {
        return "계좌 [이름 = " + name + ", 현재 금액: " + currentMoney + "]";
    }
}

public class CustomExceptionTest {
    public static void main(String[] args) {
        try {
            Account choiAccount = new Account("최영호" , 1000);
            choiAccount.withdraw(1500);
            System.out.println(choiAccount.toString());
        } catch (BadBankingException e) {
            System.out.println(e.getMessage());
        }
    }
}
