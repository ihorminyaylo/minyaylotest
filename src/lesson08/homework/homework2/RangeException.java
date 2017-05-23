package lesson08.homework.homework2;

/**
 * Created by user on 23.05.2017.
 */
public class RangeException extends Exception {
    public RangeException(){
        super("This number is not in your range");
    }
    public RangeException(String msg) {
        super(msg);
    }
}
