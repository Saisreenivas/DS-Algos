package Practice;

import java.util.*;

public class KthLargestElementInUnsortedArray {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int each: nums){
            if(q.size() < k){
                q.add(each);            
            }else{
                if(q.peek() < each){
                    q.poll();
                    q.add(each);
                }
            }
        }
        return q.peek();
        
    }
    public static void main(String[] args) {
        KthLargestElementInUnsortedArray x= new KthLargestElementInUnsortedArray();
        int[] nums = new int[]{3,2,1,5,6,4};
        int k = 2;
        /* Output for above case: 5 */
        // int[] nums = new int[]{3,2,3,1,2,4,5,5,6};
        // int k = 4;
        /* Output for above case: 4 */
        System.out.println(x.findKthLargest(nums, k));
    }
}