package Practice;

import java.util.*;

public class DistinctNumbersInAWindow {
    
    public int[] dNums(int[] A, int B) {
        int[] res = new int[A.length-B+1];
        HashMap<Integer,Integer> mp= new HashMap<Integer,Integer>();
        
        for(int i=0;i<B;i++){
            int val =0;
            if(mp.get(A[i]) != null)
                val = mp.get(A[i]);
            mp.put(A[i], val + 1);
        }
        int j=0;
        res[j] = mp.size();
        j++;
        for(int i=B;i<A.length;i++){
            if(mp.get(A[i-B]) ==1){
                mp.remove(A[i-B]);
            }else{
                mp.put(A[i-B], mp.get(A[i-B])-1);
            }
            int val1 =0;
            if(mp.get(A[i]) != null)
                val1 = mp.get(A[i]);
            mp.put(A[i], val1+1);
            res[j]= mp.size();
            j++;
        }
        
        return res;
    }

    public static void main(String[] args) {
        DistinctNumbersInAWindow x = new DistinctNumbersInAWindow();
        int k = 3;
        int[] arr = new int[]{3,1,2,6};
        System.out.println(Arrays.toString(x.dNums(arr, k)));
    }
}