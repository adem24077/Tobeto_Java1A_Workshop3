package oppWithNLayeredCarApp.entities;

public class Car {
	private int id;
	private String brand;
	private String model;
	private double pricePerHour;
	
	public Car() {

	}

	public Car(int id, String brand, String model, double pricePerHour) {
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.pricePerHour = pricePerHour;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}


	
	
	

}
