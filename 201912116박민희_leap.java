import java.util.Scanner; 

// 연도를 입력받고 그 연도가 윤년인지 평년인지 판별하는 프로그램을 작성하시오.
public class leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("연도를 입력하세요.");
		int a = sc.nextInt();
		
		if((a%4==0 && a%100!=0)||a%400==0) {
			System.out.println(a + "년은 윤년입니다.");
		}
		else {
			System.out.println(a + "년은 평년입니다.");
		}
	}
}
