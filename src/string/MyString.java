package string;

public class MyString {
	// https://en.wikipedia.org/wiki/Main_Page
	public static void main(String[] args) {
		// String Ŭ���� Ÿ�� - ���ڿ���ü, "" ���ͷ� ����
//		String msg = "The Portrait of the Duke of "
//				+ "Wellington is an oil-on-panel "
//				+ "painting by the Spanish artist "
//				+ "Francisco Goya.";
		// + �� concat()�� ����..
		
		String msg = "The Portrait of the Duke of ";
		msg = msg.concat("Wellington is an oil-on-panel ");
		msg = msg.concat("painting by the Spanish artist ");
//		msg = msg.concat("Francisco Goya.");
		msg = msg.concat("Duke Francisco Goya.");
		System.out.println("msg => " + msg);
		
		//���ڿ��� ����, �����ڵ� ������ ����
		int len = msg.length();
		System.out.println("���ڿ��� ���� = " + len);
		
		//���ڿ����� Ư����ġ�� ���� �ϳ� �̱�
		char c = msg.charAt(7);
		System.out.printf("�����ϳ��̱� = %c [%d,0x%X]\n" ,c,(int)c,(int)c);
	
		//���� �迭�� ���� �����ϱ�
		char cArr[] = msg.toCharArray();
		System.out.println("���ڹ迭�� ���븮���ϱ� = " + cArr);
		for (char d : cArr) {
			System.out.print( d +" ");
		}
		System.out.println();
	
		
		//���� ����: �κй��ڿ��� ���ԵǾ��°�?
		System.out.println("Duke �κй��ڿ��� ���ԵǾ��°�? " + msg.contains("Duke"));
		System.out.println("King �κй��ڿ��� ���ԵǾ��°�? " + msg.contains("King"));
		
		
		//��ġ �ľ�: �ش� ������ ��ġ? �ش� ���ڿ��� (����)��ġ?
		System.out.println("Duke �ش繮�ڿ��� (����)��ġ? " + msg.indexOf("Duke",0));
		System.out.println("Duke 21������ �ش� ���ڿ��� (����)��ġ"+msg.indexOf("Duke",21));
		System.out.println("D �ش繮���� (����)��ġ? " + msg.indexOf('D'));
		System.out.println("King �ش繮�ڿ��� (����)��ġ? "+ msg.indexOf("King"));
		System.out.println("K �ش繮���� (����)��ġ?" + (msg.indexOf('K')==-1? "����":msg.indexOf('K')));
		
		
		//������ ã��
		System.out.println("Duke �ڿ������� �ش� ���ڿ��� (����)��ġ? "+ msg.lastIndexOf("Duke"));
		System.out.println("D �����⿡���� �ش繮����(����) ��ġ?" + msg.lastIndexOf('D') );
		
		
		//���ڿ� ��, ��ȯ ��
		String wordA = "banana";
		String wordB = new String("banana");
		String wordC = new String(new char[] {'B','A','N','A','N','A'});
		System.out.println(wordA + "��" + wordB +"�� ������ ����(" + (wordA.equals(wordB))+")");
		System.out.println(wordA + "��" + wordC +"�� ������ ����(" + (wordA.equals(wordC))+")");
		System.out.println(wordA + "��" + wordC.toLowerCase()+"�� ����� ����(" +(wordA.equals(wordC.toLowerCase() )) +")");
		System.out.println(wordA.toUpperCase() + "��" + wordC+"�� ����� ����(" +(wordA.toUpperCase().equals(wordC)) +")");

		
		//�Һ��� Immutablity =>���ڿ� ��ü�� �Һ�
		System.out.println(wordA +"��"+wordC+"�� ��ҹ��� �����ϸ� ������ ����("+(wordA.equalsIgnoreCase(wordC)) +")");
		
		//�Һ� ���ڿ��� ���ڿ�����?
		System.out.println("���ڿ�����?"+ wordB.isEmpty());
		System.out.println("���ڿ�����?" +"".isEmpty() );
		
		
		//���ڿ��� ���۰� �� üũ?
		String name1 = "�𿤻�";
		String name2 = "����Ͼȳ�";
		
		if(name1.charAt(0)== '��')
			System.out.println("�����");
		if(name2.startsWith("�����"))
			System.out.println(name2 + "�� '�����'�� ������");
		
		// ���ڿ��� �и� substring
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
			
			
			//java �� ���ڿ��� �������� �κй��ڿ��� �и��ϱ�
			String[] words = ex.split(" ");
			for (String word : words) {
				System.out.println(word);
			}
			
			String ex2 = "abc,defg,3456,xyz,09876,!!";
			String[] units = ex2.split(",");
			for (String unit : units) {
				System.out.println(unit);
			}
			
			//������ֱ� trim()
			String ex3 = 
					  "el sa   ,  an na  , w olaf  ,  abc  ,  "
					  + "        de fg ,  3456 ,  xyz  ,  09876 ,"
					  + "   ! ! ";
			String[] units2 = ex3.split(","); //=> split�� ���Խ� ��뿡 ����!
			for (String unit : units2) {
				System.out.println(unit.trim());
			}  
			System.out.println();
			
			
			//���ڿ� ��ü�ϱ� => replace�� ���Խ� ��뿡 ����!
			for (String unit : units2) {
				//String trimStr = unit.trim();
				String reStr = unit.replace(" ", "-");
				System.out.println(reStr);
			}
			
	} //main
	
	
	//�� ���ڿ��� �ΰ��� �ߴ��� ���� �и��Ͽ� �迭�� �����ϴ� �Լ�
	private static String[] separateString(String scr,int breakPt) {
		if(scr == null || scr.isEmpty() || breakPt < 0 || breakPt > scr.length()) {
			System.out.println("���ڿ� �и� ����!");
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
