package student;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate birthDate;
    private List<Mark> marks = new ArrayList<>();  // new
    private int groupNumber;

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

    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
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

    public List<Mark> getMarks() {
        return marks;
    }

    @XmlElement
    public void setMarks(List<Mark> marks) {
        this.marks = marks;
    }

    public Student(){}

    public Student(int id, String lastname, String firstname, LocalDate birthDate, List<Mark> marks, int groupNumber) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.birthDate = birthDate;
        this.marks = marks;
        this.groupNumber = groupNumber;
    }
    public Student(String lastname, String firstname, LocalDate birthDate, int groupNumber) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.birthDate = birthDate;
        this.groupNumber = groupNumber;
    }

    public Student(String lastname, String firstname, List<Mark> marks) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.marks = marks;
    }

    public double averageScore() {
        double sumScore = 0;
        double averageScore = 1;
        int countOfSubject = 0;
        Iterator<Mark> markIterator = marks.iterator();
        while (markIterator.hasNext()) {
            Mark a = markIterator.next();
            sumScore += a.getMark();
            countOfSubject++;
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
        System.out.println("Scores of student : " + student.getMarks());
    }

    public static void printForSort(List<Student> list) {
        for (Student student : list) {
            System.out.println("Student : " + student.getLastname() + " " + student.getFirstname() + " "
            + student.averageScore());
        }

    }
}
