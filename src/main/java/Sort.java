/**
 * Created by User on 22.05.2017.
 */
public interface Sort {
    <T extends Comparable<T>> void sort(T[] inputArr);
}
