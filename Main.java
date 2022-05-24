import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Bubble sort
        int[] array1 = {4, 1, 3, 9, 7};
        BubbleSort.bubbleSort(array1);
        System.out.println("Bubble sorted array");
        System.out.println(Arrays.toString(array1));

        int[] array2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        BubbleSort.bubbleSort(array2);
        System.out.println(Arrays.toString(array2));

        //Quick sort
        int[] quickSort1 = { 4, 1, 3, 9, 7};
        int size = quickSort1.length;
        QuickSort.quickSort(quickSort1, 0, size - 1);
        System.out.println(Arrays.toString(quickSort1));

        int[] quickSort2 = { 2, 1, 6, 10, 4, 1, 3, 9, 7};
        int size2 = quickSort2.length;
        QuickSort.quickSort(quickSort2, 0, size2 - 1);
        System.out.println(Arrays.toString(quickSort2));

    }

}
