package swexpertacademy;

class BadBankingException2 extends Exception {
    // Exception 클래스를 상속하여 사용자 정의 예외 클래스를 정의함.
    public BadBankingException2(String s) {
        super(s);
    }
}

public class Account2 {
    String name;
    int currentMoney;

    public Account2(String name, int currentMoney) {
        this.name = name;
        this.currentMoney = currentMoney;
    }

    public void withdraw2(int money) throws BadBankingException2 {
        if (currentMoney < money){
            throw new BadBankingException2("잔액이 부족합니다.");
        }
        currentMoney = currentMoney - money;
    }

    public String getAccountInfo() {
        return ("계좌 [이름 = " + name + ", 현재 금액: " + currentMoney + "]");
    }
}
