import java.util.Scanner; // ctrl + shift + o

// 하나의 수를 입력 받고 그 수에 해당하는 구구단을 출력하는 프로그램을 작성하시오

public class gugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in); // 입력받을 수 있는 함수 생성, import
	    System.out.println("하나의 수를 입력하세요.");
	    int a = sc.nextInt(); // Scanner 정의가 되어야 함
	    
	    for(int i=1; i<10; i++) { // i는 1~9까지
	    	 System.out.println(a + "x" + i + "=" + a*i); // a x i = ai	 
	    }
	}
}
