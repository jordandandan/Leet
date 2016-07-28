
public class ImplementTrie {
	// Initialize your data structure here.
	class TrieNode {
	    // Initialize your data structure here.
		private TrieNode[] son;
		private boolean isEnd;
		private int num;
		private char val;
	    public TrieNode() {
	        son = new TrieNode[26];
	        num = 0;
	        isEnd = false;
	        
	    }
	}
	 private TrieNode root;

	    public ImplementTrie() {
	        root = new TrieNode();
	    }

	    // Inserts a word into the trie.
	    public void insert(String word) {
	    	if(word==null||word.length()==0)
	    		return;
	    	TrieNode node = root;
	    	for(int i=0;i<word.length();i++){
	    		int pos = word.charAt(i)-'a';
	    		if(node.son[pos]==null){
	    			node.son[pos] = new TrieNode();
	    			node.son[pos].val = word.charAt(i);
	    		}else{
	    			node.son[pos].num++;
	    		}
	    		node = node.son[pos];
	    	}
	    	node.isEnd = true;
	    }

	    // Returns if the word is in the trie.
	    public boolean search(String word) {
	    	if(word==null||word.length()==0)
	    		return false;
	        TrieNode node = root;
	    	for(int i=0;i<word.length();i++){
	        	if(node.son[word.charAt(i)-'a']!=null){
	        		node = node.son[word.charAt(i)-'a'];
	        	}else{
	        		return false;
	        	}
	        		
	        }
	    	return node.isEnd;
	    }

	    // Returns if there is any word in the trie
	    // that starts with the given prefix.
	    public boolean startsWith(String prefix) {
	        if(prefix==null||prefix.length()==0)
	        	return true;
	        TrieNode node = root;
	        for(int i=0;i<prefix.length();i++){
	        	int pos = prefix.charAt(i)-'a';
	        	if(node.son[pos]!=null){
	        		node = node.son[pos];
	        	}else
	        		return false;
	        }
	        return true;
	    }
}
