/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hrapp;

/**
 *
 * @author Omar
 */
public class HRApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("HR App Starts");
        
        Employee e1 = new Employee(100, "Evelyn", 47000);
        Employee e2 = new Employee(101, "Omar", 44000);        
        
        Department dept = new Department("Education");
        
        dept.addEmp(e1);
        dept.addEmp(e2);
        dept.addEmp(new Employee(102, "Ender", 45000));
        
        Employee[] emps = dept.getEmployees();
        
        for (Employee emp : emps) {
            System.out.println("Employee: " + emp);            
        }
        System.out.println("Total: " + dept.getTotalSalary());
        System.out.println("Total: " + dept.getAverageSalary());
        
        System.out.println("Employee by ID: " + dept.getEmployeeById(102));
    }    
}
