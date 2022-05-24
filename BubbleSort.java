public class BubbleSort {

    public static void bubbleSort(int array[]){
        int arraySize = array.length;
        int x = 0;

        //loop through each array element
        for(int i = 0; i < arraySize -1; i++){
            //loop to compare array element
            for(int j = 0; j < arraySize - i- 1; j++){
                //compare two adjacent elements
                if(array[j] > array[j+1]){
                    //swap
                    x = array[j];
                    array[j] = array[j+1];
                    array[j + 1] = x;
                }
            }
        }

    }
}
