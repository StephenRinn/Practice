class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack aStack = new Stack();
        Stack bStack = new Stack();
        
        for(int i = 0; i < s.length(); i++){
            char temp = s.charAt(i);
            if(temp == '#' && !aStack.empty()){
                aStack.pop();
            }else if(temp == '#' && aStack.empty()){
                continue;
            }else{
                aStack.push(temp);
            }
        }
        
        for(int i = 0; i < t.length(); i++){
            char temp = t.charAt(i);
            if(temp == '#' && !bStack.empty()){
                bStack.pop();
            }else if(temp == '#' && bStack.empty()){
                continue;
            }else{
                bStack.push(temp);
            }
        }
        
        while(!aStack.empty() && !bStack.empty()){
            if(aStack.pop() != bStack.pop()){
                return false;
            }
        }
        
        if(!aStack.empty() || !bStack.empty()){
            return false;
        }
        
        return true;
        
    }
}