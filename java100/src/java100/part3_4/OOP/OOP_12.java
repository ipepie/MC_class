package java100.part3_4.OOP;

public class OOP_12 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Villain v = new Villain("좀비",20,180,80,15001231,"창",99.5);
		v.print();
	}
}

class Person1{
	private String name;
	private int age;
	private int height;
	private int weight;
	
	Person1(String name, int age, int height, int weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
}
class Villain extends Person1{
	private int number;
	private String weapon;
	private double power;
	
	Villain(String name, int age, int height, int weight,int number, String weapon, double power) {
		super(name, age, height, weight);
		this.number = number;
		this.weapon = weapon;
		this.power = power;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		this.power = power;
	}
	public void print() {
		System.out.println("-----------------------");
		System.out.println("악당 이름\t: "+getName());
		System.out.println("악당 나이\t: "+getAge());
		System.out.println("악당 키\t: "+getHeight());
		System.out.println("악당 체중\t: "+getWeight());
		System.out.println("악당 넘버\t: "+getNumber());
		System.out.println("악당 무기\t: "+getWeapon());
		System.out.println("악당 파워\t: "+getPower());
		System.out.println("-----------------------");
		System.out.println(getName()+" 이동중..");
	}
}
