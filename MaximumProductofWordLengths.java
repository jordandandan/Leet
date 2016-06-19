
public class MaximumProductofWordLengths {
	public int maxProduct(String[] words) {
		int len = words.length;
        int[] Bytes = new int[len];
        int max = -1;
        for(int i=0;i<len;i++){
        	for(int j=0;j<words[i].length();j++){
        		Bytes[i] |= (1<<(words[i].charAt(j)-'a'));
        	}
        }
        for(int i=0;i<len;i++)
        	for(int j=i+1;j<len;j++){
        		if((Bytes[i]&Bytes[j])==0)
        			max = Math.max(max, words[i].length()*words[j].length());
        			
        	}
        return max<0?0:max;
    }
}
