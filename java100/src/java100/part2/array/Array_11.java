package java100.part2.array;

public class Array_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strAr = { "hong", "kim", "park" };
		System.out.println(strAr.length); // 3
		// System.out.println( strAr[0].length ); // Err
		// 문자열.length() 문자열의 길이 메소드
		// 배열의 크기는 length 만사용
		System.out.println(strAr[0].length()); // hong --> 4
		for (int i = 0; i < strAr.length; i++) {
			for (int j = 0; j < strAr[i].length(); j++) {
				System.out.print(strAr[i].charAt(j));
			}
			System.out.println();
		}
	}

}
