package java100.part3_4.OOP;


class Person4 {}
class Batman extends Person4 {}
class Human {}
class Superman extends Human {}

public class OOP_25 {
	static void main(String argsp[]) {
		
		// 배열 --> 동일한 타입의 데이터를 하나로 묶어서 관리하는 자료구조 --> 다형성이 없다면 각 객체별로 관리를 해야 한다.
		Person4[] Person4 = new Person4[10]; 
		Person4[0] = new Person4();
		Person4[1] = new Person4();
		Person4[2] = new Batman();

		Batman[] batmans = new Batman[10]; 
		batmans[0] = new Batman();
		batmans[1] = new Batman();
		// batmans[2] = new Person4(); 는 에러!

		
		// 매개변수의 다형성
		// 프로그래밍 언어에서 함수나 메서드를 호출할 때는 그에 맞는 적절한 파라미터를 보내줘야 한다.
		// System.out.println() 메서드의 경우 
		//어떤 타입, 객체를 매개변수로 받더라도 에러없이 해당 객체의 값을 출력 -->
		// 매개변수로 최상위 클래스인 Object를 받기때문에!
		System.out.println(new Person4());
		System.out.println(new Batman());
		System.out.println(new Human());
		System.out.println(new Superman());

	}
}
