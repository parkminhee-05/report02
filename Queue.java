package weekend4_3;

public interface Queue {
	boolean isEmpty();
	void enQueue(char item);
	char deQueue();
	void delete();
	char peek();
}

class QNode{
	char data;
	QNode link;
}
