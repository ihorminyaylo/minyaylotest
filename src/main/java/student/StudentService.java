package student;

import java.time.LocalDate;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 09.05.2017.
 */
public class StudentService {
    private final static String NAME_PATTERN = "[A-Z-a-z]+";   // Example : Anna-Maria
    private Student student;
    private String lastname;
    private String firstname;
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    // Check correct info about student
    public StudentService(Student student) {
        this.student = student;
    }

    //Add score for student
    public void addScoreForStudent(Subject newSubject, int newScore) {
        if (student.getMapOfStudentSubjects().containsKey(newSubject)) {
            student.getMapOfStudentSubjects().get(newSubject).add(newScore);
        }
        else {
            List<Integer> listOfScore = new ArrayList<>();
            listOfScore.add(newScore);
            student.getMapOfStudentSubjects().put(newSubject, listOfScore);
        }
    }
    // Check student have the subject
    /*public boolean haveStudentScore(Subject haveSubject) {
        boolean a = false;
        if (student.getMapOfStudentSubjects() == null) {
            return a;
        }
        for (Map.Entry<Subject, List<Integer>> entry : student.getMapOfStudentSubjects().entrySet()) {
            if (entry.getKey().equals(haveSubject)) {
                a = true;
            }
        }
        return a;
    }*/
    // Change group for student
    public void changeGroup(int newGroup) throws InvalidFormatException {
        if (newGroup > 0 && newGroup < 600) {
            student.setGroupNumber(newGroup);
        }
        else {
            throw new InvalidFormatException("Group isn't correct");
        }
    }

    public static List<Student> sortName(List<Student> list) {
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getLastname().equals(o2.getLastname())) {
                    return o1.getFirstname().compareTo(o2.getFirstname());
                }
                else {
                    return (o1.getLastname().compareTo(o2.getLastname()));
                }
            }
        });
        return list;
    }

    public static List<Student> sortAverageScore(List<Student> list) {
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int) (o2.averageScore() - o1.averageScore());       // double to int
            }
        });
        return list;
    }

    public static void nextCourse(List<Student> list) {
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getGroupNumber() > 500) {
                iterator.remove();
            }
            else {
                student.setGroupNumber(student.getGroupNumber() + 100);
            }
        }
    }
    public static void removeStudentsHaveLessScore(List<Student> list, double score) {
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.averageScore() < score) {
                iterator.remove();
            }
        }
    }
}