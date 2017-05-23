package lesson08.practical2;

/**
 * Created by user on 12.05.2017.
 */
public class ColorException extends Exception {
    public ColorException(String msg) {
        super(msg);
    }
    public ColorException() {
        super("Color isn't correct");
    }
}
