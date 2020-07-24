public class Employee {
    String name;
    int age;
    int salary;
    int employeeNo;

    //기본 생성자 형태의 생성자
    public Employee() {
        this(0, "익명", 0, 0);
    }

    public Employee(int employeeNo, String name) {
        this.employeeNo = employeeNo;
        this.name = name;
    }

    public Employee(int employeeNo, String name, int age) {
        this(employeeNo, name);
        this.age = age;
    }

    public Employee(int employeeNo, String name, int age, int salary) {
        this(employeeNo, name, age);
        this.salary = salary;
    }

    public String getEmployeeInfo() {
        return null;
    }
}
