import java.util.ArrayList;
import java.util.List;

// Component interface
interface IEmployee {
    void displayDetails();
}

// Leaf class representing an individual employee
class Employee implements IEmployee {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void displayDetails() {
        System.out.println("Employee: " + name + ", Position: " + position);
    }
}

// Composite class representing a department
class Department implements IEmployee {
    private String name;
    private List<IEmployee> employees = new ArrayList<>();
    private List<Department> subDepartments = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(IEmployee employee) {
        employees.add(employee);
    }

    public void removeEmployee(IEmployee employee) {
        employees.remove(employee);
    }

    public void addSubDepartment(Department subDepartment) {
        subDepartments.add(subDepartment);
    }

    public void removeSubDepartment(Department subDepartment) {
        subDepartments.remove(subDepartment);
    }

    @Override
    public void displayDetails() {
        System.out.println("Department: " + name);
        System.out.println("Employees:");
        for (IEmployee employee : employees) {
            employee.displayDetails();
        }
        System.out.println("Sub-Departments:");
        for (Department subDept : subDepartments) {
            subDept.displayDetails();
        }
    }
}

public class Company {
    public static void main(String[] args) {
        // Create individual employees
        Employee emp1 = new Employee("John Doe", "Software Engineer");
        Employee emp2 = new Employee("Jane Smith", "Project Manager");
        Employee emp3 = new Employee("Alice Johnson", "Sales Associate");

        // Create departments
        Department developmentDept = new Department("Development Department");
        Department salesDept = new Department("Sales Department");
        Department subDept = new Department("Sub-Department");

        // Add employees to departments
        developmentDept.addEmployee(emp1);
        salesDept.addEmployee(emp2);
        subDept.addEmployee(emp3);

        // Add the sub-department to the sales department
        salesDept.addSubDepartment(subDept);

        // Display company structure
        System.out.println("Company Structure:");
        developmentDept.displayDetails();
        salesDept.displayDetails();
    }
}