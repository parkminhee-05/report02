package Weekend3_3_2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CList<String> s = new CList<String>();
		
		s.insert("pear"); s.insert("cherry");
		s.insert("orange"); s.insert("apple");
			s.print();
			System.out.print(": sÀÇ ±æÀÌ = "+s.size()+"\n");
			
			s.delete();
			s.print();
			System.out.print(" :sÀÇ ±æÀÌ = "+s.size()); System.out.println();

	}

}
