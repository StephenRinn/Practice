class Solution {
    public int titleToNumber(String columnTitle) {
        int baseNum = 1;
        int sum = 0;
        int offset = 64;
        for(int i = columnTitle.length() - 1; i >=0; i--){
            sum += (columnTitle.charAt(i) - offset) * baseNum;
            baseNum = baseNum * 26;
        }
        return sum;
    }
}