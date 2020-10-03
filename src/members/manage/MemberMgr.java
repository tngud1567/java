package members.manage;
//ȸ�� ��ü���� �߰� Ŭ����

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import members.data.Member;

public class MemberMgr {

	private static final int MAX_MEMBERS = 5;
	protected Member[] members; //��ӵ�
	
	//1. �ټ��� ȸ������ ������ ������ �غ�
	
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
	
	
	
	// 2. ��ϵ� ȸ������ ����� Ȯ���� �� �ִ�.
	public int checkNumberOfMembers() {
		int count =0;
		for (int i = 0; i < members.length; i++) {
			Member mb = members[i];
			if(mb != null) count++;
		}
	return count;
	}
	
	// 3.����Ұ� ��á����, ����ִ���?
	public boolean isMembersFull() {
		return this.members.length == checkNumberOfMembers();	
	}
	
	public boolean isMembersEmtpy() {
		return checkNumberOfMembers() == 0;
	}

	// 4. ��ϵ� ȸ������ ����Ʈ�� ����� �� ����
	public void printAllMembers() {
		System.out.println("===ȸ������Ʈ===" +checkNumberOfMembers() + "��");
		System.out.println("#,�̸�, ����, �̸���    , ����, ��ȣ, ����     , ������  , ���ϸ���");
		for (Member mb : members) {
			System.out.println(mb == null ? "ȸ������": mb.toString() );
			
		}
	}
		
	
	// 5. ȸ���� ����� �� �ִ�
	public String inputString(Scanner sc ,String msg) {
		System.out.println(msg);
		return sc.next();
	}
	
	//6. ���ο� ȸ�� ���
	public Member joinNewMember(Scanner sc) {
		if(isMembersFull()) {
			System.out.println("������ ���̻� �ȵ�!");
			return null;
		}
		if(sc == null)
			sc = new Scanner(System.in);
		Member mb = null;
		int no = ++Member.order;
		String name = inputString(sc, ">> ȸ���̸�");
		int age = Integer.parseInt(inputString(sc, ">>ȸ������"));
		String email = inputString(sc, ">>ȸ���̸���");
		String id = inputString(sc, ">>ȸ�����̵�");
		String password = inputString(sc,">> ȸ����ȣ");
		String birthStr = inputString(sc, ">> ȸ�� �������[��: 2000-09-12]: ");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date birthDay;
		try {   //������ �߻��� �� �ִ� �ڵ�
			birthDay = sdf.parse(birthStr);
		}
		catch (ParseException e ) {
			//e.printStackTrace(); //���� ���(����� ��������)
			System.out.println("�߸��� ���� �Է�");
			birthDay = new Date();
		}
		
		Date joinDay = new Date();
		double mileage = 0.0;
		
		mb = new Member(no, name, age, email, id, 
				password, birthDay, joinDay, mileage);
	
		//ȸ������
		int x = checkNumberOfMembers();
		this.members[x] = mb;
		
		return mb;
	}
	
	//7. ���Ը������
	public void processJoinMember() {
		Scanner sc = new Scanner(System.in);
		int count =0;
		do {
			Member newMB = joinNewMember(sc);
			System.out.println(newMB.getName() +"����ȯ��");
			count++;
			//if( this.isMembersFull() == false )
			if(!this.isMembersFull()) {
				String con = inputString(sc,">>�߰�ȸ������(yes,no)");
				if(con.equalsIgnoreCase("no")||con.equalsIgnoreCase("n")||con.equalsIgnoreCase("�ƴϿ�"));
				break;
				}
			else { //FULL 
				System.out.println("���̻� ȸ�����Ծȵ�..");
				break;
			}
			
		}while(true);
		System.out.println("\t �ű�ȸ�� "+ count +"�� �߰���...\n");
		
	}
	
	
	}

