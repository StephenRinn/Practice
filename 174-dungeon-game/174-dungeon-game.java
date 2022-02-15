import java.util.Arrays;
import java.lang.Math;

class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        if(dungeon.length == 1 && dungeon[0].length == 1){
            if(dungeon[0][0] > 0){
                return 1;
            }else{
                return (-1*dungeon[0][0]) + 1;
            }
        }
        
        int[][] calc = new int[dungeon.length][dungeon[0].length];
        int val = dungeon[dungeon.length - 1][dungeon[0].length - 1];
        
        if(val > 0){val = 0;}

        for(int[] arr: calc){
            Arrays.fill(arr, (-5000));
        }
        calc[dungeon.length - 1][dungeon[0].length - 1] = val;
        
        for(int i = (calc.length - 1); i >= 0; i-- ){
            for(int j = (calc[0].length - 1); j >= 0; j--){
                if(i != 0){
                    calc[i-1][j] = Math.max(calc[i-1][j], dungeon[i-1][j] + calc[i][j]);
                    if(calc[i-1][j] > 0){calc[i-1][j] = 0;}
                }
                if(j != 0){
                    calc[i][j-1] = Math.max(calc[i][j-1], dungeon[i][j-1] + calc[i][j]);
                    if(calc[i][j-1] > 0){calc[i][j-1] = 0;}
                }
            }
        }
        return (-1*calc[0][0]) + 1;
        
    }
}