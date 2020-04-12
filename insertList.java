public class insertList(E newItem) { //가장 뒤에 새 항목 삽입
	if (size == a.length)	//배열에 빈 공간이 없으면
		resize(2*a.length);	//배열 크기 2배로 확장
	a[size++] = newItem;	//새 항목 삽입
}

