import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

import org.junit.Test;


public class ReconstructItinerary {
public List<String> findItinerary(String[][] tickets) {
        List<String> res = new ArrayList<String>();
        if(tickets==null||tickets.length==0)
        	return res;
        Map<String, PriorityQueue<String>> graph = new HashMap();
        for(String[] ticket : tickets){
        	PriorityQueue<String> queue= graph.get(ticket[0]);
        	if(queue==null){
        		queue = new PriorityQueue<String>();
        		graph.put(ticket[0], queue);
        	}
        	queue.add(ticket[1]);	
        }
        dfs(graph,"JFK",res);
        return res;
    }

private void dfs(Map<String, PriorityQueue<String>> graph, String from,
		List<String> res) {
	// TODO Auto-generated method stub
	while(graph.containsKey(from)&&!graph.get(from).isEmpty()){
		dfs(graph,graph.get(from).poll(),res);
	}
	res.add(0,from);
}


}
