import java.util.Arrays;

public class HeapSort {
    public static void heapSort(Integer[] values) {
        int n = values.length;

        
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(values, n, i);
        }

        
        for (int i = n - 1; i > 0; i--) {
            swap(values, 0, i);
            heapify(values, i, 0);

        }

       
}

    private static void heapify(Integer[] values, int n, int i) {
            int smallest = i; // Assume the root is the smallest
            int left = 2 * i + 1; // Left child index
            int right = 2 * i + 2; // Right child index

            // If the left child is smaller than the root
            if (left < n && values[left] < values[smallest]) {
                smallest = left;
            }

            // If the right child is smaller than the smallest so far
            if (right < n && values[right] < values[smallest]) {
                smallest = right;
            }

            // If the smallest is not the root
            if (smallest != i) {
                swap(values, i, smallest);

                // Recursively heapify the affected sub-tree
                heapify(values, n, smallest);
            }

    }
    
    private static void swap(Integer[] values, int i, int j) {
            int temp = values[i];
            values[i] = values[j];
            values[j] = temp;
    }

    public static void main(String[] args) {
        int size = 20;
        Integer[] list = new Integer[size];

        for (int i = 0; i < list.length; i++) {
            list[i] = i;
        }

        System.out.println("Unsorted List: " + Arrays.toString(list));
        heapSort(list);
        System.out.println("  Sorted List:" + Arrays.toString(list));
    }
}
