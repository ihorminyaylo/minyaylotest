package student;

import com.fasterxml.jackson.core.JsonProcessingException;

import javax.xml.bind.JAXBException;

/**
 * Created by user on 25.05.2017.
 */
public interface IO {
    public String convertFromStudentToString(Student student) throws JsonProcessingException, JAXBException;
    public Student convertStringToStudent(String string);
}
