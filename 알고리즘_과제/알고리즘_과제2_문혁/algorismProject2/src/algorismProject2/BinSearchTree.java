package algorismProject2;

import java.util.Scanner;

public class BinSearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinTree tree = new BinTree();
		Data data;
		String ptr;

		Scanner sc = new Scanner(System.in);
		String menu = "(1) 상품 등록 (2) 상품 삭제 (3) 상품 검색 (4) 전체 상품 조회 (5) 종료 ";
		Data temp = new Data(sc);
		boolean flag = false;
		while (!flag) {
			System.out.println(menu);
			System.out.print("메뉴 선택: ");
			int request = sc.nextInt();

			switch (request) {
			case 1:
				data = new Data(sc);
				System.out.println(); // 출력 양식 맞추기용 개행 
				System.out.println("상품 등록");
				data.scanData(Data.NO | Data.NAME);
				tree.add(data.keyCode(), data.toString());
				break;
			case 2:
				System.out.println(); // 출력 양식 맞추기용 개행
				System.out.println("상품 삭제");
				temp.scanData(Data.NO);
				boolean result = tree.remove(temp.keyCode());
				if (result == true)
					System.out.println("상품 삭제 완료");
				break;
			case 3:
				System.out.println(); // 출력 양식 맞추기용 개행
				System.out.println("상품 검색");
				temp.scanData(Data.NO);
				ptr = tree.search(temp.keyCode());
				if (ptr != null)
					System.out.println("상품명: " + ptr);
				else
					System.out.println("등록된 상품이 없습니다.");
				break;
			case 4:
				tree.print();
				break;
			case 5:
				System.out.println("종료합니다.");
				flag = true; // 무한루프 탈출

			}
			System.out.println(); // 매 반복마다 줄바꿈
		}
		sc.close();
	}

}
