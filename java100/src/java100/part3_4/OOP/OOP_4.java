package java100.part3_4.OOP;

public class OOP_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FarmMachine fm = new FarmMachine();
		fm.number = 1000000;
		fm.year = 2020;
		fm.color = "red";
		System.out.println(fm.number);
		System.out.println(String.format("%,d", fm.number));
		System.out.println(fm.year);
		System.out.println(fm.color);
		fm.move();
		fm.dig();
		fm.grind();
	}
}
class FarmMachine {
	int number;
	int year;
	String color;
	
	public void move() {
		System.out.println("Farm-machine is moving");
	}
	public void dig() {
		System.out.println("Farm-machine is digging");
	}
	public void grind() {
		System.out.println("Farm-machine is grinding");
	}
}
