package employee;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        FullTimeEmployee ft1 = new FullTimeEmployee(101, "Alice", 50000, 10000);
        ft1.assignDepartment("HR");

        PartTimeEmployee pt1 = new PartTimeEmployee(102, "Bob", 20000, 40, 300);
        pt1.assignDepartment("IT");

        employees.add(ft1);
        employees.add(pt1);

        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
