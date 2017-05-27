package student;

import java.util.List;

/**
 * Created by user on 15.05.2017.
 */
public class Group {
    private int groupNumber;
    private List<Student> students;

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }
    public Group() {
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public Group(int groupNumber, List<Student> students) {
        this.groupNumber = groupNumber;
        this.students = students;
    }
}
