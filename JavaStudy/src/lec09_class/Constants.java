package lec09_class;
/**
 * 사전(Dictionary) 느낌으로 프로젝트에서 사용될 상수들을
 * 모아놓은 클래스
 */
public class Constants {
	
	public static final String WELCOME_CAFE = "어서오세요. 카페 %s입니다. 주문해주세요.\n"; 
	
	
	// 포켓몬 타입 정의
	public static final int TYPE_WATER = 031453;
	public static final int TYPE_FIRE = 1234;
	public static final int TYPE_PLANT = 224312;
	public static final int TYPE_THUNDER = 3134;
	
	public static String typeToString(int type) {
		if(type == TYPE_WATER) return "물";
		if(type == TYPE_FIRE) return "불";
		if(type == TYPE_PLANT) return "풀";
		if(type == TYPE_THUNDER) return "전기";
		
		return null;
	}
	
	
}
