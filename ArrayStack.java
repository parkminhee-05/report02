package weekend4_1;

import java.util.EmptyStackException;

public class ArrayStack<E> {
	private E s[];
	private int top;
	public ArrayStack() {
		s = (E[]) new Object[1];
		top = -1;
	}
	public int size() { return top+1;}
	public boolean isEmpty() { return (top == -1);}
	
	// peek(), push(), pop(), resize() 五社球 識情
	
	public E peek() {
		if (isEmpty()) throw new EmptyStackException();
		return s[top];
	}
	public void push(E newItem) {
		if (size() == s.length)
			resize(2*s.length);
		s[++top] = newItem;
	}
	private void resize(int i) {
		// TODO Auto-generated method stub
		
	}
	public E pop() {
		if (isEmpty()) throw new EmptyStackException();
		E item = s[top];
		s[top--] = null;
		if (size() > 0 && size()==s.length/4)
			resize(s.length/2);
		return item;
	}
	public void print() {
		// TODO Auto-generated method stub
		
	}
}