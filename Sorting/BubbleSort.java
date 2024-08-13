public class BubbleSort implements Sorting {
    /**
     * Sorts the array using the Bubble Sort Algorithm
     */
    public int[] sort(int arr[]) {

        int result[] = arr.clone();

        for (int i=0;i<arr.length;i++) {
            for (int j=0;j<arr.length-1;j++) {
                if (result[j] > result[j+1]) {
                    int temp = result[j];
                    result[j] = result[j+1];
                    result[j+1] = temp;
                }
            }
        }

        return result;
    }
}