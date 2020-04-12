
public class resize(int newSize) {	//배열 크기 조절
	Object[] t = new Object[newSize];	//newSize 크기의 새로운 배열 t 생성
	for (int i = 0; i < size; i++)
		t[i] = a[i];	//배열 s를 배열 t로 복사
	a = (E[]) t;	//배열 t를 배열 s로
}
