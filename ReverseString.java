package weekend4_2;
import java.util.Scanner;

public class ReverseString{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner scanner = new Scanner(System.in);
			String str = scanner.nextLine();
			
			for (int i = str.length()-1; i>=0; i--) {
				System.out.print(str.charAt(i));
		}
		
			StringBuffer sb = new StringBuffer();
			sb.append(str);
			
			System.out.println(sb.reverse());
	}

}
