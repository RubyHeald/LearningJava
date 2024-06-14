package EmployeeData;

import java.util.HashMap;
import java.util.Map;

public class EmpDatabase {
    private static Map<String, Employee> employeeMap;
    static {
        employeeMap = new HashMap<>();
    }
    public EmpDatabase(){
    };

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

        //GET ALL EMPLOYEES//
        public void displayAllEmployees(){
        for(Employee employee : employeeMap.values()){
            System.out.println(employee);
        }
        }

}
