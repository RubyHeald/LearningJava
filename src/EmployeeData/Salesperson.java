package EmployeeData;

public class Salesperson extends Employee {

    private int salesTarget;

    public Salesperson(String employeeId, String name, int age, String jobTitle, int salary, int salesTarget) {
        super(employeeId, name, age, jobTitle, salary);
        this.salesTarget = salesTarget;
    }

// Getters for SalesTargets //

    public double getSalesTarget() { //Polymorphism
        return salesTarget;
    }

//Setters for salesTarget

    public void setSalesTarget(int salesTarget) {
        this.salesTarget = salesTarget;
    }
    public String toString() {

        return "SalesPerson - " +
                "salesTarget=" + salesTarget +
                ", employeeId= '" + getEmployeeId() + '\'' +
                ", name= '" + getName() + '\'' +
                ", age= " + getAge() +
                ", jobTitle= '" + getJobTitle() + '\'' +
                ", salary= " + getSalary() +
                ' ';

    }
}