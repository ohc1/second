package submit;

public class Submit03 {
	public static void main(String[] args) {
//		주어진 문자열을 이용하여, 명함을 만들어보세요. 꼭 제 이름이 아니여도 좋습니다.
//		split 사용

		String info = "정찬웅,010-7398-7332,akow283@gmail.com";
		String [] infoArray = info.split(",");
		System.out.println("이름 : " + infoArray[0]);
		System.out.println("번호 : " + infoArray[1]);
		System.out.println("이메일 : " + infoArray[2]);
	}
}
