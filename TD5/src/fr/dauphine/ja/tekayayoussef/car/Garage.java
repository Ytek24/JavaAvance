package TD5.src.fr.dauphine.ja.tekayayoussef.car;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class Garage {

    private ArrayList<Car> Cars;
    public static int id;

    public Garage() {
        Cars = new ArrayList<>();
        ++id;
    }

    public void add(Car v) {
        v = Objects.requireNonNull(v);
        Cars.add(v);

        Comparator c = new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                Car c1 = (Car)o1;
                Car c2 = (Car)o2;

                return (c1.getBrand().compareTo(c2.getBrand()) + ((int)c1.getValue()- (int) c2.getValue()));
            }

        };
        Cars.sort(c);
    }

    public int getId() {
        return id;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Car v : Cars) {
            sb.append(v.toString());
            sb.append(" ,");
        }
        return sb.substring(0, sb.length() - 1);
    }

    public long getValues() {
        long total = 0;

        for (Car v : Cars)
            total += v.getValue();
        return total;
    }

    public Car firstCarByBrand(String brand) {

        for (Car v : Cars)
            if (v.getBrand().equals(brand))
                return v;
        throw new NoSuchElementException();
    }

    public Car remove(Car v) {
        Cars.remove(v);
        return v;
    }

    public boolean equals(Garage g) {
        return Cars.equals(g.Cars);
    }

    public void protectionism(String brand) {
        for(Car v : Cars)
            if(v.getBrand() == brand)
                Cars.remove(v);
    }

	public double sumValeur() {
		double valeurGarage=0;
		Iterator<Car> iterator= this.garage.iterator();
		while(iterator.hasNext()) {
			valeurGarage+=iterator.next().getValue();
			
		}
		return valeurGarage;
	}
	
	
}
