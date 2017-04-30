package lesson04.homework.task3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by user on 28.04.2017.
 */
public interface MethodsOfArray {
    public static List<Integer> sortList(List<Integer> list, String type) {
        List<Integer> listSort = new ArrayList<>();
        if (type.equals("positive")) {
            for (int a : list) {
                if (a > 0) {
                    listSort.add(a);
                }
            }
        }
        int resultList = 0;
        Collections.sort(listSort, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);

            }
        });
        return listSort;
    }
    public static int IndexOfPositiveElement(List<Integer> list, int indexWantToOut) {
        List<Integer> listSort = sortList(list, "positive");
        int resultList = 0;
        int a2 = listSort.get(indexWantToOut - 1);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(a2)) {
                resultList = i+1;
                break;
            }
        }
        return resultList;
    }
    public static List<Integer> minOfArray(List<Integer> list) {
        List<Integer> listSort1 = sortList(list, "all");
        int min = listSort1.get(0);
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(min)) {
                index = i;
            }
        }
        List<Integer> result = new ArrayList<>();
        result.add(index);
        result.add(min);
        return result;
    }
        }
