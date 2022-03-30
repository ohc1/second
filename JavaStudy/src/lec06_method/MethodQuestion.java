package lec06_method;

public class MethodQuestion {
	public static void main(String[] args) {
		// 명함 만들기
		// 사용자가 이름, 연락처, 이메일을 입력했을 때,
		// 콘솔에
		// ===================================
		// 이름 : [사용자가 입력한 이름]
		// 연락처 : [사용자가 입력한 연락처]
		// 이메일 : [사용자가 입력한 이메일]
		// ===================================
		// 와 같은 형태로 출력해주는 함수를 만들어보세요.
		
		makeCard("오현철","334-4234","adfadfaddc");
		
		System.out.println("\n============================================\n");
		
		// 성적표 만들기
		// 두근두근 성적표가 나왔습니다.
		// 국어, 영어, 수학 점수를 입력했을 경우,
		// 국어, 영어, 수학, 총점, 평균, 등급을 출력하는 성적표
		// 평균은 소수 둘째자리에서 반올림하여 출력
		// 90점 이상 A, 80점 이상 B, 70점 이상 C, 60점 이상 D, 나머지 F
		
		// 국어: 91
		// 영어: 83
		// 수학: 77
		// 총점: 251
		// 평균: 80.x
		// 등급: B
		
//		avgScore(91,83,77);
		
		makeCard(91,87,78);
		
		System.out.println("\n============================================\n");
		// LoopFor에서 했던 각 자리수 더하기를 함수화해보세요.
		
		System.out.println(eachAdd(2839845));
		System.out.println(eachAdd("2839845"));
		
		
		System.out.println("\n=============================================\n");
		
		int intVal = 23;
		String binaryString = Integer.toBinaryString(intVal);
		System.out.println(binaryString);
		
		String myBinaryStr = makeBinary(intVal);
		System.out.println(myBinaryStr);
		
		System.out.println("\n=============================================\n");
		
		// for문을 배울때, 트리를 참 많이 만들었죠?
		// 근데 항상 5층짜리 트리여서 아쉬웠을거에요.
		
		// 사용자가 층(int n)을 입력받아서
		// n층 짜리 트리를 출력할 수 있는 메소드를 만들어서
		// 실행시켜 주세요.
		
		makeTree(9);
		
	} // main 의 끝
	
	public static void makeTree(int n) {
		String star = "*";
		String blank = "";
		for(int i=0; i<n; i++) {
			if(i>0) {
				star += "**";
			}
			blank ="";
			for(int j=1; j<n-i; j++) {
				blank += " ";
			}
			System.out.println((i+1) + ":" + blank + star);
		}
		
	}
	
	
	public static String makeBinary(int num) {
		// 30이 들어왔다 ㅎㄷㄷ
		// 30을 2로 나눠서 나머지는 0 / 몫은 15
		// 15를 2로 나눠서 나머지는 1 / 몫은 7
		// 7을 2로 나눠서 나머지는 1 / 몫은 3
		// 3을 2로 나눠서 나머지는 1 / 몫은 1
		String result = "";
		
		while(true) {			
			result += (num % 2);
			if(num == 1) {
				break;
			}		
			num /= 2;				
		}
		return reverseString(result);
	}
	// 거꾸로 출력
	public static String reverseString(String str) {
		String reverse = "";
		for(int i = str.length(); i > 0; i--) {
			reverse += str.substring(i-1,i);
		}
		return reverse;	// 리턴시 메소드 종료
	}
	
	
	
	// 메소드 오버로딩 해서, int도 받고, String도 받아야 해요.
	public static int eachAdd(int num) {
//		String strNum = num + ""; 문자열로 변환
		int result = 0;
		for(int i = 0; i < String.valueOf(num).length(); i++) {
			result += Integer.parseInt(String.valueOf(num).substring(i,i+1));
		}
		return result;
	}

