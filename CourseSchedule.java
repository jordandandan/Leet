import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class CourseSchedule {
	public boolean canFinish(int numCourses, int[][] prerequisites) {
		int num = numCourses;
		if(num==0)
			return true;
		List<List<Integer>> post = new ArrayList<List<Integer>>();
		int[] pre = new int[num];
		for(int i=0;i<num;i++){
			post.add(new ArrayList<Integer>());
		}
		for(int i=0;i<prerequisites.length;i++){
			post.get(prerequisites[i][1]).add(prerequisites[i][0]);
			pre[prerequisites[i][0]]++;
		}
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i=0;i<pre.length;i++){
			if(pre[i]==0)
				queue.offer(i);
		}
		while(!queue.isEmpty()){
			int j = queue.poll();
			List<Integer> temp = post.get(j);
			for(Integer i:temp){
				pre[i]--;
				if(pre[i]==0)
					queue.offer(i);
			}
			num--;
		}
		return num==0;
    }
}
