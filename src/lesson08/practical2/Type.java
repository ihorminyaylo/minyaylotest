package lesson08.practical2;

/**
 * Created by user on 12.05.2017.
 */
public enum Type {
    PALMS, CACTUS;

    public static Type getByName(String s) {
        for (Type type : Type.values()) {
            if (type.name().equalsIgnoreCase(s)) {
                return type;
            }
        }
        throw new TypeException();
    }
}
