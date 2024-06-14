package EmployeeData;

public class Manager extends Employee { //Inheritance
    private String department;
    public Manager(String employeeId, String name, int age, String jobTitle, int salary, String department) {
        super(employeeId, name, age, jobTitle, salary);
        this.department = department;
    }

    // Getter for department
    public String getDepartment(){
        return department;
    }

    // Setter for department
    public void setDepartment(String department) {
        this.department = department;
    }

    public String toString() {
        return "Manager -" +
                "department = '" + department + '\'' +
                ", employeeId = ' " + getEmployeeId() + '\'' +
                ", name = ' " + getName() + '\'' +
                ", age = " + getAge() +
                ", jobTitle = ' " + getJobTitle() + '\'' +
                ", salary = " + getSalary() +
                ' ';
    }
}