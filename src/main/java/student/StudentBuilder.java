package student;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 15.05.2017.
 */
public class StudentBuilder {
    private final static String NAME_PATTERN = "[A-Z-a-z]+";
    private final static int MAX_AGE = 80;
    private final static int MIN_AGE = 10;
    private Student student = new Student();
    Pattern pName = Pattern.compile(NAME_PATTERN);

    public StudentBuilder() {}

    public StudentBuilder id(int id) {
        student.setId(id);
        return this;
    }

    public StudentBuilder firstName(String firstName) throws InvalidFormatException {
        Matcher mLastName = pName.matcher(firstName);
        if (mLastName.matches()) {
            student.setFirstname(firstName);
            return this;
        }
        else {
            throw new InvalidFormatException("First name isn't correct.");
        }
    }

    public StudentBuilder lastName(String lastName) throws InvalidFormatException {
        Matcher mFirstName = pName.matcher(lastName);
        if (mFirstName.matches()) {
            student.setLastname(lastName);
            return this;
        }
        else {
            throw new InvalidFormatException("Last name isn't correct.");
        }
    }

    public StudentBuilder birthDate(LocalDate birthDate) throws InvalidFormatException {
        LocalDate today = LocalDate.now();
        int age = 0;
        if (today.getDayOfYear() > birthDate.getDayOfYear()) {
            age = today.getYear() - birthDate.getYear();
        }
        else {
            age = today.getYear() - birthDate.getYear() - 1;
        }
        if (age >= MIN_AGE && age < MAX_AGE) {
            student.setBirthDate(birthDate);
            return this;
        }
        else {
            throw new InvalidFormatException("Birth date isn't correct");
        }
    }

    public StudentBuilder groupNumber(int groupNumber) throws InvalidFormatException {
        if (groupNumber > 0 && groupNumber < 600) {
            student.setGroupNumber(groupNumber);
            return this;
        }
        else {
            throw new InvalidFormatException("Group number isn't correct");
        }
    }

    public Student get() {
        return student;
    }

}
