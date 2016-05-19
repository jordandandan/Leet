import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CloneGraph {
	class UndirectedGraphNode {
		      int label;
		      List<UndirectedGraphNode> neighbors;
		      UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
		 };
	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
		if(node==null)
            return null;
        Map<UndirectedGraphNode,UndirectedGraphNode> map = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
        return clone(node,map);
        
    }
	/*
	 * dfs
	 */
	public UndirectedGraphNode clone(UndirectedGraphNode node, Map<UndirectedGraphNode,UndirectedGraphNode> map){
		if(map.containsKey(node)){
			return map.get(node);
		}
		UndirectedGraphNode graph = new UndirectedGraphNode(node.label);
		map.put(node, graph);
		for(UndirectedGraphNode neighbor : node.neighbors){
			graph.neighbors.add(clone(neighbor,map));
		}
		return graph;
	}
	/*
	 * bfs
	 */
}
