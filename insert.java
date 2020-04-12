public class insert(E newItem, int k) {	//새 항목을 k-1번째 항목 다음에 삽입
	if (size == a.length)	//배열에 빈 공간이 없으면
		resize(2*a.length);	//배열 크기 2배로 확장
	for (int i = size-1; i >= k; i--) a[i+1] = a[1];	//한 칸씩 뒤로 이동
	a[k] = newItem;
	size++;
}
