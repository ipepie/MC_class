package java100.part3_4.OOP;

public class OOP_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Ambulance();
		Car c2 = new Cultivator();
		Car c3 = new SportsCar();
		c1.run();
		c2.run();
		c3.run();
	}
}

abstract class Car{
	abstract void run();
}
class Ambulance extends Car{
	void run() {
		System.out.println("앰뷸런스 지나가요~ 삐뽀삐뽀~");
	}
}
class Cultivator extends Car{
	void run() {
		System.out.println("경운기 지나가요~ 덜컹덜컹~");
	}
}
class SportsCar extends Car{
	void run() {
		System.out.println("스포츠카 지나가요~ 씽~");
	}
}