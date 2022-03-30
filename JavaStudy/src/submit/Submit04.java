package submit;

import java.util.Scanner;

public class Submit04 {
	public static void main(String[] args) {
//		사용자로부터 현재신장(cm)과 현재체중(kg)을 입력받아 비만도를 표기 해주는 프로그램을 작성하시오.
//
//		표준체중(kg) = (현재신장 - 100) * 0.9
//		비만도(%) = (현재체중 / 표준체중) * 100
//
//		비만도가 80미만은 저체중
//		비만도가 80이상 110미만은 정상체중
//		비만도가 110이상 130미만은 과체중
//		비만도가 130이상은 비만
		
		
		System.out.print("현재 신장(cm)을 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
		String height = sc.nextLine();
		System.out.print("현재 체중(kg)을 입력해주세요 : ");
		Scanner sc2 = new Scanner(System.in);
		String kg = sc2.nextLine();
		
	
		
		double avgKg = (Integer.parseInt(height) - 100) * 0.9;
		double ddoong = (Integer.parseInt(kg)/ avgKg) * 100;
		
		if(ddoong < 80) {
			System.out.println("저체중입니다.");
		}else if(ddoong >= 80 && ddoong < 110) {
			System.out.println("정상체중입니다.");
		}else if(ddoong >= 110 && ddoong < 130) {
			System.out.println("과체중입니다.");
		}else {
			System.out.println("비만입니다.");
		}

		
	}
}
