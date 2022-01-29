package algorismProject1;

import java.util.Arrays;
// 알고리즘 과제
// 퀵정렬 알고리즘을 이용하여 입력한 학생들의 점수를 성적순으로 정렬하여 출력
import java.util.Scanner;

public class SortTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortTest1 st = new SortTest1();
		st.test();
	}

	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수 입력 : ");
		int n = sc.nextInt();
		System.out.println(); // 출력 양식 맞추기 용도
		// 학생들 각각의 점수를 담을 배열 생성
		int[] arr = new int[n];
		// 입력한 학생 수만큼 반복
		for (int i = 0; i < n; i++) {
			System.out.printf("학생 %d 점수 입력 : ", i + 1);
			arr[i] = sc.nextInt();
		}
		sc.close();
		this.quickSort(arr, 0, arr.length - 1);

		System.out.println(); // 출력 양식 맞추기 용도
		this.printReverse(arr); // 정렬 결과 출력
	}

	public void quickSort(int[] arr, int left, int right) {
		int pl = left;
		int pr = right;
		int pivot = arr[(pl + pr) / 2];
		// pivot을 기준으로 배열을 두 그룹으로 분할
		do {
			while (arr[pl] < pivot) {
				pl++;
			}
			while (arr[pr] > pivot) {
				pr--;
			}
			// 스왑
			this.swap(arr, pl++, pr--);
		} while (pl <= pr); // 두 커서가 교차하게 되면 스캔 중지

		// 분할한 두 부분에 대해서 다시 퀵정렬 실행
		if (left < pr) {
			quickSort(arr, left, pr);
		}
		if (pl < right) {
			quickSort(arr, pl, right);
		}
	}

	public void swap(int[] arr, int i1, int i2) {
		int temp = arr[i1];
		arr[i1] = arr[i2];
		arr[i2] = temp;
	}

	public void printReverse(int[] arr) {
		// 오름차순의 정렬 결과를 역으로 출력
		int rank = 1;
		System.out.println("성적 순으로 정렬");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.printf("%d등 : %d %n", rank, arr[i]);
			rank++;
		}
	}
}
