package swexpertacademy;

abstract class TV2{
    public abstract void powerOn();
    public abstract void powerOff();
    public abstract void volumeUp();
    public abstract void volumeDown();
}

public class AnonymousTest {
    public static void watchTV(TV2 tv){
        tv.powerOn();
        tv.volumeUp();
        tv.volumeDown();
        tv.powerOff();
    }

    public static void main(String[] args) {
        watchTV(new TV2() {
            public void powerOn(){
                System.out.println("swexpertacademy.TV --- 전원을 켠다.");
            }
            public void powerOff(){
                System.out.println("swexpertacademy.S_TV --- 전원을 끈다.");
            }
            public void volumeUp(){
                System.out.println("swexpertacademy.S_TV --- 소리를 높인다.");
            }
            public void volumeDown(){
                System.out.println("swexpertacademy.S_TV --- 소리를 낮춘다.");
            }
        });
    }
}
