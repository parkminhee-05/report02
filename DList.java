package Weekend3_3;

import java.util.NoSuchElementException;

public class DList<E> {
	protected Dnode head, tail;
	protected int size;
	
	public DList() {
		head = new DNode (null, null, null);
		tail = new DNode (null, head, null);
		head.setNext(tail);
		size = 0;
	}
	
	public int size() { return size;}
	public boolean isEmpty() { return size == 0;}
	
	public void insertBefore(Dnode<E> p, E newItem) {
		Dnode<E> t = p.getPrevious();
		DNode newNode = new DNode(newItem, t, p);
		p.setPrevious(newNode);
		t.setNext(newNode);
		size++;
	}
	
	public void insertAfter(Dnode<E> p, E newItem) {
		Dnode<E> t = p.getNext();
		DNode newNode = new DNode(newItem, p, t);
		t.setPrevious(newNode);
		p.setNext(newNode);
		size++
	}
	
	public void delete(Dnode x) {
			if(x == null) throw new NoSuchElementException();
		Dnode f = x.getPrevious();
		Dnode<E> r = x.getNext();
		f.setNext(r);
		r.setPrevious(f);
		x.setPrevious(null);
		x.setNext(null);
		size--;
	}
	
	public void print() {
		if (size > 0)
			for(DNode p = head.getNext(); p != tail; p = p.getNext())
				System.out.print(p.getItem()+"\t ");
		else
			System.out.println("리스트 비어있음")ㅣ
			System.out.println();
	}
}
