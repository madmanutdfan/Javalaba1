package sort;

/**
 * Created by User on 22.05.2017.
 */
public class QuickSort implements Sort {
    public  <T extends Comparable<T>> void toSort(final T[] array) {

        if (array == null || array.length == 0) {
            return;
        }
        quickSort(0, array.length - 1, array);
    }

    private <T extends Comparable<T>> void quickSort(int lowerIndex, int higherIndex,final T[] array ){

        int i = lowerIndex;
        int j = higherIndex;
        T pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];
        while (i <= j) {
            while (array[i].compareTo(pivot) < 0) {
                i++;
            }
            while (array[j].compareTo(pivot) > 0) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j, array);
                i++;
                j--;
            }
        }
        if (lowerIndex < j)
            quickSort(lowerIndex, j, array);
        if (i < higherIndex)
            quickSort(i, higherIndex, array);
    }

    private <T extends Comparable<T>> void exchangeNumbers(int i, int j, final T[] array) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
