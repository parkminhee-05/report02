package weekend4_3;

public class Node<E> {
	private E item;
	private Node<E> next;
	private E newItem;
	private E newNext;	
	
	public Node(E newItem, Node<E> node) {
		item = newItem;
		next = node;
	}
	//get 메소드들과 set 메소드들
	public E getItem() {return item;}
	public Node<E> getnext() {return next;}
	public void setItem() {item = newItem;}
	public void setNext(Node<E> newNext) {next = newNext;}
	public Node getNext() {
		// TODO Auto-generated method stub
		return null;
	}
}
