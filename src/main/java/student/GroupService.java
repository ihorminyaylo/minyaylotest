package student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by user on 16.05.2017.
 */
public class GroupService {
    private Student student;
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }


    public static void addStudentToGroup(Student student, List<Group> listOfGroup) {
            boolean success = false;
        for (Group group : listOfGroup) {
            if (group.getGroupNumber() == student.getGroupNumber()) {
                success = true;
                break;
            }
        }
        if (success == false) {
            listOfGroup.add(new Group(student.getGroupNumber(), new ArrayList<Student>()));
        }

        Iterator<Group> iterator = listOfGroup.iterator();
            while (iterator.hasNext()) {
                Group group = iterator.next();
                if (group.getGroupNumber() == student.getGroupNumber()) {
                    group.getStudents().add(student);
                }
            }
    }

    public static void printGroup(List<Group> list, int groupNumber) {
        for (Group group : list) {
            if (group.getGroupNumber() == groupNumber) {
                Student.printForSort(group.getStudents());
            }
        }
    }
    public static void groupNextCourse(List<Group> list) {
        Iterator<Group> iterator = list.iterator();
        while (iterator.hasNext()) {
            Group group = iterator.next();
            if (group.getGroupNumber() > 500) {
                iterator.remove();
            }
            else {
                group.setGroupNumber(group.getGroupNumber() + 100);
            }
        }
    }
}
