import java.util.Scanner; 

// ������ �Է¹ް� �� ������ �������� ������� �Ǻ��ϴ� ���α׷��� �ۼ��Ͻÿ�.
public class leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		int a = sc.nextInt();
		
		if((a%4==0 && a%100!=0)||a%400==0) {
			System.out.println(a + "���� �����Դϴ�.");
		}
		else {
			System.out.println(a + "���� ����Դϴ�.");
		}
	}
}
