package lesson04.practicaltest.EmployeePractical2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by user on 27.04.2017.
 */
public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();
        Employee igor = new Employee("Igor", 68000);
        list.add(igor);
        Employee kolio = new Employee("Kolya", 63000);
        list.add(kolio);
        Employee karina = new Employee("Karina", 55000);
        list.add(karina);
        Employee katya = new Employee("Katya", 60000);
        list.add(katya);
        Employee vasya = new Employee("Vasya", 42000);
        list.add(vasya);
        for (Employee element : list) {
            System.out.println("Input department of employee " + element.getName());
            element.setDepartment(sc.nextInt());
        }
        Employee.sourtOfEmloyeeSalaryDown(list);
        for (Employee element : list) {
            System.out.println("Name of employee " + element.getName() + ". Department = " + element.getDepartment()
            +". Salary = " + element.getSalary());
        }
        System.out.println("Input, what do you want to print of Department employee?");
        int wantDepartment = sc.nextInt();
        System.out.println(Employee.employeeOfDepartment(list,2));
    }
}
