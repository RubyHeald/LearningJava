import EmployeeData.*;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("A123", "Ash Jones", 33, "Power Station Leader", 88000);
        Manager manager1 = new Manager("B123", "Ruby Heald", 31, "Software Engineer", 30000);
        Salesperson salesp1 = new Salesperson("C123", "Clementine Jones", 10, "Sales Person", 500, 150000);
        Salesperson salesp2 = new Salesperson("D123", "Cecelia Jones", 7, "Sales Person", 500, 150000);

        //BONUS TASK TO CREATE EMPLOYEE DATABASE//
        EmpDatabase empDatabase = new EmpDatabase();

        //ADD EMPLOYEES TO THE DATABASE//
        EmpDatabase.addEmployee(emp1);
        EmpDatabase.addEmployee(manager1);
        EmpDatabase.addEmployee(salesp1);
        EmpDatabase.addEmployee(salesp2);

        //ADD ALL EMPLOYEES TO DATABASE//
        System.out.println("All Employees in the Database");
        empDatabase.displayAllEmployees();

        //RETRIEVE A SINGLE EMPLOYEE//
        System.out.println("Retrieving employee ID");
        System.out.println((emp1));

        //REMOVE EMPLOYEE//
        System.out.println("Removing Employee ID from the Database");
        empDatabase.removeEmployee(emp1.getEmployeeId());

        //ADD BONUS//
        System.out.println("Bonus added to Employee ID B123");
        manager1.setBonus(1000);

        //REMAINING EMPLOYEES LEFT IN THE DATABASE AFTER THE REMOVAL//
        System.out.println("Amendment complete, updated Database below");
        empDatabase.displayAllEmployees();

//        //TASK 1 WORK//
//        System.out.print(manager1);
//        //UPDATE DEPARTMENT FOR THE MANAGER//
//        manager1.setDepartment("Management Dept");
//        //UPDATE SALES TARGETS FOR SALESPERSONS//
//        salesp1.setSalesTarget(100000);
//        salesp2.setSalesTarget(100000);
//        //EMPLOYEES AFTER AMENDMENTS//
//        System.out.println("Employees updated");
//        System.out.println(manager1);
//        System.out.println(emp1);
//        System.out.println(salesp1);
//        System.out.println(salesp2);
    }
}