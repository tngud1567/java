package compare;

public class StringMain2 {

	public static void main(String[] args) {
		
		String a = "�����ͺ��̽�";
		String b = "JAVA";
		System.out.printf("a(%s) == b(%s) => %s \n",a,b,(a==b));
		System.out.printf("a(%s) equals() b(%s) => %s \n", a,b,(a.equals(b)));
		
		/*
		 a(�����ͺ��̽�) == b(JAVA) => false 
		 a(�����ͺ��̽�) equals() b(JAVA) => false 
		 */
		
		String c =a;
		//�ڵ��ϼ� �� == (�� ��ü�� �ּҿ� ������ ��ġ��)
		System.out.printf("c(%s) == a(%s) => %s \n", c,a,(c==a));
		//�ڵ�� �� equals() (�� ��ü�� ������ ��ġ��)
		System.out.printf("c(%s) equals() a(%s) => %s \n",c,a,(c.equals(a)));
	
		
		/*
		 c(�����ͺ��̽�) == a(�����ͺ��̽�) => true 
		 c(�����ͺ��̽�) equals() a(�����ͺ��̽�) => true 
		 */
	
		String d = new String(a); //new ���ο� �ּҸ� ��ü�� �Ҵ�
		System.out.printf("d(%s) == a(%s) => %s \n", d,a,(d==a)); //�ּҰ� �ٸ�
		System.out.printf("d(%s) equals() a(%s) => %s \n" ,d,a,(d.equals(a)));
		
		/*
		 d(�����ͺ��̽�) == a(�����ͺ��̽�) => false 
		 d(�����ͺ��̽�) equals() a(�����ͺ��̽�) => true 
		 */
		
		char[] aArr = {'��','��','��','��','��','��'};
		String e = new String(aArr); //�ּҰ� �ٸ�
		System.out.printf("e(%s) == a(%s) => %s \n", e,a,(e==a));
		System.out.printf("e(%s) equals() a(%s) => %s \n",e,a,(e.equals(a)));
		
		/*
		 e(�����ͺ��̽�) == a(�����ͺ��̽�) => false 
		 e(�����ͺ��̽�) equals() a(�����ͺ��̽�) => true 
		 */
		
		String f = "�����ͺ��̽�";
		System.out.printf("f(%s) == a(%s) => %s \n", f,a,(f==a));
		System.out.printf("f(%s) equals() a(%s) => %s \n",f,a,(f.equals(a)));
		
		/*
		 f(�����ͺ��̽�) == a(�����ͺ��̽�) => true 
		 f(�����ͺ��̽�) equals() a(�����ͺ��̽�) => true 
		 */
	
		String g = new String("�����ͺ��̽�"); //�ּҰ� �ٸ�
		System.out.printf("g(%s) == a(%s) => %s \n",g,a,(g==a));
		System.out.printf("g(%s) equals() a(%s) => %s \n",g,a,(g.equals(a)));
	
		/*
		 g(�����ͺ��̽�) == a(�����ͺ��̽�) => false 
		 g(�����ͺ��̽�) equals() a(�����ͺ��̽�) => true 
		 */

	
	}

}
