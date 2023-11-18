package Lec47;

import java.util.*;

public class Prims_Algo {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Prims_Algo(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public void Prims() {
		PriorityQueue<PrimsPair> pq = new PriorityQueue<>(new Comparator<PrimsPair>() {

			@Override
			public int compare(PrimsPair o1, PrimsPair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});
		HashSet<Integer> visited = new HashSet<>();
		pq.add(new PrimsPair(1, 1, 0));
		while (!pq.isEmpty()) {
			// 1. remove
			PrimsPair rp = pq.poll();

			// 2. Ignore
			if (visited.contains(rp.vtx)) {
				continue;
			}

			// 3. Marked Visited
			visited.add(rp.vtx);

			// 4. Self Work
			System.out.println(rp);

			// 5 Add Nbrs
			for (int nbrs : map.get(rp.vtx).keySet()) {
				if (!visited.contains(nbrs)) {
					int cost = map.get(rp.vtx).get(nbrs);
					pq.add(new PrimsPair(nbrs, rp.vtx, cost));
				}

			}
		}

	}
	class PrimsPair {
		int vtx;
		int Acqvtx;
		int cost;

		public PrimsPair(int vtx, int acqvtx, int cost) {
			// TODO Auto-generated constructor stub
			this.vtx = vtx;
			this.Acqvtx = acqvtx;
			this.cost = cost;
		}
		public String toString() {
			return this.vtx+" @ "+ this.Acqvtx+" "+this.cost;
					
		}

	}

	public static void main(String[] args) {
		Prims_Algo p = new Prims_Algo(7);
		p.AddEdge(1, 2, 2);
		p.AddEdge(2, 3, 6);
		p.AddEdge(1, 4, 3);
		p.AddEdge(4, 3, 5);
		p.AddEdge(4, 5, 1);
		p.AddEdge(5, 6, 7);
		p.AddEdge(5, 7, 4);
		p.AddEdge(6, 7, 2);
		p.Prims();

	}

	
}
