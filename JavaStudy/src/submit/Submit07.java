package submit;

public class Submit07 {
	public static void main(String[] args) {
//		금액을 입력하면 단위별로 --억, --천, --백, --십 --만원 으로 변환해주는 함수 textMoney()를 만들어보세요 (천원 이하 단위는 무시)
//
//		파라미터는 long 금액, 리턴은 String 이겠죠
//      컨닝했어요
		textMoney(1234567890);
		System.out.println(textMoney(1234567890));
		System.out.println(textMoney(234567890));
		System.out.println(textMoney(34567890));
		System.out.println(textMoney(4567890));
		System.out.println(textMoney(567890));
	}
	public static String textMoney(long num) {
		String num1 = num + "";
		String result = "";		
		int len = num1.length();
		if ( len == 6 ) {
			result = num1.substring(0,1) + "십 " + num1.substring(1,2) + "만원";
		} else if ( len == 7 ) {
			result = num1.substring(0,1) + "백 " + num1.substring(1,2) + "십 " + num1.substring(2,3) + "만원";
		} else if ( len == 8 ) {
			result = num1.substring(0,1) + "천 " + num1.substring(1,2) + "백 " + num1.substring(2,3) + "십 "
					 + num1.substring(3,4) + "만원";
		} else if ( len == 9 ) {
			result = num1.substring(0,1) + "억 " + num1.substring(1,2) + "천 " + num1.substring(2,3) + "백 "
					 + num1.substring(3,4) + "십 " + num1.substring(4,5) + "만원";
		} else if ( len > 9 ) {
			result = num1.substring(0,2) + "억 " + num1.substring(2,3) + "천 " + num1.substring(4,5) + "백 "
					 + num1.substring(5,6) + "십 " + num1.substring(6,7) + "만원";
		}
		return result;
	} // textMoney
}
