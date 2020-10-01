package swexpertacademy;

class Camera2 {
    String name;
    int sheets;

    public void takePicture() {
        System.out.println(name + "로 " + sheets + "번 사진을 찍는다 ");
    }
}

class PolaroidCamera2 extends Camera2 {
    int batteryGage;

    public void takePicture() {
        System.out.println(name + "로 " + sheets + "번 사진을 찍는다 ");
        System.out.println(sheets + "장의 사진을 프린트. ");
        System.out.println("현재 배터리" + batteryGage);

    }
}

public class OverridingTest2 {
    public static void main(String[] args) {
        PolaroidCamera2 camera = new PolaroidCamera2();
        camera.name = "X-508";
        camera.sheets = 3;
        camera.batteryGage = 57;
        camera.takePicture();
    }
}
