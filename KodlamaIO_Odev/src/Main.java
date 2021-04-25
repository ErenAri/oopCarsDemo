
public class Main {
	public static void main(String[] args) {
		Car car1 = new Car(1,"Aston Martin",150.000);
		Car car2 = new Car(2,"Range Rover",27.000);
		Car car3 = new Car(3,"Bugatti",500.000);
		Car car4 = new Car(4,"Tesla",70.000);
		
		Car[] cars = {
			car1,
			car2,
			car3,
			car4
		};
			
		for(Car car:cars) {
			System.out.println("Arabalar: "+car.brand);
		}
		
		CarDetail carDetail1 = new CarDetail();
		carDetail1.id=1;
		carDetail1.detail="Super Sport araba";
		
		CarDetail carDetail2 = new CarDetail();
		carDetail2.id=2;
		carDetail2.detail="SUV araba";
		
		AddToCart addToCart = new AddToCart();
		addToCart.addToCart(car1);
		addToCart.addToCart(car2);
		addToCart.addToCart(car3);
		addToCart.addToCart(car4);
	}
}
