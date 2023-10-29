package Lec44;

import java.util.ArrayList;

public class HashMap<K, V> {
	class Node {
		K key;
		V value;
		Node next;
	}

	private int size = 0;
	private ArrayList<Node> list;

	public HashMap() {
		// TODO Auto-generated
		this(4);

	}

	public HashMap(int n) {
		list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(null);
		}
	}

	public int Hashfun(K key) {
		int idx = key.hashCode() % list.size();
		if (idx < 0) {
			idx += list.size();
		}
		return idx;
	}

	public void put(K key, V value) {
		int bn = Hashfun(key);
		Node temp = list.get(bn);
		while (temp != null) {
			if (temp.key.equals(key)) {
				temp.value = value;
				return;
			}
			temp = temp.next;
		}
		Node node = new Node();
		node.key = key;
		node.value = value;
		temp = list.get(bn);
		node.next = temp;
		size++;
		list.set(bn, node);
		double thf = 2.0;
		double lf = (1.0 * size) / list.size();
		if (lf > thf) {
			rehashing();
		}

	}

	private void rehashing() {
		// TODO Auto-generated method stub
		ArrayList<Node> ll = new ArrayList<>();
		for (int i = 0; i < 2 * list.size(); i++) {
			ll.add(null);
		}
		ArrayList<Node> oba = list;
		list = ll;
		for (Node node : oba) {
			while (node != null) {
				put(node.key, node.value);
				node = node.next;
			}

		}

	}

	@Override
	public String toString() {
		String s = "{";
		for (Node node : list) {
			while (node != null) {
				s = s + node.key + "=" + node.value + " ,";
				node = node.next;
			}
		}
		s = s + "}";
		return s;

	}

	public boolean containsKey(K key) {
		int bn = Hashfun(key);
		Node temp = list.get(bn);
		while (temp != null) {
			if (temp.key.equals(key)) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public V get(K key) {
		int bn = Hashfun(key);
		Node temp = list.get(bn);
		while (temp != null) {
			if (temp.key.equals(key)) {
				return temp.value;
			}
			temp = temp.next;
		}
		return null;
	}

	public V remove(K key) {
		int bn = Hashfun(key);
		Node curr = list.get(bn);
		Node prev = null;
		while (curr != null) {
			if (curr.key.equals(key)) {
				break;
			}
			prev = curr;
			curr = curr.next;
		}
		if (curr == null) {
			return null;
		}
		if (prev == null) {
			Node temp = curr.next;
			curr.next = null;

			list.set(bn, temp);
		} else {
			prev.next = curr.next;
			curr.next = null;
		}
		size--;
		return curr.value;

	}

}
