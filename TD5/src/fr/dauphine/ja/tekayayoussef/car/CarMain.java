package TD5.src.fr.dauphine.ja.tekayayoussef.car;

public class CarMain {
	public static void main(String[] args) {
		try {
			Car car1 = new Car("BMW", 37000);
			Car car2 = new Car("Mercedes", 50000);
			Garage garage1= new Garage();
			garage1.add(car1);
			garage1.add(car2);
			System.out.println(garage1.toString());
			System.out.println(car1.toString());
			System.out.println(garage1.sumValeur());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
