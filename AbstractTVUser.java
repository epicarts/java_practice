abstract class TV{
    public abstract void powerOn();
    public abstract void powerOff();
    public abstract void volumeUp();
    public abstract void volumeDown();
}

class S_TV extends TV {
    public void powerOn(){
        System.out.println("S_TV --- 전원을 켠다.");
    }
    public void powerOff(){
        System.out.println("S_TV --- 전원을 끈다.");
    }
    public void volumeUp(){
        System.out.println("S_TV --- 소리를 높인다.");
    }
    public void volumeDown(){
        System.out.println("S_TV --- 소리를 낮춘다.");
    }
}

class L_TV extends TV {
    public void powerOn(){
        System.out.println("L_TV --- 전원을 켠다.");
    }
    public void powerOff(){
        System.out.println("L_TV --- 전원을 끈다.");
    }
    public void volumeUp(){
        System.out.println("L_TV --- 소리를 높인다.");
    }
    public void volumeDown(){
        System.out.println("L_TV --- 소리를 낮춘다.");
    }
}

class TVFactory {
    public TV getTV(String tvName) {
        if(tvName.equals("S사")) {
            return new S_TV();
        }
        else if(tvName.equals("L사")) {
            return new L_TV();
        }
        return null;
    }
}

public class AbstractTVUser {
    public static void main(String[] args) {
        TVFactory factory = new TVFactory();
        TV tv = factory.getTV(args[0]);
        //S_TV tv = new S_TV();
        //L_TV tv = new L_TV();
        tv.powerOn();
        tv.volumeUp();
        tv.volumeDown();
        tv.powerOff();
    }
}
