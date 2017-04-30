package lesson04.practicaltest.EmployeePractical2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 27.04.2017.
 */
public class Employee {
    private String name;
    private int department;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public static List<Employee> sourtOfEmloyeeSalaryDown(List<Employee> list) {
        Employee a= null;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j > list.size(); j++) {
                if (list.get(i).getSalary() < list.get(j).getSalary()) {
                    a = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,a);
                }
            }
        }
        return list;
    }
    public static List<Employee> employeeOfDepartment(List<Employee> list, int wantDepartment) {
        List<Employee> listDepartment = new ArrayList<>();
        for (Employee worker: list) {
            if (worker.getDepartment() == wantDepartment) {
                listDepartment.add(worker);
            }
        }
        return listDepartment;
    }

    @Override
    public String toString() {
        return getName();
    }
}
