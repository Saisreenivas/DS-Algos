package Practice;

import java.util.*;

public class KthLargestElementInAStream {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int k;
    public KthLargestElementInAStream(int k, int[] nums) {
        this.k = k;
        for(int val: nums){
            if(pq.size() < k){
                pq.add(val);   
            }else{
                if(val > pq.peek()){
                    // print("greater than k" + pq+" " + k + " " + val);
                    // println();
                    // print("removing: "+ pq.peek()+ " and adding " + val);
                    // println();
                    pq.add(val);
                    pq.poll();
                    // print("after adjusting: " + pq);
                    // println();
                }
            }            
        }
    }
    
    void print(String data){
        System.out.print(data + " ");
    }
    void println(){
        System.out.println();
    }
    public int add(int val) {
        // print(pq+" " + k + " " + val);
        // println();
        if(pq.size() < k){
            pq.add(val);  
            // print("less than k" + pq+" " + k + " " + val);
            // println();
            // print(pq.peek() + " ");
            // println();
        }else
        if(val > pq.peek()){
            // print("greater than k" + pq+" " + k + " " + val);
            // println();
            // print("removing: "+ pq.peek()+ " and adding " + val);
            // println();
            pq.add(val);
            pq.poll();
            // print("after adjusting: " + pq);
            // println();
        }
        
        return pq.peek();
    }

    public static void main(String[] args) {
        int k = 3;
        int[] nums = new int[]{4,5,8,2};
        KthLargestElementInAStream kthLargest = new KthLargestElementInAStream(k, nums);
        kthLargest.print("" + kthLargest.add(3));   // returns 4
        kthLargest.println();
        kthLargest.print("" + kthLargest.add(5));   // returns 5
        kthLargest.println();
        kthLargest.print("" + kthLargest.add(10));  // returns 5
        kthLargest.println();
        kthLargest.print("" + kthLargest.add(9));   // returns 8
        kthLargest.println();
        kthLargest.print("" + kthLargest.add(4));   // returns 8
        kthLargest.println();

    }
}