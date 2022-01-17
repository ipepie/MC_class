package java100.part2.array;

import java.util.Scanner;

public class Array_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("행의 갯수룰 입력하고 [Enter] 치세요 = ");
		int r = sc.nextInt();
		System.out.println("열의 갯수룰 입력하고 [Enter] 치세요 = ");
		int c = sc.nextInt();
		char[][] cArr = new char[r][c];

		String[] strArr = new String[c];
		for (int i = 0; i < r; i++) {
			System.out.printf("%d번째 행에 입력할 문자%d개를 차례대로 입력하고 [Enter] 치세요 = %n",i+1,r);
			strArr[i] = sc.next();
			for (int j = 0; j < c; j++) {
				cArr[i][j] = strArr[i].charAt(j);
			}
		}
		System.out.println("====================");
		for(int i = 0;i<c;i++) {
			for(int j = 0;j<r;j++) {
				System.out.print(cArr[i][j]);
			}
			System.out.println();
		}
		System.out.println("====================");
	}
}
