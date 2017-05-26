package student.student_without_map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

/**
 * Created by user on 26.05.2017.
 */
public class XmlIO implements IO {
    @Override
    public String convertFromStudentToString(Student student) {
        //ObjectMapper
        String xmlString = "";
        try {
            JAXBContext context = JAXBContext.newInstance(Student.class);
            Marshaller m = context.createMarshaller();

            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); // To format XML

            StringWriter sw = new StringWriter();
            m.marshal(student, sw);
            xmlString = sw.toString();

        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return xmlString;
    }

    @Override
    public Student convertStringToStudent(String string) {
        return null;
    }
}
