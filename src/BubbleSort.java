import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {4, 5, 9, 1, 0, -1, 18};
        System.out.println("Unsorted Array: " + Arrays.toString(a));
        int n = a.length;
        int out, in;
        for (out = 0; out < n; out++) {// outer loop
            for (in = 0; in < n-out-1; in++) {// inner loop (forward)
                if (a[in] > a[in + 1]) {
                    // swap them
                    int temp = a[in];
                    a[in] = a[in + 1];
                    a[in + 1] = temp;
                }
            }
    } // end bubbleSort()

        System.out.println("Sorted Array: " + Arrays.toString(a));

        System.out.println("Submitted By:\n  Yash Jain\n  Section-D\n  181500823");
}
}
