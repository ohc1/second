package submit;

public class Submit08 {
	public static void main(String[] args) {
//		다음 문자열을 중복된 숫자와 함께 출력하시오
//		aaabbcdddaeefffffgg -> a3b2c1d3a1e2f5g2
//		컨닝했어요

//		String example = "aaabbcdddaeefffffgg";
//		int countSu_a = 0;
//		int countSu_b = 0;
//		int countSu_c = 0;
//		int countSu_d = 0;
//		int countSu_e = 0;
//		int countSu_f = 0;
//		int countSu_g = 0;
//
//		for(int i = 0; i < example.length(); i++) {
//			String alpha = example.substring(i, i+1);
//			if(alpha.equals("a")) {
//				countSu_a += 1;
//			}
//			if(alpha.equals("b")) {
//				countSu_b += 1;
//			}
//			if(alpha.equals("c")) {
//				countSu_c += 1;
//			}
//			if(alpha.equals("d")) {
//				countSu_d += 1;
//			}
//			if(alpha.equals("e")) {
//				countSu_e += 1;
//			}
//			if(alpha.equals("f")) {
//				countSu_f += 1;
//			}
//			if(alpha.equals("g")) {
//				countSu_g += 1;
//			}
//		}
//		
//		System.out.println("a"+countSu_a+"b"+countSu_b+"c"+countSu_c+"d"+countSu_d+"e"+countSu_e+"f"+countSu_f+"g"+countSu_g);
		
		
		String example = "aaabbcdddaeefffffgg";
		String anw = "";
		
		int cnt = 1;
		for ( int i  = 0; i < example.length() -1; i++ ) {
			if ( example.charAt(i) == example.charAt(i + 1) ) {
				cnt++;
			} else {
				anw += example.charAt(i) + (cnt + "");
				cnt = 1;
			}
		} 
		System.out.println(anw);
		
		

	}
}
