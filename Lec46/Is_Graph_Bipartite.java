package Lec46;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Is_Graph_Bipartite {
	class Solution {
		public boolean isBipartite(int[][] graph) {
			Queue<BipartitePair> q = new LinkedList<>();
			HashMap<Integer, Integer> visited = new HashMap<>();
			for (int i = 0; i < graph.length; i++) {
				if (visited.containsKey(i)) {
					continue;
				}
				q.add(new BipartitePair(i, 0));
				while (!q.isEmpty()) {
					// 1. remove
					BipartitePair rp = q.poll();
					// Ignore
					if (visited.containsKey(rp.vtx)) {
						if (visited.get(rp.vtx) != rp.dis) {
							return false;
						}
						continue;

					}
					// visited
					visited.put(rp.vtx, rp.dis);

					for (int nbrs : graph[rp.vtx]) {
						if (!visited.containsKey(nbrs)) {
							q.add(new BipartitePair(nbrs, rp.dis + 1));
						}
					}

				}

			}
			return true;

		}
	}

	class BipartitePair {
		int vtx;
		int dis;

		public BipartitePair(int vtx, int dis) {
			// TODO Auto-generated constructor stub
			this.vtx = vtx;
			this.dis = dis;
		}
	}
}
