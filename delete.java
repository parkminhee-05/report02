public class delete(int k) {	//k��° �׸� ����
	if (isEmpty()) throw new NoSuchElementException();	//underflow ��쿡 ���α׷� ����
	E item = a[k];
	for (int i = k; i < size; i++) a[i] = a[i+1];	//�� ĭ�� ������ �̵�
	size--;
	if (size > 0 && size == a.length/4)	//�迭�� �׸���� 1/4�� �����Ѵٸ�
		resize(a.length/2);	//�迭�� 1/2ũ��� ���
	return item;
}
