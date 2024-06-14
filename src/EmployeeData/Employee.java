package EmployeeData;

public class Employee {
    private String employeeId;
    private String name;
    private int age;
    private String jobTitle;
    private int salary;

    public Employee(String employeeId, String name, int age, String jobTitle, int Salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    //GETTERS & SETTERS//
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Employee - " +
                "employeeId = '" + employeeId + '\'' +
                ", name = '" + name + '\'' +
                ", age = " + age +
                ", jobTitle = '" + jobTitle + '\'' +
                ", salary = " + salary +
                '\'';
    }
}
