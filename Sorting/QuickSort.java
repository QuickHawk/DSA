public class QuickSort implements Sorting {

    int partition(int arr[], int low, int high) {

        int pivot = arr[high];

        int i = low - 1;

        for (int j = low; j <= high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    void quickSort(int arr[], int low, int high) {

        if (low < high) {

            int idx = partition(arr, low, high);

            quickSort(arr, low, idx - 1);
            quickSort(arr, idx + 1, high);
        }

    }

    public int[] sort(int arr[]) {

        int result[] = arr.clone();

        quickSort(result, 0, result.length - 1);

        return result;
    }

}
