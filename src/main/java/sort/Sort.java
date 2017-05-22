package sort;


public interface Sort {
    <T extends Comparable<T>> void toSort(T[] inputArr);
}
