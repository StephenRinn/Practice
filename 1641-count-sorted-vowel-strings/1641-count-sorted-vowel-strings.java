class Solution {
    public int countVowelStrings(int n) {
        return countRep(n,0);
    }
    
    public int countRep(int n, int start){
        int sum = 0;
        if(n == 0){return 1;}
        for(int i = start; i < 5; i++){
            sum += countRep(n-1,i);
        }
        return sum;
    }
}