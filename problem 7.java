// binary search
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 8, 6, 5, 11, 13, 14};
        Arrays.sort(arr); // Sort the array before binary search

        int ele = 34;
        int flag = 0;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (ele == arr[mid]) {
                flag = 1;
                break;
            }
            if (ele > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (flag == 1) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
    }
    //  worst Time Complexity: O(log n)
    //  best time Complexity: O(1)
    // Space Complexity: O(1)
}