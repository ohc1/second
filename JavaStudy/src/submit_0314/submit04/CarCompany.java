package submit_0314.submit04;

import java.util.ArrayList;

public class CarCompany {
	public static final String WELCOME = "어서오세요 %s 입니다. \n";
	private String name;
	private ArrayList<Car> carList = new ArrayList<Car>();
	
	
	
//	private static CarCompany instance = new CarCompany();
//	
//	public static CarCompany getInstance() {
//		return instance;
//	}

	public CarCompany(String name, ArrayList<Car> carList) {
		this.name = name;
		this.carList = carList;
	}
	
	public CarCompany(String name) {
		this.name = name;
		this.carList = new ArrayList<Car>();
	}
	
	public CarCompany() {
		
	}

	@Override
	public String toString() {
		return "[회사명 : " + name + ", 차 리스트 : " + carList + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addCar(Car car) {
		carList.add(car);
	}
	
	public Car getCar(int i) {
		return carList.get(i);
	}
	
	public int indexOfCar(String name) {
		for(int i = 0; i < carList.size(); i++) {
			if(carList.get(i).getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	
	public void showList() {
		for(Car car : carList) {
			System.out.println(car);
		}
	}
	
}
