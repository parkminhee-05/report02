import java.util.Scanner; 

// ������ �Է¹ް� �� ������ �������� ������� �Ǻ��ϴ� ���α׷��� �ۼ��ϵ� ��� ����ǰ� �ϼ���. 0���� ���� ���� �ԷµǸ� ���α׷��� �����ϼ���.
public class leap_rep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("������ �Է��ϼ���.");
			int a = sc.nextInt();
		
		if((a%4==0 && a%100!=0)||a%400==0) {
			System.out.println(a + "���� �����Դϴ�.");
		}
		else {
			System.out.println(a + "���� ����Դϴ�.");
			}
		if(a<0) {
			System.out.println("���α׷��� ����˴ϴ�.");
			break;
			}
		}
	}
}
