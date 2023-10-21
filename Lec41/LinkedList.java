package Lec41;

public class LinkedList<T> {
	public class Node {
		T data;
		Node next;// address

	}

	private Node head;
	private Node tail;
	private int size;

//O(1)
	public void Addfirst(T item) {
		Node nn = new Node();
		nn.data = item;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;

		}

	}

	// O(1)
	public void Addlast(T item) {
		if (size == 0) {
			Addfirst(item);
		} else {
			Node nn = new Node();
			nn.data = item;
			tail.next = nn;
			tail = nn;
			size++;
		}

	}

	// O(N)
	public void Addatindex(int k, T item) throws Exception {
		if (k == 0) {
			Addfirst(item);
		} else if (k == size) {
			Addlast(item);
		} else {
			Node nn = new Node();
			nn.data = item;
			Node k_1th = getNode(k - 1);
			nn.next = k_1th.next;
			k_1th.next = nn;
			size++;
		}

	}

	private Node getNode(int k) throws Exception {
		if (k < 0 || k >= size) {
			throw new Exception("Bklol size glt de raha hai ");
		}
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println(".");
	}

	// O(1)
	public T getfirst() {
		return head.data;
	}

	// O(1)
	public T getlast() {
		return tail.data;
	}

	public T getatindex(int k) throws Exception {
		return getNode(k).data;
	}

	// O(1)
	public T removefirst() {
		Node temp = head;
		if (size == 1) {
			tail = null;
			head = null;
			size--;
		} else {
			head = head.next;
			size--;
			temp.next = null;
		}
		return temp.data;

	}

	// O(1)
	public T removelast() throws Exception {
		if (size == 1) {
			return removefirst();
		} else {
			Node nn = getNode(size - 2);
			T rv = tail.data;
			nn.next = null;
			tail = nn;
			size--;
			return rv;
		}

	}

	public T removeatindex(int k) throws Exception {
		if (k == 0) {
			return removefirst();
		} else if (k == size - 1) {
			return removelast();
		} else {
			Node k_1th = getNode(k - 1);
			Node kth = k_1th.next;
			k_1th.next = kth.next;
			kth.next = null;
			size--;
			return kth.data;
		}

	}

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.Addlast("Anku");
		ll.Addlast("Pooja");
		ll.Addlast("Kaju");
		ll.Addlast("Raj");
		ll.Addlast("Amisha");
		ll.Display();

	}
}