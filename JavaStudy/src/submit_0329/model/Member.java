package submit_0329.model;

public class Member {
	private String id;
	private String pw;
	
	public Member(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	
	public Member() {}

	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
	
}
