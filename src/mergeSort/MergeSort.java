package mergeSort;

public class MergeSort {
    public void sort(int[] array){
        if(array.length < 2) {
            return;
        }
        else{
            int mid = array.length / 2;
            int[] leftArray = new int[mid];
            int[] rightArray = new int[array.length - mid];

            //copying the array into two part
            int k = 0;
            for (int i = 0; i < array.length; i++) {
                if(i < mid)
                    leftArray[i] = array[i];
                else{
                    rightArray[k] = array[i];
                    k++;
                }
            }
            //recursive calling the function for sub arrays
            sort( leftArray );
            sort( rightArray );

            //call the merging function

            merge( array, leftArray, rightArray );

        }
    }

    public void merge(int[] outputArray, int[] leftArray, int[] rightArray){
        int k = 0;    //for output array
        int i = 0;    //for left array
        int j = 0;    //for right array

        while(i < leftArray.length && j < rightArray.length) {
            if(leftArray[i] < rightArray[j])
                outputArray[k++] = leftArray[i++];
            else
                outputArray[k++] = rightArray[j++];
        }

        while(i < leftArray.length)
            outputArray[k++] = leftArray[i++];
        while(j < rightArray.length)
            outputArray[k++] = rightArray[j++];

    }
}