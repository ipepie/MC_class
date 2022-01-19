package java100.part3_4.OOP;

public class OOP_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car[] cars = {new Ambulance(), new Cultivator(), new SportsCar()};
		for(int i = 0; i<cars.length;i++) {
			cars[i].run(); 
		}
		for(Car car:cars) {
			car.run();
		}
	}
}

