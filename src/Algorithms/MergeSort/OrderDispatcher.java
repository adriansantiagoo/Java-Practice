package Algorithms.MergeSort;

public class OrderDispatcher {
    public static void sortOrders(Order[] orders) {
        if (orders == null || orders.length <= 1) {
            return;
        }
        mergeSort(orders, 0, orders.length - 1);
    }

    private static void mergeSort(Order[] arr, int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    private static void merge(Order[] arr, int left, int mid, int right) {
        Order[] temp = new Order[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            int leftWeight = arr[i].getTier().getWeight();
            int rightWeight = arr[j].getTier().getWeight();

            if (leftWeight > rightWeight) {
                temp[k] = arr[i];
                i++;
            } else if (rightWeight > leftWeight) {
                temp[k] = arr[j];
                j++;
            } else {
                if (arr[i].getTimestamp() <= arr[j].getTimestamp()) {
                    temp[k] = arr[i];
                    i++;
                } else {
                    temp[k] = arr[j];
                    j++;
                }
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
    }
}
