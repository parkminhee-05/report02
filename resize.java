
public class resize(int newSize) {	//�迭 ũ�� ����
	Object[] t = new Object[newSize];	//newSize ũ���� ���ο� �迭 t ����
	for (int i = 0; i < size; i++)
		t[i] = a[i];	//�迭 s�� �迭 t�� ����
	a = (E[]) t;	//�迭 t�� �迭 s��
}
