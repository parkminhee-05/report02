package Weekend3_3_2;

import Weekend3_3_2.Node;

public class Node<E> {
	private Node next;
	
	public Node(E newItem, NOde p) {
		item = newItem;
		next = p;
	}
	
	public E getItem() { return item;}
	public Node getNext() {return item;}
	public void setItem(E newItem) {item = newItem;}
	public void setNext(Node newNext)	{next = newNext;}
}
