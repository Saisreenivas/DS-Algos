import java.util.*;
public class ArraySort {
    public void NormalSort(int[] array ){
        for(int i=1;i<array.length;i++){
            int j = i;
            while(array[j] < array[j-1]){
                int tmp = array[j];
                array[j] = array[j-1];
                array[j-1] = tmp;
                j--;
                if(j == 0){
                    break;
                }
            }
            // for(int j=i+1;j<array.length;j++){
            //     if(array[i]> array[j]){

            //     }
            // }
        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        int[] list = new int[]{7,5,0,31,5,1,6,8};
        System.out.println(Arrays.toString(list));
        ArraySort x= new ArraySort();
        x.NormalSort(list);
    }
}