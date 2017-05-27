package student;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.time.ZoneId;
import java.util.Date;

/**
 * Created by user on 25.05.2017.
 */
public class JsonIO implements IO {
    @Override
    public String convertFromStudentToString(Student student) throws JsonProcessingException {
        /*Date date = Date.from(student.getBirthDate().atStartOfDay(ZoneId.systemDefault()).toInstant());
        Student student1 = new Student(student.getId(), student.getLastname(), student.getFirstname(),
                date, student.getMapOfStudentSubjects(), student.getGroupNumber());*/
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(student);
    }

    @Override
    public Student convertStringToStudent(String string) {
        Gson  gson = new Gson();
        Student student = gson.fromJson(string, Student.class);
        return student;
    }
}
