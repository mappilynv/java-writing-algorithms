public class QuickSort {

    //Find the partition position
    static int partition(int arr[], int low, int high){
        int pivot = arr[high]; //pivot element
        int i = (low - 1); //smaller element index

        for(int j = low; j <= high - 1; j++){
            //check if current element is less than or equal to pivot
            if(arr[j] < pivot){
                i++;

                //swap array[i] and array[j]
                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
        int swapTemp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = swapTemp;

        return i+1;
    }

    //sort the array partitions recursively
    static void quickSort(int arr[], int low, int high){
        if (low < high){
            int pIndex = partition(arr, low, high);
            quickSort(arr, low, pIndex-1);
            quickSort(arr, pIndex+1, high);

        }

    }
}
