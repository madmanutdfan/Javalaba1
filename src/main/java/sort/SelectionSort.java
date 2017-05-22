package sort;

/**
 * Created by User on 22.05.2017.
 */
public class SelectionSort implements Sort {
    public <T extends Comparable<T>> void toSort(final T[] array) {
        for (int min=0; min<array.length-1; min++) {
            int least = min;
            for (int j=min+1; j<array.length; j++) {
                if(array[j].compareTo(array[least]) < 0 ){ least = j; }
            }
            T tmp = array[min];
            array[min] = array[least];
            array[least] = tmp;
        }
    }
}
