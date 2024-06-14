package EmployeeData;

import java.util.HashMap;
import java.util.Map;


//Public = accessed from outside its package (needed for other packages)//
public class EmpDatabase {
    private static Map<String, Employee> employeeMap; //private - can only be accessed from within the package
    static {
    employeeMap = new HashMap<>(); //A HashMap is created to store keys & values i.e name: A123//
    }

    //Constructor - this constructor will be called whenever a new instance of EmployeeData is created//
    public EmpDatabase(){
    };

    //MAPPING//
    //Map is an interface that represents a collection of key-value pairs i.e. adding, removing, get, set, put//

    //ADD EMPLOYEE TO THE DATABASE//
    public static void addEmployee(Employee employee) {
        employeeMap.put(employee.getEmployeeId(), employee);
    }

        //REMOVE EMPLOYEE FROM THE DATABASE//
        public void removeEmployee(String employeeId){
            employeeMap.remove(employeeId);
        }

        //RETRIEVE EMPLOYEE RECORD//
        public Employee getEmployee(String employeeId){
            return employeeMap.get(employeeId);
        }

        //GET ALL EMPLOYEES - Iterating//
    //The map's entries are iterated over using a for-each loop, and each key-value pair is printed//
        public void displayAllEmployees(){
        for(Employee employee : employeeMap.values()){
            System.out.println(employee);
        }
        }
}
