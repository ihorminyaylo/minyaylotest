package lesson04.homework.task05;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by user on 30.04.2017.
 */
public class Car {
    private String type;
    private int dateBuilt;
    private int power;
    List<Car> listCar = new ArrayList<>();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDateBuilt() {
        return dateBuilt;
    }

    public void setDateBuilt(int dateBuilt) {
        this.dateBuilt = dateBuilt;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    Car(String type, int dateBuilt, int power) {
        this.type = type;
        this.dateBuilt = dateBuilt;
        this.power = power;
    }
    public static List<Car> carOfYear(List<Car> listCar, int year) {
        List<Car> listCarOfYear = new ArrayList<>();
        for (Car carOfYear : listCar) {
            if (carOfYear.dateBuilt == year) {
                listCarOfYear.add(carOfYear);
            }
        }
        return listCarOfYear;
    }
    public static List<Car> sortCarOfYear(List<Car> listCar) {
        List<Car> listSortCar = listCar;
        Collections.sort(listSortCar, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getDateBuilt() - (o2.getDateBuilt());
            }
        });
        return listSortCar;
    }

    @Override
    public String toString() {
        return '\n' + "Type of car : " + getType() + ". Year of built : " + getDateBuilt() + " Power of car : " + getPower();
    }
}
