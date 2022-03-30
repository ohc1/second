package submit;

public class Submit01 {
	public static void main(String[] args) {
		//1. 정수(int), 실수(double), 문자열(String) 타입의 변수들을 선언하여 각각 출력하시오.
		//(변수명은 자유롭게 사용하시면 됩니다)

		int a = 1;
		double b = 1.1;
		String c = "abc";
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println("=============================");
		
		//2. 위에서 선언한 변수들의 값을 교체하시오.
		
		a = 2;
		b = 5.2;
		c = "def";
		
		System.out.println("=============================");
		
		//3. 위에서 선언한 정수형 타입의 변수를 실수로 형변환하여 출력하시오.
		double a1 = (double) a * 3.0;
		System.out.println("a1은 : " + a1);
		
		System.out.println("=============================");
		
		//4. 위에서 선언한 실수형 타입의 변수를 정수로 형변환하여 출력하시오.
		int a2 = (int) a1 * 3;
		System.out.println("a2는 : " + a2);
		
		System.out.println("=============================");
		
		//5. 위에서 선언한 정수형 타입의 변수를 문자열로 형변환하여 출력하시오.
		String a3 = Integer.toString(a2);
		System.out.println("a3는 : " + a3);
		
		System.out.println("=============================");
				
		//6. 정수로 이루어진 문자열 타입의 변수를 정수로 형변환하여 출력하시오.
		int a4 = Integer.parseInt(a3);
		System.out.println("a4는 : " + a4);
		
		System.out.println("=============================");
				
		 //7. 정수(int), 실수(double), 문자열(String) 타입의 상수들을 선언한 후 콘솔창에 각각 출력하시오.
		final int d1 = 5;
		final double d2 = 6.0;
		final String d3 = "상수";
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
	}
}
