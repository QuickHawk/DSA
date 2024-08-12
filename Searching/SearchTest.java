public class SearchTest {

    // Define test cases in a table-driven format
    static Object[][] testCases = {
            // {input array, target, expected output}
            { new int[] { 1, 3, 5, 7, 9, 11, 13 }, 7, 3 }, // Test Case 1: Element Present in the Middle
            { new int[] { 2, 4, 6, 8, 10 }, 2, 0 }, // Test Case 2: Element Present at the Beginning
            { new int[] { 5, 10, 15, 20, 25 }, 25, 4 }, // Test Case 3: Element Present at the End
            { new int[] { 1, 3, 5, 7, 9 }, 4, -1 }, // Test Case 4: Element Not Present in the Array
            { new int[] {}, 5, -1 }, // Test Case 5: Empty Array
            { new int[] { 10 }, 10, 0 }, // Test Case 6: Single Element Array (Element is Target)
            { new int[] { 10 }, 5, -1 }, // Test Case 7: Single Element Array (Element is Not Target)
            { new int[] { 1, 2, 2, 2, 3, 4, 5 }, 2, 1 }, // Test Case 8: Array with Duplicates (Target Present)
            { new int[] { 1, 2, 2, 2, 3, 4, 5 }, 6, -1 }, // Test Case 9: Array with Duplicates (Target Not Present)
            { createLargeArray(1000000), 999999, 999998 }, // Test Case 10: Large Array with Target Present
            { createLargeArray(1000000), 1000002, -1 }, // Test Case 11: Large Array with Target Not Present
            { new int[] { 7, 8, 9, 10, 11 }, 7, 0 }, // Test Case 12: Target is the First Element
            { new int[] { 7, 8, 9, 10, 11 }, 11, 4 }, // Test Case 13: Target is the Last Element
            { new int[] { 5, 5, 5, 5, 5 }, 5, 0 }, // Test Case 14: Array with All Identical Elements (Target
                                                   // Present)
            { new int[] { 5, 5, 5, 5, 5 }, 6, -1 }, // Test Case 15: Array with All Identical Elements (Target Not
                                                    // Present)
    };

    static void test(Search searchFn) {

        int n = testCases.length;
        int count = 0;

        // Run the test cases
        for (int i = 0; i < testCases.length; i++) {
            int[] array = (int[]) testCases[i][0];
            int target = (int) testCases[i][1];
            int expected = (int) testCases[i][2];
            int result = searchFn.search(array, target);

            count += (result == expected) ? 1 : 0;

            System.out.println("Test Case " + (i + 1) + ": " +
                    (result == expected ? "Passed" : "Failed") +
                    " (Expected: " + expected + ", Got: " + result + ")");
        }

        System.out.println(count + "/" + n + " test cases passed!!!");
    }

    
    public static void main(String[] args) {
        
        System.out.println("Test : Linear Search");
        System.out.println();
        test(new LinearSearch());
        System.out.println();
        
        System.out.println("Test : Binary Search");
        System.out.println();
        test(new BinarySearch());
    }

    // Utility method to create a large array for testing
    private static int[] createLargeArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
        }
        return array;
    }
}
