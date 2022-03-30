package submit03.submit_04;

import java.util.regex.Pattern;

public class Submit04 {
	public static void main(String[] args) {
		// 
		String regex = "\\d*";
		String result = "";
		String example = "a3b2c4d1a2h4";
		
		
		for(int i=0; i<example.length(); i++) {
			String ex = example.substring(i,i+1);
			boolean boolVal = Pattern.matches(regex, ex);
			if(boolVal == true) {
				int intA = Integer.parseInt(ex);
				for(int j=0; j< intA; j++) {
					String ex2 = example.substring(i-1,i);
					result += ex2;
				}
			}
		}
		System.out.println(result);
		
	}
}
