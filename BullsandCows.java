
public class BullsandCows {
	 public String getHint(String secret, String guess) {
        int[] secret_num = new int[10];
        int[] guess_num = new int[10];
        int A = 0;
        if(secret==null||guess==null)
        	return "";
        for(int i=0;i<secret.length();i++){
        	secret_num[secret.charAt(i)-'0']++;
        	guess_num[guess.charAt(i)-'0']++;
        	if(secret.charAt(i)==guess.charAt(i))
        			A++;
        }
        int total = 0;
        for(int i1=0;i1<10;i1++){
        		total += Math.min(secret_num[i1], guess_num[i1]);
        }
        	return A+"A"+(total-A)+"B";
        
    }
}
