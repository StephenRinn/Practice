// 25 min work time (slowed down by trying to find edge cases to ensure first submission success)

import java.util.HashMap;

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        
        int[] digitCount = new int[10];
        int[] usedCount = new int[10];
        int arraySize = 10, count = 0;
        HashMap<Integer, Integer> orderedValue = new HashMap<Integer, Integer>();
        
        // find total of each digit in the array
        for(int i = 0; i < digits.length; i++){
            digitCount[digits[i]]++;
        }
        
        // find all possible solutions in numerical order
        for(int i = 1; i < arraySize; i++){
            Arrays.fill(usedCount, 0);
            if(digitCount[i] > 0){
                usedCount[i]++;
                for(int j = 0; j < arraySize; j++){
                    if(digitCount[j] - usedCount[j] > 0){
                        usedCount[j]++;
                        for(int n = 0; n < arraySize; n += 2){
                            if(digitCount[n] - usedCount[n] > 0){
                                orderedValue.put(count,((((i*10)+j)*10)+n));
                                count++;
                            }
                        }
                        usedCount[j]--;
                    }
                }
            }
        }
        
        
        // Create the return array and cycle through hashmap
        int[] result = new int[count];
        for(int i = 0; i < count; i++){
            result[i] = orderedValue.get(i);
        }
        
        return result;
        
    }
}