package student;

import java.util.*;

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
    public void addScoreForStudent(Subject newSubject, int newScore) throws InvalidFormatException {
        if (newScore >= 0 && newScore <= 100) {
            Iterator<Mark> iterator = student.getMarks().iterator();
            boolean succses = false;
            while (iterator.hasNext()) {
                Mark mark = iterator.next();
                if (mark.getSubject().equals(newSubject)) {
                    mark.setMark(newScore);
                    succses = true;
                    break;
                }
            }
            if (succses = true) {
                student.getMarks().add(new Mark(newSubject, newScore));
            }
        }
        else {
            throw new InvalidFormatException("Score shouldn't be less 0 and more 100");
        }
    }
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