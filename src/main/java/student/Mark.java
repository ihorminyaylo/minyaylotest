package student;

import java.util.List;

/**
 * Created by user on 26.05.2017.
 */
public class Mark {
    private Subject subject;
    private int mark;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }


    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public Mark(Subject subject, int mark) {
        this.subject = subject;
        this.mark = mark;
    }
}
