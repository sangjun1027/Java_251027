package day2;
// project 때 사용가능
/**
 *  @author 상준
 *  @since 1.4
 */
public class StringUtil {
	
	/** document주석
	 * 
	 * 주민번호로 출생년도 추출
	 * @param id 주민번호
	 * @return 년도 4자리
	 */
	public static String getYear(String id) {
		// id가 없으면 빈값 return
		if(id == null) {
		return "";
		} 
		String result = id.substring(0, 4);
		return result;
	}
	
	// 년, 월, 일을 join해서 return
	public static String getDate(String ... date) {
		// return date[0] + "-" + date[1] + "-" + date[2];
		return String.join("-", date);
	}
	
	public static String getYear(String y, String m, String d) {
		// return y + " - " + m + " - " + d;
		return String.join(" - ", y, m, d);
	}
	
	// y-m-d형식의 날짜문자열을 받아서 '-' 나누어서 연도만 리턴
	public static String getSplitYear(String year) {
		String[] date = year.split("-");
		return date[0];

	}
		
		
  }
	

