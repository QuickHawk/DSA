public class MergeSort implements Sorting {
  
    void merge(int arr[], int i, int m, int j) {

        int x = i;
        int y = m + 1;

        while (x <= y && y <= j) {
            if (arr[x] > arr[y]) {

                // Shift and place
                int temp = arr[y];
                for (int z = y-1; z >= x; z--) 
                    arr[z+1] = arr[z];

                arr[x] = temp;
                
                x++;
                y++;
            } else {
                x++;
            }
        }
    }

    void mergeSort(int arr[], int i, int j) {

        if (i >= j)
            return;

        int m = i + (j - i) / 2;

        // Divide at mid point
        mergeSort(arr, i, m);
        mergeSort(arr, m + 1, j);

        // Merge 
        merge(arr, i, m, j);
    }

    public int[] sort(int arr[]) {

        int result[] = arr.clone();
        int n = arr.length;

        mergeSort(result, 0, n - 1);

        return result;
    }

}
