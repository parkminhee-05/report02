import java.util.Scanner; // ctrl + shift + o

// �ϳ��� ���� �Է� �ް� �� ���� �ش��ϴ� �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�

public class gugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in); // �Է¹��� �� �ִ� �Լ� ����, import
	    System.out.println("�ϳ��� ���� �Է��ϼ���.");
	    int a = sc.nextInt(); // Scanner ���ǰ� �Ǿ�� ��
	    
	    for(int i=1; i<10; i++) { // i�� 1~9����
	    	 System.out.println(a + "x" + i + "=" + a*i); // a x i = ai	 
	    }
	}
}
