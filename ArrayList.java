

public class ArrayList<E> {
	private E a[];	//리스트의 항목들을 저장할 배열
	private int size;	//리스트의 항목 수
	public ArrayList() {	//생성자
		a = (E[]) new Object[1];	//최초로 1개의 원소를 가진 배열 생성
		size = 0;	//항목 수를 0으로 초기화
	}
	//탐색, 삽입, 삭제 연산을 위한 메소드 선언
}
