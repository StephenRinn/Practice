class Solution {
    public int[] prisonAfterNDays(int[] cells, int n) {
        
        n = n%14==0? 14 : n%14;
        int[] cellsFinal = new int[8];
        StringBuilder parse = new StringBuilder();
        String input;
        
        for(int i = 0; i < 8; i++){
            parse.append(cells[i]);
        }
        
        input = parse.toString();
        
        Integer working = Integer.parseInt(input,2);
        Integer testing;
        
        
        
        for(int i = 0; i < n; i++){
            testing = working ^ 0b11111111;
            testing = ((testing << 1) & (testing >> 1));
            working = ((working << 1) & (working >> 1));
            working = (working | testing) & 0b01111110;
        }
        
        input = Integer.toBinaryString(working);
        
        for(int i = 0; i < input.length(); i++){
            cellsFinal[7-i] = Character.getNumericValue(input.charAt((input.length() - i) - 1));
        }
        
        return cellsFinal;
    }
}