package Algorithms.HeapSort;

import java.util.Arrays;

public class HeapSort {
    /**
     * Main Heap Sort driver method.
     * Sorts the array in ascending order in-place.
     * Time Complexity Goal: O(n log n)
     * Space Complexity Goal: O(1) auxiliary space
     */
    public static void heapSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int n = arr.length;

        // building a Max-Heap out of the raw array
        for (int i = (n / 2) - 1; i >= 0; i--){
            heapify(arr, n, i);
        }

        // sorting
        for (int i = n - 1; i >= 0; i--){ // (n - 1) means the last element in the tree
            swap(arr, i, 0);         // swaping the first with the current

            heapify(arr, i, 0); // heapifying the new subtree
        }

    }

    private static void heapify(int[] arr, int heapSize, int rootIdx) {
        int maxIdx = rootIdx;
        int leftChildIdx = 2 * rootIdx + 1;
        int rightChildIdx = 2 * rootIdx + 2;

        if (leftChildIdx < heapSize && arr[leftChildIdx] > arr[maxIdx]){
            maxIdx = leftChildIdx;
        }

        if (rightChildIdx < heapSize && arr[rightChildIdx] > arr[maxIdx]){
            maxIdx = rightChildIdx;
        }

        // if the value of the parent (arr[rootIdx]) is not the greater of the trio
        // (parent, leftChild and rightChild), swap it with the greater child and
        // heapify the new subtree
        if (maxIdx != rootIdx){
            swap(arr, rootIdx, maxIdx);

            heapify(arr, heapSize, maxIdx);
        }

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Interactive Verification Simulator
    public static void main(String[] args) {
        int[] engagementScores = {45, 12, 85, 32, 99, 73, 56, 10};

        System.out.println("=== Embedded Analytics Engine ===");
        System.out.println("Raw Unsorted Engagement Scores: " + Arrays.toString(engagementScores));

        // Execute your custom, in-place heap sort
        heapSort(engagementScores);

        System.out.println("Sorted Engagement Scores (Ascending): " + Arrays.toString(engagementScores));
    }
}
