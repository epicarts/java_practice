package swexpertacademy;

import java.util.Objects;

public class Employee {
    String name;
    int age;
    int salary;
    int employeeNo;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", employeeNo=" + employeeNo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                salary == employee.salary &&
                employeeNo == employee.employeeNo &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary, employeeNo);
    }

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
