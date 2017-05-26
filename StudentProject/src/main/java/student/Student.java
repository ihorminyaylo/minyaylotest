package student;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.time.LocalDate;
import java.util.*;

/**
 * Created by user on 04.05.2017.
 */
@XmlRootElement
public class Student {
    //private String UUID;
    private int id;
    private String lastname;
    private String firstname;
    private LocalDate birthDate;
    private Map<Subject, List<Integer>> mapOfStudentSubjects = new HashMap<>();  // tableScore or listOfInteger or Subject()
    private int groupNumber;  // String, 101a, 101

    public String getLastname() {
        return lastname;
    }

    @XmlElement
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    @XmlElement
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @XmlElement
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }


    public Map<Subject, List<Integer>> getMapOfStudentSubjects() {
        return mapOfStudentSubjects;
    }

    @XmlTransient
    public void setMapOfStudentSubjects(Map<Subject, List<Integer>> mapOfStudentSubjects) {
        this.mapOfStudentSubjects = mapOfStudentSubjects;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    @XmlElement
    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    @XmlElement
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Student(){}
    public Student(int id,String lastname, String firstname, LocalDate birthDate, Map<Subject, List<Integer>> mapOfStudentSubjects, int groupNumber) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.birthDate = birthDate;
        this.mapOfStudentSubjects = mapOfStudentSubjects;
        this.groupNumber = groupNumber;
    }
    public Student(String lastname, String firstname, LocalDate birthDate, int groupNumber) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.birthDate = birthDate;
        this.groupNumber = groupNumber;
    }
    public Student(String lastname, String firstname, Map<Subject, List<Integer>> mapOfStudentSubjects) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.mapOfStudentSubjects = mapOfStudentSubjects;
    }

    public double averageScore() {
        double sumScore = 0;
        double averageScore = 1;
        int countOfSubject = 0;
        for (Map.Entry<Subject, List<Integer>> entry : getMapOfStudentSubjects().entrySet()) {
            for (int a : entry.getValue()) {
                sumScore += a;
                countOfSubject++;
            }
        }
        averageScore = sumScore/countOfSubject;
        return averageScore;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    @Override
    public String toString() {
        return "Student: " + getLastname() + " " + getFirstname() + ". Birth date - " + getBirthDate()
                + ". Group number - " + getGroupNumber() + ". Average score - " + averageScore();
    }
    public static void printFullInfo(Student student) {
        System.out.println("Student: " + student.getLastname() + " " + student.getFirstname() +
        ". Birth date - " + student.getBirthDate() + ". Group number - " + student.getGroupNumber());
        System.out.println("Scores of student : " + student.getMapOfStudentSubjects());
    }

    public static void printForSort(List<Student> list) {
        for (Student student : list) {
            System.out.println("Student : " + student.getLastname() + " " + student.getFirstname() + " "
            + student.averageScore());
        }

    }
}
