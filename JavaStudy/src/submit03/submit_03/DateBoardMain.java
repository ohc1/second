package submit03.submit_03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;

public class DateBoardMain {

	public static void main(String[] args) throws ParseException {
		ArrayList<DateBoard> dbList = new ArrayList<DateBoard>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");

		for (int i = 0; i < 30; i++) {
			int randMonth = (int) (Math.random() * 3) + 1; // 1~3
			int randDay = (int) (Math.random() * 28) + 1; // 1~28
			Calendar cal = Calendar.getInstance();
			cal.set(2022, randMonth - 1, randDay);

			String strDate = sdf.format(cal.getTime());
			dbList.add(new DateBoard(i + "번째 생성된 글", strDate));
		}

//		3-3

		for (int i = 0; i < dbList.size(); i++) {
			for (int j = 0; j < dbList.size() - 1 - i; j++) {
				String d1 = dbList.get(j).getDate();
				String d2 = dbList.get(j + 1).getDate();
				Date day = new Date(sdf.parse(d1).getTime());
				Date day2 = new Date(sdf.parse(d2).getTime());
				Calendar c1 = Calendar.getInstance();
				Calendar c2 = Calendar.getInstance();
				c1.setTime(day);
				c2.setTime(day2);
				long check1 = c1.getTimeInMillis();
				long check2 = c2.getTimeInMillis();
				if (check1 >= check2) {
					Collections.swap(dbList, j, j + 1);
				}
			}
		}
		for (int i = 0; i < dbList.size(); i++) {
			System.out.println(dbList.get(i));
		}

		System.out.println("\n=====================================\n");

// 		3-4
		Date dt1 = new Date();
//		String strDate = sdf.format(dateTime);
		for (int i = 0; i < dbList.size(); i++) {
			String strDate2 = dbList.get(i).getDate();
			Date dt2 = sdf.parse(strDate2);
			long dsc = dt1.getTime() - dt2.getTime();
			long diff = dsc / (1000 * 60 * 60 * 24);
			if (diff <= 30) {
				System.out.println(dbList.get(i));
			}
		}
		System.out.println("\n===================================\n");

//		3-5  sdf, for
		Date dt3 = new Date();
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM");
//		System.out.println(dt3_2);
		for (int i = 0; i < dbList.size(); i++) {
//			sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
			Date dt18 = sdf.parse(dbList.get(i).getDate());
			String dt4 = sdf2.format(dt18);
			String dt3_1 = sdf2.format(dt3);
			int today = Integer.parseInt(dt3_1);
			int month = Integer.parseInt(dt4);
			if (today == month) {
				System.out.println(dbList.get(i));
			}
		}
		System.out.println("\n======================================\n");
		
//		3-6
		for(int i=0; i<dbList.size(); i++) {
			Date month2 = sdf.parse(dbList.get(i).getDate());
			String strTwo = sdf2.format(month2);
			if(strTwo.equals("02")) {
				System.out.println(dbList.get(i));
			}
		}
		
		System.out.println("\n=========================================\n");
		
//		3-7
		for(int i=0; i<dbList.size(); i++) {
			SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMdd");
			Date month1 = sdf.parse(dbList.get(i).getDate());
			String strM1 = sdf3.format(month1);
			
			int m1 = Integer.parseInt(strM1);
			if(20220214 <= m1 && 20220321 > m1) {
				System.out.println(dbList.get(i));
			}
		}
		
	} // main 종료
}
