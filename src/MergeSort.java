import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args) {
        int[] a = {4, 5, 9, 1, 0, -1, 18};
        System.out.println("Unsorted Array: " + Arrays.toString(a));
        int leftArraySize=a.length/2;
        int rightArraySize=a.length-leftArraySize;
        int[] leftSequence=new int[leftArraySize];
        int[] rightSequence=new int[rightArraySize];
        int[] outputSequence=new int[a.length];
        System.arraycopy(a, 0, leftSequence, 0, leftArraySize); //copy first half items from unsorted to left array
        System.arraycopy(a, leftArraySize, rightSequence, 0, rightArraySize); //copy second half items from unsorted to right array
        Arrays.sort(leftSequence); //Sort left array
        Arrays.sort(rightSequence); //Sort right array
        System.out.println("Left Array: " + Arrays.toString(leftSequence));
        System.out.println("Right Array: " + Arrays.toString(rightSequence));
//merge sort starts here------->
        int i = 0; // Index into the left input sequence.
        int j = 0; // Index into the right input sequence.
        int k = 0; // Index into the output sequence.
// While there is data in both input sequences
        while (i < leftSequence.length && j < rightSequence.length) {
// Find the smaller and insert it into the output sequence.
            if (leftSequence[i]<rightSequence[j]) {
                outputSequence[k++] = leftSequence[i++];
            } else {
                outputSequence[k++] = rightSequence[j++];
            }
        }
// One of the sequences has more items to copy.
// Copy remaining input from left sequence into the output.
        while (i < leftSequence.length) {
            outputSequence[k++] = leftSequence[i++];
        }
// Copy remaining input from right sequence into output.
        while (j < rightSequence.length) {
            outputSequence[k++] = rightSequence[j++];
        }
        System.out.println("Sorted Array: " + Arrays.toString(outputSequence));
        System.out.println("Submitted By:\n  Yash Jain\n  Section-D\n  181500823");
    }
}
