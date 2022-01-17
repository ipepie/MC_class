package java100.part3_4.OOP;

public class OOP_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(20,"홍길동");
		Person p2 = new Person(30,"이순신");
		Person p3 = new Person(40,"을지문덕");
		System.out.println(p1.age+", "+p1.name);
		System.out.println(p2.age+", "+p2.name);
		System.out.println(p3.age+", "+p3.name);
	}
}
class Person {
	int age;
	String name;
	
	Person(int age, String name){
		this.age = age;
		this.name = name;
	}
}

