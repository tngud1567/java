package members.manage;
//회원 객체들을 중개 클래스

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import members.data.Member;

public class MemberMgr {

	private static final int MAX_MEMBERS = 5;
	protected Member[] members; //상속됨
	
	//1. 다수의 회원들을 저장할 공간이 준비
	
	public MemberMgr() {
		this.members = new Member[MAX_MEMBERS];
	} //{ null, null,null, null,null }

	public MemberMgr(int size) {
		if(size <= 0 ) size =MAX_MEMBERS;
		this.members = new Member[size];
	} //{ null, null,null, null,null }
	
	public MemberMgr(Member[] store) {
		if(store != null && store.length > 0)
			this.members = members;
		else
			this.members = new Member[MAX_MEMBERS];
	} //{ null, null,null, null,null }
	
	
	
	// 2. 등록된 회원들의 명수를 확인할 수 있다.
	public int checkNumberOfMembers() {
		int count =0;
		for (int i = 0; i < members.length; i++) {
			Member mb = members[i];
			if(mb != null) count++;
		}
	return count;
	}
	
	// 3.저장소가 꽉찼는지, 비어있는지?
	public boolean isMembersFull() {
		return this.members.length == checkNumberOfMembers();	
	}
	
	public boolean isMembersEmtpy() {
		return checkNumberOfMembers() == 0;
	}

	// 4. 등록된 회원들의 리스트를 출력할 수 있음
	public void printAllMembers() {
		System.out.println("===회원리스트===" +checkNumberOfMembers() + "명");
		System.out.println("#,이름, 나이, 이메일    , 계정, 암호, 생일     , 가입일  , 마일리지");
		for (Member mb : members) {
			System.out.println(mb == null ? "회원없어": mb.toString() );
			
		}
	}
		
	
	// 5. 회원을 등록할 수 있다
	public String inputString(Scanner sc ,String msg) {
		System.out.println(msg);
		return sc.next();
	}
	
	//6. 새로운 회원 등록
	public Member joinNewMember(Scanner sc) {
		if(isMembersFull()) {
			System.out.println("꽉차서 더이상 안들어가!");
			return null;
		}
		if(sc == null)
			sc = new Scanner(System.in);
		Member mb = null;
		int no = ++Member.order;
		String name = inputString(sc, ">> 회원이름");
		int age = Integer.parseInt(inputString(sc, ">>회원나이"));
		String email = inputString(sc, ">>회원이메일");
		String id = inputString(sc, ">>회원아이디");
		String password = inputString(sc,">> 회원암호");
		String birthStr = inputString(sc, ">> 회원 생년월일[예: 2000-09-12]: ");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date birthDay;
		try {   //에러가 발생할 수 있는 코드
			birthDay = sdf.parse(birthStr);
		}
		catch (ParseException e ) {
			//e.printStackTrace(); //오류 출력(방법은 여러가지)
			System.out.println("잘못된 생일 입력");
			birthDay = new Date();
		}
		
		Date joinDay = new Date();
		double mileage = 0.0;
		
		mb = new Member(no, name, age, email, id, 
				password, birthDay, joinDay, mileage);
	
		//회원저장
		int x = checkNumberOfMembers();
		this.members[x] = mb;
		
		return mb;
	}
	
	//7. 가입멤버과정
	public void processJoinMember() {
		Scanner sc = new Scanner(System.in);
		int count =0;
		do {
			Member newMB = joinNewMember(sc);
			System.out.println(newMB.getName() +"가입환영");
			count++;
			//if( this.isMembersFull() == false )
			if(!this.isMembersFull()) {
				String con = inputString(sc,">>추가회원가입(yes,no)");
				if(con.equalsIgnoreCase("no")||con.equalsIgnoreCase("n")||con.equalsIgnoreCase("아니요"));
				break;
				}
			else { //FULL 
				System.out.println("더이상 회원가입안됨..");
				break;
			}
			
		}while(true);
		System.out.println("\t 신규회원 "+ count +"명 추가됨...\n");
		
	}
	
	
	}

