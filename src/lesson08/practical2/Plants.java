package lesson08.practical2;

/**
 * Created by user on 12.05.2017.
 */
public class Plants {
    private int size;
    private Color color;
    private Type type;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
    public Plants(int size, String color, String type) throws ColorException {
        this.size = size;
        try {
            this.color = Color.valueOf(color);
        }
        catch (IllegalArgumentException e) {
            throw new ColorException();
        }
        this.type = Type.getByName(type);
    }

    @Override
    public String toString() {
        return size + " " + color + " " + type;
    }
}
