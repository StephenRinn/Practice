class Solution {
    public void setZeroes(int[][] matrix) {
        
        /*  Creating a stack takes more space than using a marker pos in
            first column and row */
        Stack<int[]> stack = new Stack<int[]>();
        int[] temp = new int[2];
        
        /*  Find the zeroes and push them into the stack to prevent 
            duplicating zeroes */
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    stack.push(new int[]{i, j} );
                }
            }
        }
        
        /* Set the matrix to zeroes in place */
        while(!stack.empty()){
            temp = stack.pop();
            for(int i = 0; i < matrix[0].length; i++){
                matrix[temp[0]][i] = 0;
            }
            for(int i = 0; i < matrix.length; i++){
                matrix[i][temp[1]] = 0;
            }
        }
    }
}

