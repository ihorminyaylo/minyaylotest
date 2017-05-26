package student.student_without_map;

import com.fasterxml.jackson.core.JsonProcessingException;

import javax.xml.bind.JAXBException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 04.05.2017.
 */
public class Main {
    public static void main(String[] args) throws InvalidFormatException, SQLException, JsonProcessingException, JAXBException {
        List<Student> listOfStudents = new ArrayList<>();
        List<Group> listOfGroup = new ArrayList<>();


        Student student = new StudentBuilder().firstName("Kdsak").lastName("Vaadsasds").
                birthDate(LocalDate.of(1997,5,15)).groupNumber(364).get();
        student.student_without_map.StudentDBService.createStudent(student);

        IO io1 = new JsonIO();
        System.out.println(io1.convertFromStudentToString(student));

        IO io2 = new XmlIO();
        System.out.println(io2.convertFromStudentToString(student));

       /* Student stud1 = new StudentBuilder().lastName("Minyaylo").firstName("Igor")
                .birthDate(LocalDate.of(1995,02,19)).groupNumber(321).get();
        StudentService st = new StudentService(stud1);
        st.addScoreForStudent(Subject.UKRAINIAN, 100);
        st.addScoreForStudent(Subject.COMPUTER_SCIENCE, 85);
        st.addScoreForStudent(Subject.MATHEMATICS, 91);
        st.addScoreForStudent(Subject.ENGLISH, 89);
        st.addScoreForStudent(Subject.MATHEMATICS, 96);
        st.addScoreForStudent(Subject.ENGLISH, 85);

        GroupService.addStudentToGroup(stud1, listOfGroup);

        System.out.println(stud1);
        // Student 2
        Student stud2 = new StudentBuilder().lastName("Minyaylo").firstName("Karina")
                .birthDate(LocalDate.of(1995,07,18)).groupNumber(301).get();
        st.setStudent(stud2);
        st.addScoreForStudent(Subject.UKRAINIAN, 90);
        st.addScoreForStudent(Subject.MATHEMATICS, 83);
        st.addScoreForStudent(Subject.COMPUTER_SCIENCE, 75);
        st.addScoreForStudent(Subject.ENGLISH, 100);
        st.changeGroup(321);

        GroupService.addStudentToGroup(stud2, listOfGroup);

        System.out.println(stud2);
        // Student 3
        Student stud3 = new StudentBuilder().lastName("Galchuk").firstName("Kolya")
                .birthDate(LocalDate.of(1995,05,05)).groupNumber(521).get();
        st.setStudent(stud3);
        st.addScoreForStudent(Subject.UKRAINIAN, 95);
        st.addScoreForStudent(Subject.MATHEMATICS, 80);
        st.addScoreForStudent(Subject.COMPUTER_SCIENCE, 85);
        st.addScoreForStudent(Subject.ENGLISH, 75);

        GroupService.addStudentToGroup(stud3, listOfGroup);

        System.out.println(stud3);
        listOfStudents.add(stud1);
        listOfStudents.add(stud2);
        listOfStudents.add(stud3);

        System.out.println("Group 321");
        GroupService.printGroup(listOfGroup, 321);

        // переведння групи на наступний курс
        // видалення груп в яких номер більше 600
        StudentService.nextCourse(listOfStudents);
        GroupService.groupNextCourse(listOfGroup);


        System.out.println("\n\\Full info about student :");
        Student.printFullInfo(stud1);

        StudentService.removeStudentsHaveLessScore(listOfStudents, 84);

        System.out.println("\n\\Sort students of average score, next course and exclude students " +
                "which have Average Score less 84 :");
        StudentService.nextCourse(listOfStudents);
        Student.printForSort(StudentService.sortAverageScore(listOfStudents));

        System.out.println("\n\\Sort students of name :");
        Student.printForSort(StudentService.sortName(listOfStudents));*/
    }
}
