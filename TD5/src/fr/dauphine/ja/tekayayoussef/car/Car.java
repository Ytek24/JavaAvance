package TD5.src.fr.dauphine.ja.tekayayoussef.car;


public class Car {
	private final String brand;
	private final long value;
	public Car(String brand, long value)throws Exception {
		if(value < 0){
			throw new Exception("La valeur ne peut pas etre negative");
		}
		this.brand=brand;
		this.value=value;
		
	}
	public String getBrand() {
		return brand;
	}
	public long getValue() {
		return value;
	}
	public String toString() {
		String res = "Marque:"+this.getBrand()+ " Valeur: "+this.getValue();
		return res;
	}

}
