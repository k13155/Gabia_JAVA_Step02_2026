package chapter20;

public class UserDTO {
	
	private String userid;
	private String name;
	private String password;
	private int age;
	private String email;
	
	public String getUserid() {
		return userid;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "UserDTO [userid=" + userid + ", name=" + name + ", password=" + password + ", age=" + age + ", email="
				+ email + "]";
	}
	
	

}
