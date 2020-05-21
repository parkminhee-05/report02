
public class BST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bsT = new BinarySearchTree();
		bs.T.insertBST('G');
		bs.T.insertBST('I');
		bs.T.insertBST('H');
		bs.T.insertBST('D');
		bs.T.insertBST('B');
		bs.T.insertBST('M');
		bs.T.insertBST('N');
		bs.T.insertBST('A');
		bs.T.insertBST('J');
		bs.T.insertBST('E');
		bs.T.insertBST('Q');
		
		System.out.printf("\nBinary Tree >>> ");
		bsT.printBST();
		
		System.out.printf("Is There \"A\"? >>> ");
		TreeNode p1 = bsT.searchBST('A');
		if(p1 != null)
			System.out.printf("Searching Success! Searched key: %c \n",  p1.data);
		else
			System.out.printf("Searching fail!! There is no %c \n", p1.data);
		
		System.out.printf("Is There \"Z\"? >>> ");
		TreeNode p2 = bsT.searchBST('Z');
		if(p2 != null)
			System.out.printf("Searching Success! Searched key: %c \n", p2.data);
		else
			System.out.printf("Searchingfail!! \n");	
	}

}

	public class BST<Key extends Comparable<Key>, Value>{
		public Node<Key, Value> root;
		public Node<Key, Value> getRoot() {return root;}
		public BST(Key newId, Value newName) {
			//BST ������ //get, put, min, deleteMin, delete
			root = new Node<Key, Value>(newId, newName);
		}
		//�޼ҵ带 ����
		public Value get(Key k) {return get(root k);}
		public Value get(Node<Key, Value> n, key k) {
			if(n == null) return null; //k�� �߰� ����
			int t = n.getKey().compareTo(k);
			if(t > 0)	return get(n.getLeft(), k);
						//if(k < ��� n�� id) ���� ���� Ʈ�� �˻�
			else if(t < 0) return get(n.getRight(), k);
						//if(k > ��� n�� id) �����ʼ��� Ʈ�� Ž��
			else				return (Value) n.getValue(); // k�� ���� ��� �߰�
		}
		public void put(Key k, Value v) {root = put(root, k, v);}
		public Node<Key, Value> put(Node<Key, Value> n, key k, Value v){
			if(n == null) return new Node<Key, Value>(k, v);
			int t = n.getKey().compareTo(k);
			if(t > 0) n.setLeft(put(n.getLeft(), k, v));
			//if (k < ��� n�� id) ���ʼ��� Ʈ���� ����
			else if(t < 0) n.setRight(put(n.getRight(), k,v));
			//if (k > ��� n��  id) ������ ���� Ʈ���� ����
			else n.setValue(v); // ��� n�� name�� v�� ����
			return n;
		}
		
		public Key min() {
			if(root == null) return null;
			return (Key) min(root).getKey();}
		private Node<Key, Value> min(Node<Key, Value> n){
			if(n.getLeft() == null) return n;
			return min(n.getLeft());
		}
		public void deleteMin() {
			if(root == null) System.out.println("empty Ʈ��");
			root = deleteMin(root);
		}
		public Node<Key, Value> deleteMin(Node<Key, Value> n){
			if(n.getLeft() == null) return n.getRight();
			// if (n�� ���� �ڽ� == null) n�� ������ �ڽ� ����
			n.setLeft(deleteMin(n.getLeft()));
			//if (n�� ���� �ڽ� =/ null), n�� ���� �ڽ����� ��� ȣ��
			return n;
		}
		
		public void deleteMax() {
			if(root == null) System.out.pritln("empty Ʈ��");
					root = deleteMax(root);
		}
		private Node<key, Value> deleteMax(Node<Key, Value> n){
			if(n.getRight() == null)
				return n.getLeft();
			n.setRight(deleteMax(n.getRight()));
			return n;
		}
		public void delete(Key k) {root = delete(root, k);}
		public Node<Key, Value> delete(Node<Key, Value> n, Key k) {
			if(n==null) return null;
			int t = n.getKey().compareTo(k);
			if(t > 0) n.setLeft(delete(n.getLeft(), k));
			// if (k < ��� n�� id) ���� �ڽ����� �̵�
			else if(t < 0) n.setRight(delete(n.getRight(), k));
			// if (k > ��� n�� id) �������� �ڽ����� �̵�
			else { //������ ��� �߰�
				if(n.getRight() == null) return n.getLeft(); // case 0, 1
				if(n.getLeft() == null) return n.getRight(); // case 1
				Node<Key, Value> target = n; // case2
				n = min(target.getRight());
				//������ ��� �ڸ��� �Űܿ� ��� ã�Ƽ� n�� ����Ű�� ��
				n.setRight(deleteMin(target.getRight()));
				n.setLeft(target.getLeft());
			}
			return n;		
		}
		public void print(Node<Key, Value> root) {
			System.out.printf("\ninorder:\n");
			inorder(root);
		}
		public void inorder(Node<Key, Value> n) { // ���� ��ȸ
			if(n != null) {
				inorder(n.getLeft()); // n�� ���� ���� Ʈ���� ��ȸ�ϱ� ����
				System.out.print(n.getKey()+ " "); //��� n�湮
				inorder(n.getRight()); // n�� ������ ���� Ʈ���� ��ȸ�ϱ� ����
			}
		}
	}
