class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        HashMap<Character,Integer> input = new HashMap<Character,Integer>();
        HashMap<Character,Integer> test = new HashMap<Character,Integer>();
        
        for(int i = 0; i < s1.length(); i++){
            input.put(s1.charAt(i), input.getOrDefault(s1.charAt(i),0) + 1);
        }
        
        for(int i = 0; i <= s2.length() - s1.length(); i++){
            if(input.containsKey(s2.charAt(i))){
                for(int j = i; j < i + s1.length(); j++){
                    test.put(s2.charAt(j), test.getOrDefault(s2.charAt(j),0) + 1);
                }
                if(test.equals(input)){
                    return true;
                }
                test.clear();
            }
        }
        return false;
    }
}