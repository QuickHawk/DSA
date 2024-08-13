public class SelectionSort implements Sorting {
    public int[] sort(int arr[]) {

        int n = arr.length;

        int result[] = arr.clone();

        for (int i = 0; i < n; i++) {

            int minIdx = i;
            for (int j = i; j < n; j++) {
                if (result[minIdx] > result[j])
                    minIdx = j;
            }

            int temp = result[i];
            result[i] = result[minIdx];
            result[minIdx] = temp;
        }

        return result;
    }
}
