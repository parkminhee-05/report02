import java.util.Scanner; 

// 연도를 입력받고 그 연도가 윤년인지 평년인지 판별하는 프로그램을 작성하되 계속 실행되게 하세요. 0보다 작은 수가 입력되면 프로그램을 종료하세요.
public class leap_rep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("연도를 입력하세요.");
			int a = sc.nextInt();
		
		if((a%4==0 && a%100!=0)||a%400==0) {
			System.out.println(a + "년은 윤년입니다.");
		}
		else {
			System.out.println(a + "년은 평년입니다.");
			}
		if(a<0) {
			System.out.println("프로그램이 종료됩니다.");
			break;
			}
		}
	}
}
