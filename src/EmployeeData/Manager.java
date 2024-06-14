package EmployeeData;

public class Manager extends Employee { //Inheritance//
    private String department;
    private int bonus;

    public Manager(String employeeId, String name, int age, String jobTitle, int salary) {
        super(employeeId, name, age, jobTitle, salary);
    }

    // Getter for department
    public String getDepartment(){
        return department;
    }

    // Setter for department
    public void setDepartment(String department) {
        this.department = department;
    }

    //Getter for bonus
    public  int getBonus(){
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public String toString() {
        return "Manager -" +
//                "department = '" + department + '\'' +
                ", employeeId = ' " + getEmployeeId() + '\'' +
                ", name = ' " + getName() + '\'' +
                ", age = " + getAge() +
                ", jobTitle = ' " + getJobTitle() + '\'' +
                ", salary = " + getSalary() +
                ", bouns = " + getBonus() +
                ' ';
    }
}