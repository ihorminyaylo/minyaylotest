package lesson06.homework.homework3;

/**
 * Created by user on 08.05.2017.
 */
import java.util.*;

public class Student {
    private String lastName;
    private String firstName;
    private int course;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Student(String lastName, String firstName, int course) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.course = course;
    }

    public static void printStudents(List<Student> list, int course) {
        for (Student student : list) {
            System.out.println("List of student, which study in course number - " + course);
            if (student.getCourse() == course) {
                System.out.println("Last name - " + student.getLastName() + ". First name - " + student.getFirstName());
            }
        }
    }
}
