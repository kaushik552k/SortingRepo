package insertionSort;

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
