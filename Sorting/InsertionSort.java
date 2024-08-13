public class InsertionSort implements Sorting {

    public int[] sort(int[] arr) {

        if (arr.length == 0)
            return arr;

        int n = arr.length;

        int result[] = new int[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            int j = 0;

            // Find the index to put it in
            for (; j < k; j++) {
                if (result[j] > arr[i])
                    break;
            }

            // Shift the elements one step to right
            for (int x = k-1; x >= j ; x--)
                result[x+1] = result[x];

            // Put the current element at the position
            result[j] = arr[i];

            k++;
        }

        return result;
    }

}
