public class LinearSearch implements Search{

    // TODO: Write Linear Search Algorithm Here
    public int search(int arr[], int target) {

        for (int i=0;i<arr.length;i++)
            if (arr[i] == target)
                return i;

        return -1;
    }
}
