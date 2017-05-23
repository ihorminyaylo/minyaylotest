package lesson07.practicaltask.practicaltask2;

/**
 * Created by user on 09.05.2017.
 */
public class Stuff {
    private String surename;
    private String name;
    private String patronymic;

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Stuff(String surename, String name, String patronymic) {
        this.surename = surename;
        this.name = name;
        this.patronymic = patronymic;
    }

    public String surenameAndInitials() {
        return surename + " " + name.substring(0, 1) + ". " + patronymic.substring(0, 1) + ".";
    }
    public String name() {
        return name;
    }
    public String fullName() {
        return name + " " + patronymic + " " + surename;
    }
}
