import java.util.Arrays;

public class SortTest {

    // Define test cases in a table-driven format
    static Object[][] testCases = {
            // {input array, expected sorted array}
            { new int[] { 5, 3, 8, 6, 2, 7, 4, 1 }, new int[] { 1, 2, 3, 4, 5, 6, 7, 8 } }, // Test Case 1: Random
                                                                                            // Unsorted Array
            { new int[] { 1, 2, 3, 4, 5 }, new int[] { 1, 2, 3, 4, 5 } }, // Test Case 2: Already Sorted Array
            { new int[] { 5, 4, 3, 2, 1 }, new int[] { 1, 2, 3, 4, 5 } }, // Test Case 3: Reverse Sorted Array
            { new int[] { 5 }, new int[] { 5 } }, // Test Case 4: Single Element Array
            { new int[] {}, new int[] {} }, // Test Case 5: Empty Array
            { new int[] { 5, 5, 5, 5, 5 }, new int[] { 5, 5, 5, 5, 5 } }, // Test Case 6: All Elements the Same
            { new int[] { 3, -1, 0, -3, 2 }, new int[] { -3, -1, 0, 2, 3 } }, // Test Case 7: Array with Negative
                                                                              // Numbers
            { new int[] { Integer.MAX_VALUE, 1, 2, 0, Integer.MIN_VALUE },
                    new int[] { Integer.MIN_VALUE, 0, 1, 2, Integer.MAX_VALUE } }, // Test Case 8: Array with
                                                                                   // Extreme Values
            { createLargeArray(10000), createSortedLargeArray(10000) }, // Test Case 9: Large Array
    };

    static void test(Sorting sortFn) {

        int n = testCases.length;
        int count = 0;

        // Run the test cases
        for (int i = 0; i < testCases.length; i++) {
            int[] array = (int[]) testCases[i][0];
            int[] expected = (int[]) testCases[i][1];
            int[] result = sortFn.sort(array.clone());

            System.out.println("Test Case " + (i + 1) + ": " +
                    (Arrays.equals(result, expected) ? "Passed" : "Failed"));

            count += (Arrays.equals(result, expected)) ? 1 : 0;
        }

        System.out.println(count + "/" + n + " test cases passed!!");
    }

    public static void main(String args[]) {
        System.out.println("Testing : Bubble Sort");
        System.out.println();
        test(new BubbleSort());
        System.out.println();
        
        System.out.println("Testing : Insertion Sort");
        System.out.println();
        test(new InsertionSort());
        System.out.println();

        System.out.println("Testing : Selection Sort");
        System.out.println();
        test(new SelectionSort());
        System.out.println();

        System.out.println("Testing : Merge Sort");
        System.out.println();
        test(new MergeSort());
        System.out.println();

        System.out.println("Testing : Quick Sort");
        System.out.println();
        test(new QuickSort());
        System.out.println();

    }

    // Utility method to create a large unsorted array for testing
    private static int[] createLargeArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = size - i;
        }
        return array;
    }

    // Utility method to create a sorted large array for testing
    private static int[] createSortedLargeArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
        }
        return array;
    }

}
