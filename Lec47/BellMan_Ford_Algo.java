package Lec47;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BellMan_Ford_Algo {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public BellMan_Ford_Algo(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);

	}

	public List<EdgePair> GetAllEdge() {
		List<EdgePair> ll = new ArrayList<>();
		for (int v1 = 1; v1 <= map.size(); v1++) {
			for (int v2 : map.get(v1).keySet()) {
				int cost = map.get(v1).get(v2);
				ll.add(new EdgePair(v1, v2, cost));
			}

		}
		return ll;

	}

	public void BellMan() {
		int v = map.size();
		int[] dis = new int[v + 1];
		for (int i = 2; i < dis.length; i++) {
			dis[i] = 9999999;
		}
		List<EdgePair> ll = GetAllEdge();
		for (int i = 1; i <= v; i++) {
			for (EdgePair e : ll) {
				if (i == v && dis[e.v2] > dis[e.v1] + e.cost) {
					System.out.println("-ve Wt ka Cycle h");
					return;
				}
				if (dis[e.v2] > dis[e.v1] + e.cost) {
					dis[e.v2] = dis[e.v1] + e.cost;
				}
			}
		}
		for (int i = 1; i < dis.length; i++) {
			System.out.print(dis[i] + " ");
		}

	}

	class EdgePair {
		int v1, v2, cost;

		public EdgePair(int v1, int v2, int cost) {
			// TODO Auto-generated constructor stub
			this.v1 = v1;
			this.v2 = v2;
			this.cost = cost;
		}

	}
	public static void main(String[] args) {
		BellMan_Ford_Algo  bfd = new BellMan_Ford_Algo (5);
		bfd.AddEdge(1, 2, 8);
		//bfd.addEdge(2, 5, -2);
		bfd.AddEdge(2, 5, 2);
		bfd.AddEdge(5, 2, 1);
		bfd.AddEdge(4, 5, 4);
		bfd.AddEdge(3, 4, -3);
		bfd.AddEdge(1, 3, 4);
		bfd.AddEdge(1, 4, 5);
		bfd.BellMan();
		
	}

}
