import java.util.Arrays;
public class CountingSort {
    public static void sort(int[] arr) {
        int arrayLength = arr.length;
        if (arrayLength == 0)
            return;
        // find maximum and minimum values
        int max = arr[0], min = arr[0];
        for (int i = 1; i < arrayLength; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        int range = max - min + 1;

        int[] count = new int[range];
        //initialize the occurrence of each element in the count array
        for (int i = 0; i < arrayLength; i++)
            count[arr[i] - min]++;
        //calculate sum of indexes
        for (int i = 1; i < range; i++)
            count[i] += count[i - 1];
        //modify original array according to the sum count
        int j = 0;
        for (int i = 0; i < range; i++)
            while (j < count[i])
                arr[j++] = i + min;
    }

    public static void main(String[] args) {

        int[] testArray = { 4, 5, 9, 1, 0, -1, 18 };

        System.out.println("Elements before applying counting sort: " + Arrays.toString(testArray));

        sort(testArray);

        System.out.println("Elements after applying counting sort:  " + Arrays.toString(testArray));
        System.out.println("Submitted By:\n  Yash Jain\n  Section-D\n  181500823");


    }

}

