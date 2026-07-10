package Algorithms.PlaylistCompatibility_system;

import java.util.Arrays;

public class CompatibilityMatcher {
    public static long countInversions(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return 0;
        }
        return mergeSortAndCount(arr, 0, arr.length - 1);
    }
    private static long mergeSortAndCount(int[] arr, int left, int right) {
        long count = 0;

        if (left < right) {
            int mid = left + (right - left) / 2;

            count += mergeSortAndCount(arr, left, mid); // left half inversions
            count += mergeSortAndCount(arr, mid + 1, right); // right half inversions
            count += mergeAndCount(arr, left, mid, right); // split inversions
        }

        return count;
    }
    private static long mergeAndCount(int[] arr, int left, int mid, int right) {
        long inversions = 0;

        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
                inversions += mid - i + 1;
            }
            k++;
        }

        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while (j <= right) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for (int x = 0; x < temp.length; x++) {
            arr[left + x] = temp[x];
        }

        return inversions;
    }

    public static void main(String[] args) {
        int[] userBRanking = {1, 4, 3, 5, 2};

        System.out.println("User B's Taste Sequence: " + Arrays.toString(userBRanking));

        long totalInversions = countInversions(userBRanking);

        System.out.println("Sorted Sequence: " + Arrays.toString(userBRanking));
        System.out.println("Computed Inversion Score: " + totalInversions);
        System.out.println("Verification: " + (totalInversions == 4 ? "PASSED (Perfect Compatibility Math!)" : "FAILED"));
    }
}
