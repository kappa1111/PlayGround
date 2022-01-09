package semiproject.vo;

public class MemberVO {
	private String mno;
	private String userid;
	private String passwd;
	private String email;
	private String name;
	private String regdate;
	
	public MemberVO() {	}

	

	public MemberVO(String userid, String email, String name, String regdate) {
		super();
		this.userid = userid;
		this.email = email;
		this.name = name;
		this.regdate = regdate;
	}



	public String getMno() {
		return mno;
	}

	public void setMno(String mno) {
		this.mno = mno;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
	
}
