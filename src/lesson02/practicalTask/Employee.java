package lesson02.practicalTask;

/**
 * Created by user on 24.04.2017.
 */
public class Employee {
    // b) static field: totalSum
    private static double totalSum;
    // a) there private fields: name, rate, hours
    private String name;
    private double rate;
    private int hours;
    // c) properties for access for fields
    public static double getTotalSum() {
        return totalSum;
    }

    public static void setTotalSum(double totalSum) {
        Employee.totalSum = totalSum;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        totalSum += hours - this.hours;
        this.hours = hours;
    }
    // d) default constructor, constructor with two parameters(name and rate), constructor with 3 parametrs
    public Employee() {}
    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }
    public Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += hours;
    }
    // e) 1. method salary
    public double salary() {
        return getRate() * getHours();
    }

    // e) 2. method toString
    @Override
    public String toString() {
        return "Name of employee - " + getName() + ". This employee worked " + getHours() + " in this month." +
                "It's rate = " + rate + " uah. Salary for this month = " + salary() + " uah.";
    }
    // e) 3. method changeRate
    public double changeRate(double rate) {
        return this.rate = rate;
    }
    // e) 4. method bonuses
    public String bonuses() {
        double bonus = salary() * 1.1;
        return String.format("Salaty with bonuses = %.2f uah.", bonus);
    }
}