	public static int eachAdd(String num) {
		int result = 0;
		for(int i = 0; i < num.length(); i++) {
			result += Integer.parseInt(num.substring(i,i+1));
		}
		return result;
		
	}
	
	
	/**
	 * 입력한 실수를 소수 n번째 자리로 리턴해주는 함수
	 * @param douNum 반올림 하고 싶은 실수
	 * @param n	   반올림 하고 싶은 자리
	 * @return		   반올림된 실수
	 */
	public static double round(double douNum, int n) {
		// 소수 두번째 자리에서 반올림해서 
		// 소수 첫번째 자리를 만들고 싶다. (n = 1)
		// 3.141592 에서 10을 곱한 뒤, Math.round를 적용하고
		// 다시 10으로 나누면 됨
		
		// 소수 세번째 자리에서 반올림해서
		// 소수 두번째 자리를 만들고 싶다. (n = 2)
		// 3.141592 에서 100을 곱한 뒤, Math.round를 적용하고
		// 다시 100으로 나누면 됨
		
		// douNum = 3.141592, n = 2를 넣었다면
		int one = 1;
		for(int i = 0; i < n; i++) {
			one *= 10;
		}
		// longNum = 314.1592
		double mul = douNum * one;
		// longNum = 314
		long longNum = Math.round(mul);
		// douVal = 3.14
		double douVal = (double)longNum / one;
		return douVal;
		
	}
	
	// int a는 국어, int b는 영어, int c는 수학
	public static void makeCard(int a, int b, int c) {
		System.out.println("국어: " + a);
		System.out.println("영어: " + b);
		System.out.println("수학: " + c);
		// 총점
		int sum = a + b + c;
		System.out.println("총점: " + sum);
		// 평균
		double avg = (double)sum / 3.0;
		System.out.println("평균: " + round(avg,1));
		// 등급
		String grade = "F";
		if(avg >= 90) {
			grade = "A";
		}else if(avg >= 80) {
			grade = "B";
		}else if(avg >= 70) {
			grade = "C";
		}else if(avg >= 60) {
			grade = "D";
		}
		System.out.println("등급: " + grade); 
	}
	
	
	public static void makeCard(String name, String phone, String email) {
		System.out.println("==========================");
		System.out.println("이름 : " + "[" + name + "]");
		System.out.println("연락처 : " + "[" + phone + "]");
		System.out.println("이메일 : " + "[" + email + "]");
		System.out.println("==========================");
	}
	
	public static double avgScore(int kor, int eng, int math) {
		double result = 0;
		int all = 0;
		all = (kor+eng+math);
		result = (double)all / 3;
		if(result >= 90) {
			System.out.println("국어: " + kor);
			System.out.println("영어: " + eng);
			System.out.println("수학: " + math);
			System.out.println("총점: " + all);
			System.out.printf("평균: " + result);
			System.out.println("등급: A" );
		}else if(result >= 80) {
			System.out.println("국어: " + kor);
			System.out.println("영어: " + eng);
			System.out.println("수학: " + math);
			System.out.println("총점: " + all);
			System.out.println("평균: " + result);
			System.out.println("등급: B" );
		}else if(result >= 70) {
			System.out.println("국어: " + kor);
			System.out.println("영어: " + eng);
			System.out.println("수학: " + math);
			System.out.println("총점: " + all);
			System.out.println("평균: " + result);
			System.out.println("등급: C" );
		}else if(result >= 60){
			System.out.println("국어: " + kor);
			System.out.println("영어: " + eng);
			System.out.println("수학: " + math);
			System.out.println("총점: " + all);
			System.out.println("평균: " + result);
			System.out.println("등급: D" );
		}else {
			System.out.println("국어: " + kor);
			System.out.println("영어: " + eng);
			System.out.println("수학: " + math);
			System.out.println("총점: " + all);
			System.out.println("평균: " + result);
			System.out.println("등급: F" );
		}
		return result;
	}
	
	
	
}
	
