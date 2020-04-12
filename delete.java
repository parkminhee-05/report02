public class delete(int k) {	//k번째 항목 삭제
	if (isEmpty()) throw new NoSuchElementException();	//underflow 경우에 프로그램 정지
	E item = a[k];
	for (int i = k; i < size; i++) a[i] = a[i+1];	//한 칸씩 앞으로 이동
	size--;
	if (size > 0 && size == a.length/4)	//배열에 항목들이 1/4만 차지한다면
		resize(a.length/2);	//배열을 1/2크기로 축소
	return item;
}
