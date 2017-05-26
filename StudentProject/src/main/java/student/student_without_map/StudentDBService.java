package student.student_without_map;

import java.sql.*;
import java.time.LocalDate;

/**
 * Created by user on 25.05.2017.
 */
public class StudentDBService {
    public static void createStudent(Student student) throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student_db?useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false",
                "root", "root");

        PreparedStatement statement = null;

        statement = connection.prepareStatement("INSERT INTO student VALUES (NULL, ?, ?, ?, ?)");
        statement.setString(1, student.getFirstname());
        statement.setString(2, student.getLastname());
        statement.setString(3, String.valueOf(student.StudentDBService.convertToDatabaseColumn(student.getBirthDate())));
        statement.setInt(4, student.getGroupNumber());
        statement.executeUpdate();
    }
    public static Student getStudentById(int id) throws SQLException, InvalidFormatException {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student_db?useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false",
                "root", "root");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM student WHERE id_student = " + id);
        if (resultSet.next()) {
            int idst = resultSet.getInt("id_student");
            String firstName = resultSet.getString("firstname");
            String lastName = resultSet.getString("lastname");
            LocalDate birthDate = resultSet.getDate("birthdate").toLocalDate();
            int groupNumber = resultSet.getInt("groupnumber");
            return new StudentBuilder().id(idst).firstName(firstName).lastName(lastName).birthDate(birthDate)
                    .groupNumber(groupNumber).get();
        }
        return null;
    }

    public static void updateStudent(Student student) throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student_db?useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false",
                "root", "root");
        Statement statement = connection.createStatement();
        statement.execute("UPDATE student SET firstname = '" + student.getFirstname() +
                "', lastname = '" + student.getLastname() +
                "', birthdate = '" + student.StudentDBService.convertToDatabaseColumn(student.getBirthDate()) +
                "', groupnumber = '" + student.getGroupNumber() +
                "' WHERE id_student = " + student.getId());
    }

    public static void deleteStudent(Student student) throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student_db?useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false",
                "root", "root");
        Statement statement = connection.createStatement();
        statement.execute("DELETE FROM student WHERE id_student = " + student.getId());
    }

    public static Date convertToDatabaseColumn(LocalDate entityValue) {
        return Date.valueOf(entityValue);
    }

}