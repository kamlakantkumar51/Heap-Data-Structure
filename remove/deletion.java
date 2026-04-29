import java.util.*;

class MaxHeap {
    ArrayList<Integer> heap = new ArrayList<>();

    // insertion
    public void insert(int val) {
        heap.add(val);
        int i = heap.size() - 1;

        while (i > 0) {
            int parent = (i - 1) / 2;

            if (heap.get(i) > heap.get(parent)) {
                int temp = heap.get(i);
                heap.set(i, heap.get(parent));
                heap.set(parent, temp);
                i = parent;
            } else {
                break;
            }
        }
    }

    // print
    public void printHeap() {
        System.out.println(heap);
    }

    // peek
    public int peek() {
        if (heap.size() == 0) {
            System.out.println("Heap is empty");
            return -1;
        }
        return heap.get(0);
    }

    // remove (extract max)
    public int remove() {
        if (heap.size() == 0) {
            System.out.println("Heap is empty");
            return -1;
        }

        int root = heap.get(0);

        int last = heap.remove(heap.size() - 1);

        if (heap.size() > 0) {
            heap.set(0, last);

            int i = 0;
            int size = heap.size();

            while (true) {
                int left = 2 * i + 1;
                int right = 2 * i + 2;
                int largest = i;

                if (left < size && heap.get(left) > heap.get(largest)) {
                    largest = left;
                }

                if (right < size && heap.get(right) > heap.get(largest)) {
                    largest = right;
                }

                if (largest != i) {
                    int temp = heap.get(i);
                    heap.set(i, heap.get(largest));
                    heap.set(largest, temp);
                    i = largest;
                } else {
                    break;
                }
            }
        }

        return root;
    }
}

class Main {
    public static void main(String[] args) {
        MaxHeap h = new MaxHeap();

        h.insert(50);
        h.insert(30);
        h.insert(40);
        h.insert(10);
        h.insert(20);
        h.insert(60);

        h.printHeap();

        System.out.println("Peek element: " + h.peek());

        System.out.println("Removed element: " + h.remove());

        h.printHeap();
    }
}
