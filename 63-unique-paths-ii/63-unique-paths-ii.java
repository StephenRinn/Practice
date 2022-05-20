class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[] path = new int[obstacleGrid[0].length];
        path[0] = 1;
        
        for(int[] row: obstacleGrid){
            for(int i = 0; i < obstacleGrid[0].length; i++){
                if(row[i] == 1){
                    path[i] = 0;
                }
                if(i > 0 && row[i] == 0){
                    path[i] += path[i-1];
                }
            }
        }

        return path[obstacleGrid[0].length - 1];
    }
}