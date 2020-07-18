package Practice;

import java.util.*;
public class FloodFillAlgorithm {
    
    void floodFillUtil(int[][] image,int row,int column,int oldColor,int newColor){
        if(row< 0 ||column <0 || row>= image.length|| column >= image[0].length)
            return;
        
        if(oldColor != image[row][column])
            return;
        
        image[row][column] = newColor;
        floodFillUtil(image, row-1, column, oldColor, newColor);
        floodFillUtil(image, row+1, column, oldColor, newColor);
        floodFillUtil(image, row, column-1, oldColor, newColor);
        floodFillUtil(image, row, column+1, oldColor, newColor);
    }

    int[][] floodFill(int[][] image, int row, int column, int newColor){
        if(image[row][column] == newColor)
            return image;
        int oldColor = image[row][column];
        floodFillUtil(image, row, column, oldColor, newColor);
        return image;
    }

    public static void main(String[] args) {
        FloodFillAlgorithm x = new FloodFillAlgorithm();
        /* int image[][] = {{0,0,1},{0,1,1}};
        int row = 1;
        int column = 1;
        int newColor = 1;
        //Output for the above is same as input 
        */
        int image[][] = {{1, 1, 1, 1, 1, 1, 1, 1}, 
                        {1, 1, 1, 1, 1, 1, 0, 0}, 
                        {1, 0, 0, 1, 1, 0, 1, 1}, 
                        {1, 2, 2, 2, 2, 0, 1, 0}, 
                        {1, 1, 1, 2, 2, 0, 1, 0}, 
                        {1, 1, 1, 2, 2, 2, 2, 0}, 
                        {1, 1, 1, 1, 1, 2, 1, 1}, 
                        {1, 1, 1, 1, 1, 2, 2, 1}, 
                        }; ;
        int row = 4;
        int column = 4;
        int newColor = 3;
        /* Updated screen after call to floodFill:
            1 1 1 1 1 1 1 1
            1 1 1 1 1 1 0 0
            1 0 0 1 1 0 1 1
            1 3 3 3 3 0 1 0
            1 1 1 3 3 0 1 0
            1 1 1 3 3 3 3 0
            1 1 1 1 1 3 1 1
            1 1 1 1 1 3 3 1 */
        image = x.floodFill(image, row, column, newColor);
        for(int[] eachRow: image)
            System.out.println(Arrays.toString(eachRow));
    }
}