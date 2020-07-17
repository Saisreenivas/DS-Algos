package Practice;

import java.util.*;

public class FindMedianInAStreamOfRunningIntegers {

    class DescendingOrderComparator implements Comparator<Integer>{
        @Override
        public int compare(Integer a, Integer b){
            return b-a;
        }
    }

    /** initialize your data structure here. */
    PriorityQueue<Integer> minHeap= new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new DescendingOrderComparator());

    double median = new Double(0);
    public FindMedianInAStreamOfRunningIntegers() {
        median = new Double(0);
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(new DescendingOrderComparator());
    
    }
    
    int check(PriorityQueue<Integer> minHeap, PriorityQueue<Integer> maxHeap){
        if(maxHeap.size() - minHeap.size() >=-1 && maxHeap.size() - minHeap.size() <= 1){
            return maxHeap.size() - minHeap.size();
        }else{
            // throw Exception("error");
            return 400;
        }
    }
    
    public void addNum(int num) {
        int check = check(maxHeap, minHeap);
        // System.out.println(check+ " " + num +" " + median + " " + maxHeap + " " + minHeap);
        switch(check){
            case -1://left half count < Right half count 
                if(num > median){ // num > median => num should be sent to right half.
                    minHeap.add(num);
                }else{ 
                    // num < median => 
                    //  1.send the top element from left side to right side
                    //  2.num should be sent to left half
                    minHeap.add(maxHeap.poll());
                    
                    maxHeap.add(num);
                }
                median = average(minHeap.peek(), maxHeap.peek());
                break;
            case 0:
                if(num < median){
                    maxHeap.add(num);
                    median = new Double(maxHeap.peek());
                }else{
                    minHeap.add(num);
                    median = new Double(minHeap.peek());
                }
                break;
            case 1://left half count < Right half count 
                if(num < median){ // num < median => num should be sent to left half.
                    maxHeap.add(num);
                }else{
                    // num > median => 
                    //  1.send the top element from right side to left side
                    //  2.num should be sent to right half
                    maxHeap.add(minHeap.poll());
                    minHeap.add(num);
                }

                median = average(minHeap.peek(), maxHeap.peek());
                break;
            default:
                System.out.println("error");
                break;
        }    
    }
    
    double average(int a, int b){
        // System.out.println(a + " " + b + " " + (double)(((double)a+(double)b)/2));
        return (((double)a+(double)b)/2);
    }
    
    public double findMedian() {
        return median;
    }

    public static void main(String[] args) {
        //Your MedianFinder object will be instantiated and called as such:
          FindMedianInAStreamOfRunningIntegers obj = new FindMedianInAStreamOfRunningIntegers();
        //   obj.addNum(num);
        //   double param_2 = obj.findMedian();
        obj.addNum(1);
        obj.addNum(2);
        System.out.println(obj.findMedian()+ " "); //--> 1.5
        obj.addNum(3); 
        System.out.println(obj.findMedian()+ " "); //--> 2
    }
}