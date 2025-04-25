// Example of Encapsulation
class Employee {
    // Private variables (Data Hiding)
    private String name;
    private int age;
    private double salary;

    // Public Getter method for name
    public String getName() {
        return name;
    }

    // Public Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Public Getter method for age
    public int getAge() {
        return age;
    }

    // Public Setter method for age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive");
        }
    }

    // Public Getter method for salary
    public double getSalary() {
        return salary;
    }

    // Public Setter method for salary
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be positive");
        }
    }
}

// Main class to test encapsulation
public class Mainn {
    public static void main(String[] args) {
        Employee emp = new Employee();
        
        // Setting values using setter methods
        emp.setName("John Doe");
        emp.setAge(30);
        emp.setSalary(50000);

        // Getting values using getter methods
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Age: " + emp.getAge());
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}