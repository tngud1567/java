package compare;

public class StringMain {

	public static void main(String[] args) {
		
		String s1; // 주소를 담을수 있는 변수 s1에 선언
		s1 = "ABCDE"; // 문자열 객체를 s1에 저장
		String s2 = new String("ABCDE");//동적으로 생성된 문자열 객체의 주소가 s2에 저장
		
		char[] cArr1 = s1.toCharArray();
		char[] cArr2 = toMyCharArray(s2);
		char[] cArr3 = new char[5];
		for (int i = 0; i < cArr3.length; i++) {
			cArr3[i] = (char)('A' + i);
		}
		char[] cArr4 = {'A','B','C','D','E'};
		char[] cArr4b = new char[] {'A','B','C','D','E'};
		
		System.out.println(cArr1);
		System.out.println(cArr2);
		System.out.println(cArr3);
		System.out.println(cArr4);
		System.out.println(cArr4b);
		
		int ret = compareCharArrays(cArr1, cArr4b);
		System.out.println("두 배열의 위치 동일?: " + (cArr1 == cArr4b)); 
		switch(ret) {
		case MATCH: System.out.println("두 문자 배열이 동일합니다"); break;
		case MISMATCH:System.out.println("두 문자 배열이 다릅니다"); break;
		case NULL: System.out.println("두 문자 배열이 null입니다"); break;
		case DIFF_LENGTH: System.out.println("두 문자 배열의 길이가 다릅니다"); break;
		default: break;
		
		}
	}//main

	
	
	
	private static final int NULL = 1;
	private static final int DIFF_LENGTH = 3;
	private static final int MISMATCH = 5;
	private static final int MATCH = 0;
	
	//객체지향의 비교판단은 상대적임(필요/문맥에 따라 정의하기 나름)
	private static int compareCharArrays(char[] cArrA, char[] cArrB) {
		//두 배열인자가 하나라도 null일때..
		if(cArrA == null || cArrB == null)
		return NULL;
	
		//사이즈 동일 비교
		if(cArrA.length != cArrB.length)
			return DIFF_LENGTH;
		
		//이제서야 정상 비교 조건이 됨.
		for (int i = 0; i < cArrB.length; i++) {
			if(cArrA[i] != cArrB[i]) //글자요소가 하나라도 차이나면..
				return MISMATCH;
		}
		return MATCH; //두 문자배열의 내용이 같다!
	}



	// 문자배열 객체의 주소를 리턴하는 함수
	private static char[] toMyCharArray(String s2) {
		final int len = s2.length();
		char[] arr = new char[len];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s2.charAt(i);
		}
		return arr;
	}

	
	/*
	ABCDE
	ABCDE
	ABCDE
	ABCDE
	ABCDE
	두 배열의 위치 동일?: false
	두 문자 배열이 동일합니다
	 */
	

	
}