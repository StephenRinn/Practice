import java.util.*;

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        int startColor = image[sr][sc];
        Stack pixelStack = new Stack();
        int currentPixelRow = sr; 
        int currentPixelCol = sc;
        int numRow = image.length;
        int numCol = image[0].length;
        
        if(startColor == newColor){
            return image;
        }
        
        pixelStack.push(sc);
        pixelStack.push(sr);
        
        while(!pixelStack.empty()){
            
            currentPixelRow = (int) pixelStack.pop();
            currentPixelCol = (int) pixelStack.pop();
            image[currentPixelRow][currentPixelCol] = newColor;
            
            if(currentPixelRow + 1 < numRow){
                if(image[currentPixelRow + 1][currentPixelCol] == startColor){
                    pixelStack.push(currentPixelCol);
                    pixelStack.push(currentPixelRow + 1);
                }
            }
            if(currentPixelRow - 1 >= 0){
                if(image[currentPixelRow - 1][currentPixelCol] == startColor){
                    pixelStack.push(currentPixelCol);
                    pixelStack.push(currentPixelRow - 1);
                }
            }
            if(currentPixelCol + 1 < numCol){
                if(image[currentPixelRow][currentPixelCol + 1] == startColor){
                    pixelStack.push(currentPixelCol + 1);
                    pixelStack.push(currentPixelRow);
                }
            }
            if(currentPixelCol - 1 >= 0){
                if(image[currentPixelRow][currentPixelCol - 1] == startColor){
                    pixelStack.push(currentPixelCol - 1);
                    pixelStack.push(currentPixelRow);
                }
            }
            
        }
        
        return image;
    }
}