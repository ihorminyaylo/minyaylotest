package lesson06.homework.homework1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by user on 05.05.2017.
 */
public class MethodsOfSet<T> {
    public Set<T> unionSet(Set<T> set1, Set<T> set2) {
        Set<T> setResult = new HashSet<T>(set1);
        setResult.addAll(set2);
        return setResult;
    }
    public Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> setResult = new HashSet<T>(set1);
        setResult.retainAll(set2);
        return setResult;
    }
}
