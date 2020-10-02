package string;

public class MyString {
	// https://en.wikipedia.org/wiki/Main_Page
	public static void main(String[] args) {
		// String 클래스 타입 - 문자열객체, "" 리터럴 제공
//		String msg = "The Portrait of the Duke of "
//				+ "Wellington is an oil-on-panel "
//				+ "painting by the Spanish artist "
//				+ "Francisco Goya.";
		// + 는 concat()과 같다..
		
		String msg = "The Portrait of the Duke of ";
		msg = msg.concat("Wellington is an oil-on-panel ");
		msg = msg.concat("painting by the Spanish artist ");
//		msg = msg.concat("Francisco Goya.");
		msg = msg.concat("Duke Francisco Goya.");
		System.out.println("msg => " + msg);
		
		//문자열의 길이, 유니코드 문자의 갯수
		int len = msg.length();
		System.out.println("문자열의 길이 = " + len);
		
		//문자열에서 특정위치에 글자 하나 뽑기
		char c = msg.charAt(7);
		System.out.printf("글자하나뽑기 = %c [%d,0x%X]\n" ,c,(int)c,(int)c);
	
		//문자 배열로 내용 리턴하기
		char cArr[] = msg.toCharArray();
		System.out.println("문자배열로 내용리턴하기 = " + cArr);
		for (char d : cArr) {
			System.out.print( d +" ");
		}
		System.out.println();
	
		
		//포함 관계: 부분문자열이 포함되었는가?
		System.out.println("Duke 부분문자열이 포함되었는가? " + msg.contains("Duke"));
		System.out.println("King 부분문자열이 포함되었는가? " + msg.contains("King"));
		
		
		//위치 파악: 해당 글자의 위치? 해당 문자열의 (시작)위치?
		System.out.println("Duke 해당문자열의 (시작)위치? " + msg.indexOf("Duke",0));
		System.out.println("Duke 21부터의 해당 문자열의 (시작)위치"+msg.indexOf("Duke",21));
		System.out.println("D 해당문자의 (시작)위치? " + msg.indexOf('D'));
		System.out.println("King 해당문자열의 (시작)위치? "+ msg.indexOf("King"));
		System.out.println("K 해당문자의 (시작)위치?" + (msg.indexOf('K')==-1? "없음":msg.indexOf('K')));
		
		
		//역방향 찾기
		System.out.println("Duke 뒤에서부터 해당 문자열의 (시작)위치? "+ msg.lastIndexOf("Duke"));
		System.out.println("D 역방향에서의 해당문자의(시작) 위치?" + msg.lastIndexOf('D') );
		
		
		//문자열 비교, 변환 등
		String wordA = "banana";
		String wordB = new String("banana");
		String wordC = new String(new char[] {'B','A','N','A','N','A'});
		System.out.println(wordA + "와" + wordB +"의 내용은 같다(" + (wordA.equals(wordB))+")");
		System.out.println(wordA + "와" + wordC +"의 내용은 같다(" + (wordA.equals(wordC))+")");
		System.out.println(wordA + "와" + wordC.toLowerCase()+"의 내용과 같다(" +(wordA.equals(wordC.toLowerCase() )) +")");
		System.out.println(wordA.toUpperCase() + "와" + wordC+"의 내용과 같다(" +(wordA.toUpperCase().equals(wordC)) +")");

		
		//불변의 Immutablity =>문자열 객체는 불변
		System.out.println(wordA +"와"+wordC+"의 대소문자 무시하면 내용은 같다("+(wordA.equalsIgnoreCase(wordC)) +")");
		
		//불변 문자열이 빈문자열인지?
		System.out.println("빈문자열인지?"+ wordB.isEmpty());
		System.out.println("빈문자열인지?" +"".isEmpty() );
		
		
		//문자열의 시작과 끝 체크?
		String name1 = "디엘사";
		String name2 = "디즈니안나";
		
		if(name1.charAt(0)== '디')
			System.out.println("디즈니");
		if(name2.startsWith("디즈니"))
			System.out.println(name2 + "은 '디즈니'로 시작함");
		
		// 문자열의 분리 substring
		String wiki = "The 2006 Subway 500"
				+ " was the 32nd stock car "
				+ "race of the 2006 NASCAR "
				+ "Nextel Cup Series and the "
				+ "sixth in the ten-race "
				+ "Chase for the Nextel Cup.";
		
			String keyword = "NASCAR";
			int beginIdx = wiki.indexOf(keyword);
			int endIdx = beginIdx + keyword.length();
			String subway2 = wiki.substring(beginIdx, endIdx);
			System.out.println(subway2);
			
			String data ="0123456789" + "ABCDEF";
			String numbers = data.substring(1, 10);
			String alphas = data.substring(10); // 11 ~
			System.out.println(numbers);
			System.out.println(alphas);
			
			//
			
			String ex= "I am a boy";
			String[] sub = separateString(ex,7);
			System.out.println(sub[0]); // front
			System.out.println(sub[1]); //back
			
			
			//java 긴 문자열을 여러개의 부분문자열로 분리하기
			String[] words = ex.split(" ");
			for (String word : words) {
				System.out.println(word);
			}
			
			String ex2 = "abc,defg,3456,xyz,09876,!!";
			String[] units = ex2.split(",");
			for (String unit : units) {
				System.out.println(unit);
			}
			
			//공백없애기 trim()
			String ex3 = 
					  "el sa   ,  an na  , w olaf  ,  abc  ,  "
					  + "        de fg ,  3456 ,  xyz  ,  09876 ,"
					  + "   ! ! ";
			String[] units2 = ex3.split(","); //=> split는 정규식 사용에 주의!
			for (String unit : units2) {
				System.out.println(unit.trim());
			}  
			System.out.println();
			
			
			//문자열 대체하기 => replace는 정규식 사용에 주의!
			for (String unit : units2) {
				//String trimStr = unit.trim();
				String reStr = unit.replace(" ", "-");
				System.out.println(reStr);
			}
			
	} //main
	
	
	//긴 문자열은 두개로 중단점 기준 분리하여 배열로 리턴하는 함수
	private static String[] separateString(String scr,int breakPt) {
		if(scr == null || scr.isEmpty() || breakPt < 0 || breakPt > scr.length()) {
			System.out.println("문자열 분리 실패!");
			return null;
		}
		String front,back;
		front = scr.substring(0, breakPt);
		back = scr.substring(breakPt);
		//String[] ret = new String [2];
		//ret[1] = front; ret[1] = back;
		//return ret;
		return new String[] {front,back};
	}

}
