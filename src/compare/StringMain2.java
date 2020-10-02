package compare;

public class StringMain2 {

	public static void main(String[] args) {
		
		String a = "데이터베이스";
		String b = "JAVA";
		System.out.printf("a(%s) == b(%s) => %s \n",a,b,(a==b));
		System.out.printf("a(%s) equals() b(%s) => %s \n", a,b,(a.equals(b)));
		
		/*
		 a(데이터베이스) == b(JAVA) => false 
		 a(데이터베이스) equals() b(JAVA) => false 
		 */
		
		String c =a;
		//★동일성 비교 == (두 객체의 주소와 내용이 일치함)
		System.out.printf("c(%s) == a(%s) => %s \n", c,a,(c==a));
		//★동등성 비교 equals() (두 객체의 내용이 일치함)
		System.out.printf("c(%s) equals() a(%s) => %s \n",c,a,(c.equals(a)));
	
		
		/*
		 c(데이터베이스) == a(데이터베이스) => true 
		 c(데이터베이스) equals() a(데이터베이스) => true 
		 */
	
		String d = new String(a); //new 새로운 주소를 객체가 할당
		System.out.printf("d(%s) == a(%s) => %s \n", d,a,(d==a)); //주소가 다름
		System.out.printf("d(%s) equals() a(%s) => %s \n" ,d,a,(d.equals(a)));
		
		/*
		 d(데이터베이스) == a(데이터베이스) => false 
		 d(데이터베이스) equals() a(데이터베이스) => true 
		 */
		
		char[] aArr = {'데','이','터','베','이','스'};
		String e = new String(aArr); //주소가 다름
		System.out.printf("e(%s) == a(%s) => %s \n", e,a,(e==a));
		System.out.printf("e(%s) equals() a(%s) => %s \n",e,a,(e.equals(a)));
		
		/*
		 e(데이터베이스) == a(데이터베이스) => false 
		 e(데이터베이스) equals() a(데이터베이스) => true 
		 */
		
		String f = "데이터베이스";
		System.out.printf("f(%s) == a(%s) => %s \n", f,a,(f==a));
		System.out.printf("f(%s) equals() a(%s) => %s \n",f,a,(f.equals(a)));
		
		/*
		 f(데이터베이스) == a(데이터베이스) => true 
		 f(데이터베이스) equals() a(데이터베이스) => true 
		 */
	
		String g = new String("데이터베이스"); //주소가 다름
		System.out.printf("g(%s) == a(%s) => %s \n",g,a,(g==a));
		System.out.printf("g(%s) equals() a(%s) => %s \n",g,a,(g.equals(a)));
	
		/*
		 g(데이터베이스) == a(데이터베이스) => false 
		 g(데이터베이스) equals() a(데이터베이스) => true 
		 */

	
	}

}
