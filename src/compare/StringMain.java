package compare;

public class StringMain {

	public static void main(String[] args) {
		
		String s1; // �ּҸ� ������ �ִ� ���� s1�� ����
		s1 = "ABCDE"; // ���ڿ� ��ü�� s1�� ����
		String s2 = new String("ABCDE");//�������� ������ ���ڿ� ��ü�� �ּҰ� s2�� ����
		
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
		System.out.println("�� �迭�� ��ġ ����?: " + (cArr1 == cArr4b)); 
		switch(ret) {
		case MATCH: System.out.println("�� ���� �迭�� �����մϴ�"); break;
		case MISMATCH:System.out.println("�� ���� �迭�� �ٸ��ϴ�"); break;
		case NULL: System.out.println("�� ���� �迭�� null�Դϴ�"); break;
		case DIFF_LENGTH: System.out.println("�� ���� �迭�� ���̰� �ٸ��ϴ�"); break;
		default: break;
		
		}
	}//main

	
	
	
	private static final int NULL = 1;
	private static final int DIFF_LENGTH = 3;
	private static final int MISMATCH = 5;
	private static final int MATCH = 0;
	
	//��ü������ ���Ǵ��� �������(�ʿ�/���ƿ� ���� �����ϱ� ����)
	private static int compareCharArrays(char[] cArrA, char[] cArrB) {
		//�� �迭���ڰ� �ϳ��� null�϶�..
		if(cArrA == null || cArrB == null)
		return NULL;
	
		//������ ���� ��
		if(cArrA.length != cArrB.length)
			return DIFF_LENGTH;
		
		//�������� ���� �� ������ ��.
		for (int i = 0; i < cArrB.length; i++) {
			if(cArrA[i] != cArrB[i]) //���ڿ�Ұ� �ϳ��� ���̳���..
				return MISMATCH;
		}
		return MATCH; //�� ���ڹ迭�� ������ ����!
	}



	// ���ڹ迭 ��ü�� �ּҸ� �����ϴ� �Լ�
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
	�� �迭�� ��ġ ����?: false
	�� ���� �迭�� �����մϴ�
	 */
	

	
}