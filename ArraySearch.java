public class ArraySearch {
    public void NormalSearch(int[] array, int element){
        for(int i=0;i<array.length;i++){
            if(element == array[i]){
                System.out.println(true);
                return;
            }
        }

        System.out.println(false);
    }
    
    public static void main(String[] args) {
        int[] list = new int[]{3,6,3,1,6,8,4,5};
        ArraySearch x = new ArraySearch();
        int findInt = 8;
        x.NormalSearch(list, findInt);
    }
}