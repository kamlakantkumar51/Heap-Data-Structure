import java.util.*;
class HeapSort {
    // Heapify function (Max Heap)
    public static void heapify(int arr[], int n, int i) {
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if (left < n && arr[left] > arr[largest])
            largest = left;

        if (right < n && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest); // recursive call
        }
    }

    // Heap Sort
    public static void heapSort(int arr[]) {
        int n = arr.length;

        // Step 1: Build Max Heap
        for (int i = n/2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Step 2: Extract elements
        for (int i = n - 1; i > 0; i--) {
            // swap root with last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // heapify reduced heap
            heapify(arr, i, 0);
        }
    }

    // Print array
    public static void printArray(int arr[]) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = {50, 30, 40, 10, 20, 60};

        heapSort(arr);
        printArray(arr);
    }
}
