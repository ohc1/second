package submit_0314.submit04;

public class Car {
	private String name;
	private int price;
	
	public Car(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public Car() {
		
	}

	@Override
	public String toString() {
		return "Car [차종 : " + name + ", 가격 : " + price + "]";
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
