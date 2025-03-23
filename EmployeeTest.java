//Ass 2
//Q.1
import java.util.Scanner;

class Employee {
    
    private static int nextId = 1;

    private int id;
    private String name;
    private double salary; 
    private int experience;
    private String department;

   
    public Employee(int nextId ,String name, double salary, int experience, String department) {
        this.id = nextId++;
        this.name = name;
        this.salary = salary;
        this.experience = experience;
        this.department = department;
    }

   
    public double getYearlySalary() {
        return salary * 12; 
    }

    
    public void applyRaise() {
        salary *= 1.10; 
    }


    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Department: " + department);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(102,"Ram", 6000, 3, "Cse");
        Employee employee2 = new Employee(103,"Om", 8000, 4, "AIML");

        System.out.println("\nYearly Salary of Employee 1 before raise: " + employee1.getYearlySalary());
        System.out.println("Yearly Salary of Employee 2 before raise: " + employee2.getYearlySalary());

        employee1.applyRaise();
        employee2.applyRaise();

        System.out.println("\nYearly Salary of Employee 1 after 10% raise: " + employee1.getYearlySalary());
        System.out.println("Yearly Salary of Employee 2 after 10% raise: " + employee2.getYearlySalary());

        System.out.println("\nEmployee 1 Information:");
        employee1.displayEmployeeInfo();

        System.out.println("\nEmployee 2 Information:");
        employee2.displayEmployeeInfo();
        
       
    }
}
/*Output:
Yearly Salary of Employee 1 before raise: 72000.0
Yearly Salary of Employee 2 before raise: 96000.0

Yearly Salary of Employee 1 after 10% raise: 79200.00000000001
Yearly Salary of Employee 2 after 10% raise: 105600.0

Employee 1 Information:
Employee ID: 102
Name: Ram
Salary: 6600.000000000001
Experience: 3 years
Department: Cse

Employee 2 Information:
Employee ID: 103
Name: Om
Salary: 8800.0
Experience: 4 years
Department: AIML
*/