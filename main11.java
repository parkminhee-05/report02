package weekend4_3;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayQueue<String> queue = new ArratQueue<String>();
		
		queue.add("apple"); queue.add("orange");
		queue.add("cherrt"); queue.add("pear"); queue.print();
		
		queue.remove(); queue.print();
		
		queue.add("grape"); queue.print();
		
		queue.remove(); queue.print();
		
		queue.add("lemon"); queue.print();
		queue.add("mango"); queue.print();
		queue.add("lime"); queue.print();
		queue.add("kiwi"); queue.print();
		
		queue.remove(); queue.print();
	}

}
