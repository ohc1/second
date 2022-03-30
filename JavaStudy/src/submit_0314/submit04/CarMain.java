package submit_0314.submit04;

import java.util.Scanner;


public class CarMain {
	public static void main(String[] args) {
		
		CarCompany bmw = new CarCompany("BMW");
		CarCompany benz = new CarCompany("Mercedes");
		
		bmw.addCar(new Car ("3시리즈" , 51000000));
		bmw.addCar(new Car ("5시리즈" , 63000000));
		bmw.addCar(new Car ("7시리즈" , 130000000));
		bmw.addCar(new Car ("x3" , 64000000));
		bmw.addCar(new Car ("x5" , 108000000));
		bmw.addCar(new Car ("x7" , 130000000));

//		for(int i = 0; i < carList.size(); i++) {
//			System.out.println(bmw);
//		}
		benz.addCar(new Car ("c클래스", 51000000));
		benz.addCar(new Car ("e클래스", 63000000));
		benz.addCar(new Car ("s클래스", 130000000));
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("차 바꾸고싶어요.");
			System.out.println("1. BMW | 2. Mercedes Benz | 3. 돈없어요");
			System.out.print(">>> ");
			int select = Integer.parseInt(sc.nextLine());
			
			if(select == 1) {
				System.out.printf(CarCompany.WELCOME,bmw.getName());
				System.out.println("차종");
				bmw.showList();
				
				System.out.print("차를 선택해주세요: ");
				String inputText = sc.nextLine();
				
				int i = bmw.indexOfCar(inputText);
				if(i != -1) {
					Car car = bmw.getCar(i);
					System.out.println(car.getName() + "를 " + car.getPrice() + "원에 구매하셨습니다.");
				}
			}else if(select == 2) {
				System.out.printf(CarCompany.WELCOME,benz.getName());
				System.out.println("차종");
				benz.showList();
				
				System.out.println("차를 선택해주세요: ");
				String inputText = sc.nextLine();
				
				int i = benz.indexOfCar(inputText);
				if(i != -1) {
					Car car = benz.getCar(i);
					System.out.println(car.getName() + "를 " + car.getPrice() + "원에 구매하셨습니다.");
				}
			}else if(select == 3) {
				System.out.println("나가세요.");
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	// main 종료
}
