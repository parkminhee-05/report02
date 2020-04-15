package weekend4_3;

public class DQ_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char deletedItem;
		DQueue DQ = new DQueue();
		
		DQ.insertFront('A');
		DQ.printDQueue();
		
		DQ.insertFront('B');
		DQ.printDQueue();
		
		DQ.insertFront('C');
		DQ.printDQueue();
		
		deletedItem = DQ.deleteFront();
		if(deletedItem !=0)
			System.out.println("Front deleted Item : " + deletedItem);
		DQ.printDQueue();
		
		deletedItem = DQ.deleteRear();
		if(deletedItem !=0)
			System.out.println("Rear deleted Item : " + deletedItem);
		DQ.printDQueue();
		
		DQ.insertFront('D');
		DQ.printDQueue();
		
		DQ.insertFront('E');
		DQ.printDQueue();
		
		DQ.insertFront('F');
		DQ.printDQueue();
	}

}
