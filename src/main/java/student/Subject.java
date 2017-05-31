package student;

/**
 * Created by user on 04.05.2017.
 */
public enum Subject {
    UKRAINIAN("Ukrainian"), ENGLISH("English"), MATHEMATICS("Mathematics"), COMPUTER_SCIENCE("Computer science");

    private String nameSubject;
    public String getNameSubject() {
        return nameSubject;
    }

    Subject(String nameSubject) {
        this.nameSubject = nameSubject;
    }
}
