class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sBuilder = new StringBuilder();
        StringBuilder tBuilder = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
            char temp = s.charAt(i);
            if(temp == '#' && sBuilder.length() != 0){
                System.out.println(sBuilder.length());
                sBuilder.deleteCharAt(sBuilder.length() - 1);
            }else if(temp == '#' && sBuilder.length() == 0){
                continue;
            }else{
                sBuilder.append(temp);
            }
        }
        
        for(int i = 0; i < t.length(); i++){
            char temp = t.charAt(i);
            if(temp == '#' && tBuilder.length() != 0){
                tBuilder.deleteCharAt(tBuilder.length() - 1);
            }else if(temp == '#' && tBuilder.length() == 0){
                continue;
            }else{
                tBuilder.append(temp);
            }
        }
        
        return (sBuilder.toString().equals(tBuilder.toString()));
        
    }
}