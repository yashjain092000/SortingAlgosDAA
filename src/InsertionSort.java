import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {4, 5, 9, 1, 0, -1, 18};
        System.out.println("Unsorted Array: " + Arrays.toString(array));
        int n = array.length;
        int currentPos;
        for (int nextPos = 1; nextPos < n; nextPos++) {
            int nextVal = array[nextPos];
        currentPos=nextPos;
// Element to insert.
            while (currentPos > 0 &&  array[currentPos - 1]>=nextVal) {
                array[currentPos] = array[currentPos - 1];
// Shift down.
                currentPos--;
// Check next smaller element.
            }
            // Insert nextVal at currentPos.
        array[currentPos]=nextVal;

        }
        System.out.println("Sorted Array: " + Arrays.toString(array));
        System.out.println("Submitted By:\n  Yash Jain\n  Section-D\n  181500823");


    }
}
