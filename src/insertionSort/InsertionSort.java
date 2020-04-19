package insertionSort;
/**
 * As there are two loops, with the while loop nested in the for loop
 * the complexity of this algorithm is O(n^2) where n is equal to the length of the array to be sorted.
 */

public class InsertionSort {
    public void sort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while(j > 0 && array[j - 1] > array[j]) {
                int key = array[j];
                array[j] = array[j - 1];
                array[j - 1] = key;
                j = j - 1;
            }
        }
    }
}
