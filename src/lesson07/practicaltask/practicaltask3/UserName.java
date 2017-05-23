package lesson07.practicaltask.practicaltask3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 09.05.2017.
 */
public class UserName {
    private String name;
    public final String NAME_PATTERN = "[a-z_0-9]+";
    public UserName(String name) {
        Pattern pName = Pattern.compile(NAME_PATTERN);
        Matcher mName = pName.matcher(name);
        if (mName.matches()) {
            this.name = name;
            System.out.println(name + " - this name is true.");
        }
        else {
            System.out.println(name + " - this name is not correct, because name has " + NAME_PATTERN);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
