package student;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 25.05.2017.
 */
public class StudentDBService {
    public static void createStudent(Student student) throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student_db?useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false",
                "root", "root");
        PreparedStatement statement = null;

        statement = connection.prepareStatement("INSERT INTO student VALUES (NULL, ?, ?, ?, (SELECT id_group FROM groups WHERE group_number = ?))");
        statement.setString(1, student.getFirstname());
        statement.setString(2, student.getLastname());
        statement.setString(3, String.valueOf(StudentDBService.convertToDatabaseColumn(student.getBirthDate())));
        statement.setInt(4, student.getGroupNumber());
        statement.executeUpdate();
    }
    public static Student getStudentById(int id) throws SQLException, InvalidFormatException {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student_db?useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false",
                "root", "root");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM student WHERE id_student = " + id + ";");
        if (resultSet.next()) {
            int idst = resultSet.getInt("id_student");
            String firstName = resultSet.getString("firstname");
            String lastName = resultSet.getString("lastname");
            LocalDate birthDate = resultSet.getDate("birthdate").toLocalDate();
            int idGroup = resultSet.getInt("id_group");
            ResultSet resultSet1 = statement.executeQuery("SELECT * FROM groups WHERE id_group = " + idGroup + ";");
            int groupNumber = 0;
            if (resultSet1.next()) {
                groupNumber = resultSet1.getInt("group_number");
            }
            return new StudentBuilder().id(idst).firstName(firstName).lastName(lastName).birthDate(birthDate)
                    .groupNumber(groupNumber).get();
        }
        connection.close();
        return null;
    }

    public static void updateStudent(Student student) throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student_db?useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false",
                "root", "root");
        Statement statement = connection.createStatement();
        statement.execute("UPDATE student SET firstname = '" + student.getFirstname() +
                "', lastname = '" + student.getLastname() +
                "', birthdate = '" + StudentDBService.convertToDatabaseColumn(student.getBirthDate()) +
                "', id_group = (SELECT id_group FROM groups WHERE group_number = " + student.getGroupNumber() + ");");
        /*statement.executeQuery("UPDATE groups SET score_of_subject = " + student.getMarks());*/
    }

    public static void deleteStudent(Student student) throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student_db?useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false",
                "root", "root");
        Statement statement = connection.createStatement();
        statement.execute("DELETE FROM student WHERE id_student = " + student.getId());
    }

    public static List<Student> sortOfStudentByName() throws SQLException, InvalidFormatException {
        List<Student> list = new ArrayList<>();
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student_db?useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false",
                "root", "root");
        Statement statement = connection.createStatement();
        ResultSet resultSet =  statement.executeQuery("SELECT * FROM student GROUP BY lastname, firstname");
        while (resultSet.next()) {
            list.add(new StudentBuilder().id(resultSet.getInt(1)).
                    firstName(resultSet.getString(2)).
                    lastName(resultSet.getString(3)).
                    birthDate(resultSet.getDate(4).toLocalDate()).
                    groupNumber(resultSet.getInt(5)).get());
        }
        return list;
    }

    public static Date convertToDatabaseColumn(LocalDate entityValue) {
        return Date.valueOf(entityValue);
    }

}