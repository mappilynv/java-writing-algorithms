public class CountingSort {

    int getMax(int[] a, int n){
        int max = a[0];
        for (int i = 1; i < n; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        return  max;
    }

    void countSort(int[] a, int n){
        int[] output = new int[n+1];
        int max = getMax(a, n);
        int[] count = new int[max + 1];

        for(int i = 0; i<= max; ++i){
            count[i] = 0;
        }

        for(int i = 0; i < n; i++){
            count[a[i]]++;
        }

        for(int i = 1; i <= max; i++){
            count[i] += count[i-1];
        }
    }


}
