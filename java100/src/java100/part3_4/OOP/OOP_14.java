package java100.part3_4.OOP;

public class OOP_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2[] p = new Person2[10];
		for(int i =0; i<p.length;i++) {
			p[i] =new Person2(i+"번 후보자",i+20);
			System.out.println(p[i].getNumber()+" --> 나이 : "+i);
		}
	
	}
}
class Person2{
	private String number;
	private int age;
	
	Person2(String number, int age){
		this.number = number;
		this.age = age;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}