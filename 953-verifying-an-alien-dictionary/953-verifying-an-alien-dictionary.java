import java.util.HashMap;

class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        
        HashMap<Character,Integer> orderMap = new HashMap<Character,Integer>();
        
        for(int i = 0; i < 26; i++){
            orderMap.put(order.charAt(i),i);
        }
        
        for(int i = 0; i < (words.length - 1); i++){
            if(words[i].length() <= words[i+1].length() - 1){
                for(int j = 0; j < words[i].length(); j++){
                    if(orderMap.get(words[i].charAt(j)) > orderMap.get(words[i+1].charAt(j))){
                        return false;
                    }else if(orderMap.get(words[i].charAt(j)) < orderMap.get(words[i+1].charAt(j))){
                        break;
                    }
                }
            }else{
                for(int j = 0; j < words[i + 1].length(); j++){
                    if(orderMap.get(words[i+1].charAt(j)) < orderMap.get(words[i].charAt(j))){
                        return false;
                    }else if(orderMap.get(words[i+1].charAt(j)) == orderMap.get(words[i].charAt(j)) && j == (words[i + 1].length() - 1)){
                        if(words[i+1].equals(words[i])){
                            break;
                        }else{return false;}
                    }else if(orderMap.get(words[i+1].charAt(j)) > orderMap.get(words[i].charAt(j))){
                        break;
                    }
                }
            }
        }
        
        return true;
        
    }
}