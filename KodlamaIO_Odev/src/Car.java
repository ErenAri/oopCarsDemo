
public class Car {
	public Car() {
		System.out.println("Araba se�ildi");
	}
	
	public Car(int id,String brand, double price) {
		this();
		this.id=id;
		this.brand=brand;
		this.price=price;
	}
	int id;
	String brand;
	double price;
}
