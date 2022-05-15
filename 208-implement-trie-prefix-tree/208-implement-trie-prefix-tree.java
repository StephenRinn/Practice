class Trie {
    
    HashSet<String> wordList;
    
    public Trie() {
        wordList = new HashSet<String>();
    }
    
    public void insert(String word) {
        wordList.add(word);
    }
    
    public boolean search(String word) {
        return wordList.contains(word);
    }
    
    public boolean startsWith(String prefix) {
        for(String s: wordList){
            if(s.length() >= prefix.length()){ 
                if(s.substring(0, prefix.length()).equals(prefix)){return true;}
            }
        }
        return false;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */