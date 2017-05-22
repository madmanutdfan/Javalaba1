/**
 * Created by User on 22.05.2017.
 */
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by User on 23.04.2017.
 */
public class TestSort {
    public Sort thisSort;

    public TestSort(Sort currentSort) {
        thisSort = currentSort;
    }

    public <T extends Comparable<T>> boolean isItSorted(T[] inputArr) {
        boolean sortStatement = true;
        for (int i = 0; i < inputArr.length - 1; i++)
            if (inputArr[i].compareTo(inputArr[i + 1]) > 0) {
                sortStatement = false;
                break;
            }
        return sortStatement;
    }

    public <T extends Comparable<T>> boolean isItSame(T[] inputArr1, T[] inputArr2) {
        boolean sameStatement = true;
        if (inputArr1.length != inputArr2.length) {
            sameStatement = false;
        } else {
            int i = 0, j = 0, arrLength = inputArr1.length;
            T trifle;
            boolean isItOnce[] = new boolean[arrLength];
            for (j = 0; j < arrLength; j++)
                isItOnce[j] = false;
            while ((i < arrLength) && (sameStatement == true)) {
                trifle = inputArr1[i];
                sameStatement = false;
                for (j = 0; j < arrLength; j++) {
                    if ((inputArr2[j] == trifle) && (isItOnce[j] == false)) {
                        sameStatement = true;
                        isItOnce[j] = true;
                        break;
                    }

                }
                i++;
            }
        }
        return sameStatement;
    }

    @Test
    public void test1() {
        String arr1Test[] = {"t", "c", "a", "z", "b", "d"};
        String arr[] = arr1Test.clone();
        thisSort.sort(arr);
        assertEquals(true, isItSorted(arr));
        assertEquals(true, isItSame(arr1Test, arr));
    }

    @Test
    public void test2() {
        Integer arr1Test[] = {9, 5, 2, 7, 1, 8, 4, 6, 0, 3};
        Integer arr[] = arr1Test.clone();
        thisSort.sort(arr);
        assertEquals(true, isItSorted(arr));
        assertEquals(true, isItSame(arr1Test, arr));
    }

    @Test
    public void test3() {
        Integer arr1Test[] = {};
        Integer arr[] = arr1Test.clone();
        thisSort.sort(arr);
        assertEquals(true, isItSorted(arr));
        assertEquals(true, isItSame(arr1Test, arr));
    }

    @Test
    public void test4() {
        Double arr1Test[] = {0.};
        Double arr[] = arr1Test.clone();
        thisSort.sort(arr);
        assertEquals(true, isItSorted(arr));
        assertEquals(true, isItSame(arr1Test, arr));
    }

    @Test
    public void test5() {
        int size = 10000;
        Double[] arr1Test = new Double[size];
        for (int i = 0; i < size; i++)
            arr1Test[i] = Math.random() * 11 + 1;
        Double arr[] = arr1Test.clone();
        thisSort.sort(arr);
        assertEquals(true, isItSorted(arr));
        assertEquals(true, isItSame(arr1Test, arr));
    }

    @Test
    public void test6() {
        Integer arr1Test[] = {-1, -39, -98, 77, 0};
        Integer arr[] = arr1Test.clone();
        thisSort.sort(arr);
        assertEquals(true, isItSorted(arr));
        assertEquals(true, isItSame(arr1Test, arr));
    }
}