package Lec46;

import java.util.*;

public class Graph_Valid_Tree {

	class Solution {
		public boolean validTree(int n, int[][] edges) {
			HashMap<Integer, List<Integer>> map = new HashMap<>();
			for (int i = 0; i < n; i++) {
				map.put(i, new ArrayList<>());

			}

			for (int i = 0; i < edges.length; i++) {
				int a = edges[i][0];
				int b = edges[i][1];
				map.get(a).add(b);
				map.get(b).add(a);

			}
			Stack<Integer> st = new Stack<>();
			HashSet<Integer> visited = new HashSet<>();
			int c = 0;
			for (int key : map.keySet()) {
				if (visited.contains(key)) {
					continue;
				}
				c++;
				st.push(key);
				while (!st.isEmpty()) {
					// 1. remove
					int rv = st.pop();
					// 2. if Already then Ignore
					if (visited.contains(rv)) {
						return false;
					}
					// 3. Marked visited
					visited.add(rv);

					// 5. Add nbrs
					for (int nbrs : map.get(rv)) {
						if (!visited.contains(nbrs)) {
							st.push(nbrs);
						}
					}

				}
			}
			return c == 1;

		}
	}

}
