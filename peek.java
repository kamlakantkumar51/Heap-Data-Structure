import java.util.*;
class MaxHeap{
    ArrayList<Integer> heap= new ArrayList<>();
    //insertion function
    public void insert(int val){
        heap.add(val);
        int i = heap.size()-1;
        //swapping according to heap condition
        while(i > 0){
            int parent = (i-1)/2;
            if(heap.get(i) > heap.get(parent)){
                //swapping
                int temp = heap.get(i);
                heap.set(i,heap.get(parent));
                heap.set(parent,temp);
                i = parent;
            }else{
                break;
            }
        }
    }
    public void printHeap(){
        System.out.println(heap);
    }
    //peek function
    public int peek(){
        if(heap.size() == 0){
            System.out.println("heap is empty");
            return -1;
        }
        return heap.get(0);
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
        
        System.out.println("peek element are : "+h.peek());
        
    }
}
