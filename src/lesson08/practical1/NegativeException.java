package lesson08.practical1;

/**
 * Created by user on 12.05.2017.
 */
class NegativeException extends RuntimeException {
    public NegativeException(String msg) {
        super(msg);
    }
    public NegativeException() {
        super("Parameter coudn't negative");
    };
}