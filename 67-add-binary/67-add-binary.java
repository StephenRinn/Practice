class Solution {
    public String addBinary(String a, String b) {
        
        int overflow = 0, positionA = a.length()-1, positionB = b.length()-1, charOffset = -48;
        StringBuilder output = new StringBuilder();
        
        // Perform bitwise addition while adding overflow to the string
        while( positionA >= 0 || positionB >= 0){
            int total = overflow;
            if(positionA >= 0){
                total += a.charAt(positionA) + charOffset;
                positionA--;
            }
            if(positionB >= 0){
                total += b.charAt(positionB) + charOffset;
                positionB--;
            }
            output.append(total % 2);
            overflow = total / 2;
        }
        
        // Check for overflow on final digit before reversing to correct order
        if(overflow != 0){
            output.append(overflow);
        }
        
        return output.reverse().toString();
        
    }
}