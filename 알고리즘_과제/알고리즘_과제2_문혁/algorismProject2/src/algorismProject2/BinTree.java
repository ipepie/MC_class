package algorismProject2;
import java.util.Comparator;
// 이진검색트리

public class BinTree {
	// 노드
	static class Node {
		private int key;					// 키 값
		private String data;					// 데이터
		private Node left;			// 왼쪽 자식 노드
		private Node right;		// 오른쪽 자식 노드

		// 생성자
		Node(int key, String data, Node left, Node right) {
			this.key   = key;
			this.data  = data;
			this.left  = left;
			this.right = right;
		}

		// 키 값을 반환
		int getKey() {
			return key;
		}

		// 데이터를 반환
		String getValue() {
			return data;
		}

		// 데이터를 출력
		void print() {
			System.out.println(data);
		}
	}

	private Node root;								// 루트

	// 생성자
	public BinTree() {
		root = null;
	}

	// 키에 의한 검색
	public String search(int key)	{
		Node p = root;								// 루트에 주목

		while (true) {
			if (p == null)								// 더 이상 진행하지 않으면
				return null;							// 검색 실패
			if (key == p.getKey())								// 같으면
				return p.getValue();					// 검색 성공
			else if (key-p.getKey() < 0)							// key 쪽이 작으면
				p = p.left;								// 왼쪽 서브 트리에서 검색
			else										// key 쪽이 크면
				p = p.right;							// 오른쪽 서브 트리에서 검색
		}
		
	}

	// node를 루트로 하는 서브 트리에 노드를 삽입
	private void addNode(Node node, int key, String data) {
		if (key == node.getKey())
			return;										// key가 이진검색트리에 이미 있음
		else if (key-node.getKey() < 0) {
			if (node.left == null)
				node.left = new Node(key, data, null, null);
			else
				addNode(node.left, key, data);			// 왼쪽 서브 트리에 주목
		} else {
			if (node.right == null)
				node.right = new Node(key, data, null, null);
			else
				addNode(node.right, key, data);			// 오른쪽 서브 트리에 주목
		}
	}

	// 노드를 삽입
	public void add(int key, String data) {
		if (root == null)
			root = new Node(key, data, null, null);
		else
			addNode(root, key, data);
	}

	// 키 값이 key인 노드를 삭제.
	public boolean remove(int key) {
		Node p = root;								// 스캔 중인  노드
		Node parent = null;						// 스캔 중인  노드의 부모 노드
		boolean isLeftChild = true;						// p는 parent의 왼쪽 자식 노드인가?

		while (true) {
			if (p == null)								// 더 이상 진행하지 않으면
				return false;							// 그 키 값은 없습니다. 
			if (key == p.getKey())								// 같으면
				break;									// 검색 성공
			else {
				parent = p;								// 가지로 내려가기 전에 부모를 설정
				if (key - p.getKey() < 0) {							// key 쪽이 작으면
					isLeftChild = true;					// 왼쪽 자식으로 내려감
					p = p.left;							// 왼쪽 서브트리에서 검색
				} else {								// key 쪽이 크면
					isLeftChild = false;				// 오른쪽 자식으로 내려감
					p = p.right;						// 오른쪽 서브 트리에서 검색
				}
			}
		}

		if (p.left == null) {							// p에는 왼쪽 자식이 없음
			if (p == root)					 
				root = p.right;
			else if (isLeftChild)
				parent.left  = p.right;					// 부모의 왼쪽 포인터가 오른쪽 자식을 가리킴
			else
				parent.right = p.right;					// 부모의 오른쪽 포인터가 오른쪽 자식을 가리킴
		} else if (p.right == null) {					// p에는오른쪽 자식이 없음
			if (p == root)
				root = p.left;
			else if (isLeftChild)
				parent.left  = p.left;					// 부모의 왼쪽 포인터가 왼쪽 자식을 가리킴
			else
				parent.right = p.left;					// 부모의 오른쪽 포인터가 왼쪽 자식을 가리킴
		} else {
			parent = p;
			Node left = p.left;					// 서브 트리 가운데 가장 큰 노드
			isLeftChild = true;
			while (left.right != null) {				// 가장 큰 노드 left를 검색
				parent = left;
				left = left.right;
				isLeftChild = false;
			}
			p.key  = left.key;							// left의 키 값을 p로 옮김
			p.data = left.data;							// left의 데이터를  p로 옮김
			if (isLeftChild)
				parent.left  = left.left;				// left를 삭제
			else
				parent.right = left.left;				// left를 삭제
		}
		return true;
	}

	// node를 루트로 하는 서브 트리의 노드를 키 값의 오름차순으로 출력
	private void printSubTree(Node node) {
		if (node != null) {
			printSubTree(node.left);								// 왼쪽 서브 트리를 키 값의 오름차순으로 출력
			System.out.println(node.key + " " + node.data);			// node를 출력
			printSubTree(node.right);								// 오른쪽 서브 트리를 키 값의 오름차순으로 출력
		}
	}

	// 모든 노드를 키 값의 오름차순으로 출력
	public void print() {
		if(root == null) {
			System.out.println();
			System.out.println("등록된 상품이 없습니다.");
		}
		printSubTree(root);
	}
}