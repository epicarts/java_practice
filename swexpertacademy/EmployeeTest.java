package swexpertacademy;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee kim = new Employee();
        System.out.println(kim.getEmployeeInfo());

        Employee cc = new Employee(12345, "이름1");
        System.out.println(cc.getEmployeeInfo());

        Employee choi = new Employee(123456, "이름 2", 22);
        System.out.println(choi.getEmployeeInfo());
    }
}
