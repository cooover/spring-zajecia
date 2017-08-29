package pl.reaktor.model;

public class Register {

	private String login;
	private String pass;
	private String email;
	private String date;
	private boolean cb1;
	private boolean cb2;
	private boolean cb3;
	private String radio;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public boolean isCb1() {
		return cb1;
	}
	public void setCb1(boolean cb1) {
		this.cb1 = cb1;
	}
	public boolean isCb2() {
		return cb2;
	}
	public void setCb2(boolean cb2) {
		this.cb2 = cb2;
	}
	public boolean isCb3() {
		return cb3;
	}
	public void setCb3(boolean cb3) {
		this.cb3 = cb3;
	}
	public String getRadio() {
		return radio;
	}
	public void setRadio(String radio) {
		this.radio = radio;
	}
		
}
