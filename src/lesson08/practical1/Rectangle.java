package lesson08.practical1;

/**
 * Created by user on 12.05.2017.
 */
public class Rectangle {
    public static int squareRectangle(int a, int b) {
        return a * b;
    }
    public int area(int a, int b) throws NegativeException {
        if (a < 0 || b < 0) {
            throw new NegativeException();
        }
        return a * b;
    }
}
