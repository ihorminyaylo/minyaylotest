package student.student_without_map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

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
    public Student convertStringToStudent(String string) {
        /*ObjectMapper mapper = new ObjectMapper();
        Student student = mapper.readValue(string);
        String jsonInString = ""
*/
        return null;
    }
}
