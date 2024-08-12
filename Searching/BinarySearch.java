import java.util.Arrays;

public class BinarySearch implements Search {

    // TODO: Write Binary Search Algorithm Here
    public int search(int arr[], int target) {

        if (arr.length == 0)
            return -1;

        // Binary search only works on sorted arrays
        Arrays.sort(arr);
        
        int n = arr.length;

        int l = 0;
        int r = n - 1;

        while (l < r) {
            int m = l + (r - l) / 2;

            if (target > arr[m])
                l = m + 1;

            else
                r = m;
        }

        return arr[l] == target ? l : -1;
    }
}
