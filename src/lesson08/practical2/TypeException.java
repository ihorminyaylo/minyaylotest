package lesson08.practical2;

/**
 * Created by user on 12.05.2017.
 */
public class TypeException extends RuntimeException {
    public TypeException(String msg) {
        super(msg);
    }
    public TypeException() {
        super("Type isn't correct");
    }
}
