

public class ArrayList<E> {
	private E a[];	//����Ʈ�� �׸���� ������ �迭
	private int size;	//����Ʈ�� �׸� ��
	public ArrayList() {	//������
		a = (E[]) new Object[1];	//���ʷ� 1���� ���Ҹ� ���� �迭 ����
		size = 0;	//�׸� ���� 0���� �ʱ�ȭ
	}
	//Ž��, ����, ���� ������ ���� �޼ҵ� ����
}
