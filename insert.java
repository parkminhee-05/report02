public class insert(E newItem, int k) {	//�� �׸��� k-1��° �׸� ������ ����
	if (size == a.length)	//�迭�� �� ������ ������
		resize(2*a.length);	//�迭 ũ�� 2��� Ȯ��
	for (int i = size-1; i >= k; i--) a[i+1] = a[1];	//�� ĭ�� �ڷ� �̵�
	a[k] = newItem;
	size++;
}
