package java100.part3_4.OOP;

public class OOP_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("이은서",27,63);
		s1.wash();
		s1.study();
		s1.play();
		s1.in(10000, "엄마");
		s1.out(5000,"편의점");
		s1.train(20000,"훈련비");
		
	}

}

class Person3{
	String name;
	int age;
	int weight;
	
	Person3(){}
	Person3(String name, int age, int weight){
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	void wash() {
		System.out.println("씻다");
	}
	void study() {
		System.out.println("공부하다");
	}
	void play() {
		System.out.println("놀다");
	}
}
interface Allowance{
	abstract void in(int price, String name);
	abstract void out(int price, String name);
}
interface Train{
	void train(int training_pay,String name);
}
class Student extends Person3 implements Allowance, Train{
	Student(){}
	Student(String name, int age, int weight){
		super(name,age,weight);
	}
	
	@Override
	public void train(int training_pay, String name) {
		// TODO Auto-generated method stub
		System.out.printf("%s -> %d원 입금완료%n", name, training_pay);
	}
	@Override
	public void in(int price, String name) {
		// TODO Auto-generated method stub
		System.out.printf("%s에게서 %d원 용돈을 받았습니다%n",name,price);
	}
	@Override
	public void out(int price, String name) {
		// TODO Auto-generated method stub
		System.out.printf("%d원 금액을 지출했습니다 용도->%s%n",price,name);
	}
}
