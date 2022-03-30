package game;

public class Chicken {
	public static void main(String[] args) {
		int a = (int)((Math.random() * 5)+1);
		
		if(a == 1) {
			System.out.println("교촌");
		}else if(a == 2) {
			System.out.println("bbq");
		}else if(a == 3) {
			System.out.println("bhc");
		}else if(a == 4) {
			System.out.println("지코바");
		}else if(a == 5) {
			System.out.println("푸라닭");
		}
	}
}
