package members.data;

import java.util.Date;

//회원스키마
//써클동아리 가입
//관리번호, 이름,나이,이메일,계정명(ID unique)
//암호(password),생년월일,가입일,마일리지 등..
public class Member {
	
	public static final int DEF_AGE = 18;
	public static final double DEF_MILE = 1000.0;
	public static int order =0;
	
	private int no;
	private String name;
	private int age;
	private String email;
	private String id;
	private String password;
	private Date birthDay;
	private Date joinDay;
	private double mileage;
	
	
	//접근/참조함수 (getter 게터함수)
	public int getNo() {
		return no;
	}
	//설정자 함수 (setter 세터함수)
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	public Date getJoinDay() {
		return joinDay;
	}
	public void setJoinDay(Date joinDay) {
		this.joinDay = joinDay;
	}
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	
	//기본생성자
	public Member() {}
	
	//중간생성자
	public Member(String name, String email, String id, String password,Date birthDay) {
		this(++order, name, DEF_AGE, email, id, password, birthDay, new Date(), DEF_MILE);
	}
	//Full
	public Member(int no, String name, int age, String email, String id, String password,
			Date birthDay, Date joinDay,double mileage) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
		this.email = email;
		this.id = id;
		this.password = password;
		this.birthDay = birthDay;
		this.joinDay = joinDay;
		this.mileage = mileage;
	}
	@Override
	public String toString() {
		return "Member [no=" + no + ", name=" + name + ", age=" + age + ", email=" + email + ", id=" + id
				+ ", password=" + password + ", birthDay=" + birthDay + ", joinDay=" + joinDay + ", mileage=" + mileage
				+ "]";
	}

	
	
}
