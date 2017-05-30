package student;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.io.IOException;

/**
 * Created by user on 25.05.2017.
 */
public class JsonIO implements IO {
    @Override
    public String convertFromStudentToString(Student student) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(student);
    }
    @Override
    public Student convertStringToStudent(String string) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(string, Student.class);
    }
}
