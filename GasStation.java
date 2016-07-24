
public class GasStation {
	public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0;
        int left  = 0;
        int j = -1;
        for(int i=0;i<gas.length;i++){
        	int diff = gas[i] - cost[i];
        	sum += diff;//total left
        	left += diff;//curr left;
        	if(left<0){
        		j = i;
        		left = 0;
        	}
        }
        return sum<0?-1:j+1;
    }
}
