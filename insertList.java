public class insertList(E newItem) { //���� �ڿ� �� �׸� ����
	if (size == a.length)	//�迭�� �� ������ ������
		resize(2*a.length);	//�迭 ũ�� 2��� Ȯ��
	a[size++] = newItem;	//�� �׸� ����
}

