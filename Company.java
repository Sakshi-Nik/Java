//Ass 3,Q. 2
import java.io.*;

abstract class Employee {
     String name;
     String address;
     double salary;
     String jobTitle;

   
    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    
    abstract double calculateBonus();
    abstract void generatePerformanceReport();
}

class Manager extends Employee {
    private int numberOfProjects;

    
    public Manager(String name, String address, double salary, String jobTitle, int numberOfProjects) {
        super(name, address, salary, jobTitle);
        this.numberOfProjects = numberOfProjects;
    }

    
    @Override
    public double calculateBonus() {
        return salary * 0.20 + (numberOfProjects * 500);  // 20% of salary + bonus per project
    }

    
    @Override
    public void generatePerformanceReport() {
        System.out.println("Manager Performance Report for " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Number of Projects: " + numberOfProjects);
        System.out.println("Annual Salary: $" + salary);
        System.out.println("Bonus: $" + calculateBonus());
    }

    
    public void manageProjects() {
        System.out.println(name + " is managing " + numberOfProjects + " projects.");
    }
}


class Developer extends Employee {
    private String programmingLanguage;


    public Developer(String name, String address, double salary, String jobTitle, String programmingLanguage) {
        super(name, address, salary, jobTitle);
        this.programmingLanguage = programmingLanguage;
    }

  
    @Override
    public double calculateBonus() {
        return salary * 0.15;  
	}
	
    @Override
    public void generatePerformanceReport() {
        System.out.println("Developer Performance Report for " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Annual Salary: $" + salary);
        System.out.println("Bonus: $" + calculateBonus());
    }

   
    public void developSoftware() {
        System.out.println(name + " is developing software using " + programmingLanguage + ".");
    }
}


class Programmer extends Developer {
    private int linesOfCode;

    
    public Programmer(String name, String address, double salary, String jobTitle, String programmingLanguage, int linesOfCode) {
        super(name, address, salary, jobTitle, programmingLanguage);
        this.linesOfCode = linesOfCode;
    }

    
    @Override
    public double calculateBonus() {
        return salary * 0.10 + (linesOfCode * 0.05);  
    }

    
    @Override
    public void generatePerformanceReport() {
        System.out.println("Programmer Performance Report for " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Lines of Code Written: " + linesOfCode);
        System.out.println("Annual Salary: $" + salary);
        System.out.println("Bonus: $" + calculateBonus());
    }
	
    public void writeCode() {
        System.out.println(name + " is writing code. Lines of code: " + linesOfCode);
    }
}


public class Company {
    public static void main(String[] args) {
        
		
		
        Manager manager = new Manager("Ajay", "123 Pune", 90000, "Project Manager", 5);
        manager.generatePerformanceReport();
        manager.manageProjects();

		System.out.println();
        Developer developer = new Developer("Ram", "456 Mumbai", 80000, "Software Developer", "Java");
        developer.generatePerformanceReport();
        developer.developSoftware();

		System.out.println();
  
        Programmer programmer = new Programmer("Varun", "789 Thane", 70000, "Programmer", "Python", 1500);
        programmer.generatePerformanceReport();
        programmer.writeCode();
    }
}
/*OP:
Manager Performance Report for Ajay
Job Title: Project Manager
Number of Projects: 5
Annual Salary: $90000.0
Bonus: $20500.0
Ajay is managing 5 projects.

Developer Performance Report for Ram
Job Title: Software Developer
Programming Language: Java
Annual Salary: $80000.0
Bonus: $12000.0
Ram is developing software using Java.

Programmer Performance Report for Varun
Job Title: Programmer
Lines of Code Written: 1500
Annual Salary: $70000.0
Bonus: $7075.0
Varun is writing code. Lines of code: 1500
*/