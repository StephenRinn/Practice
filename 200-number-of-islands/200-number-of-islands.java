class Solution {
    public int numIslands(char[][] grid) {
        int max = 1;
        boolean populated = false;
        int[][] map = new int[grid.length][grid[0].length];
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    map[i][j] = -1;
                    populated = true;
                }else{
                    map[i][j] = 0;
                }
            }
        }
        
        if(!populated){return 0;}
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(map[i][j] == -1){
                    map = isolate(map, i , j, max);
                    max++;
                }
            }
        }
        
        return max - 1;
            
    }
    
    
    public int[][] isolate(int[][] map, int row, int col, int num){
        boolean complete = false;
        int rowSize = map.length;
        int colSize = map[0].length;
        Stack<Integer> stack = new Stack<Integer>();
        
        stack.push(col);
        stack.push(row);
        
        while(!stack.isEmpty()){
            row = stack.pop();
            col = stack.pop();
            if(row > 0){
                if(map[row - 1][col] == -1){
                    map[row - 1][col] = num;
                    stack.push(col);
                    stack.push(row - 1);
                }
            }
            if(col > 0){
                if(map[row][col - 1] == -1){
                    map[row][col - 1] = num;
                    stack.push(col - 1);
                    stack.push(row);
                }
            }
            if(row < rowSize - 1){
                if(map[row + 1][col] == -1){
                    map[row + 1][col] = num;
                    stack.push(col);
                    stack.push(row + 1);
                }
            }
            if(col < colSize - 1){
                if(map[row][col + 1] == -1){
                    map[row][col + 1] = num;
                    stack.push(col + 1);
                    stack.push(row);
                }
            }
        }
        
        return map;
    }
    
    
}