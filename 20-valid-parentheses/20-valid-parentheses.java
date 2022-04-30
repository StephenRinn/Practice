class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char temp;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push('(');
            }else if(s.charAt(i) == '{'){
                stack.push('{');
            }else if(s.charAt(i) == '['){
                stack.push('[');
            }else if(s.charAt(i) == ')'){
                if(stack.empty()){
                    return false;
                }
                temp = stack.pop();
                if(temp != '('){
                    return false;
                }
            }else if(s.charAt(i) == '}'){
                if(stack.empty()){
                    return false;
                }               
                temp = stack.pop();
                if(temp != '{'){
                    return false;
                }
            }else if(s.charAt(i) == ']'){
                if(stack.empty()){
                    return false;
                }     
                temp = stack.pop();
                if(temp != '['){
                    return false;
                }
            }
        }
        
        if(stack.empty()){
            return true;
        }
        return false;
    }
}