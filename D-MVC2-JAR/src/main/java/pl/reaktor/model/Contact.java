package pl.reaktor.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class Contact {

	@NotEmpty(message="{pl.reaktor.model.Contact.first.NotEmpty}")
	private String first;
	@NotEmpty(message="{pl.reaktor.model.Contact.last.NotEmpty}")
	private String last;
	@Email(message="{pl.reaktor.model.Contact.email.NotEmpty}")
	@NotEmpty(message="{pl.reaktor.model.Contact.email.Email}")
	private String email;
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Contact(){}
	public Contact(String first, String last, String email) {
		super();
		this.first = first;
		this.last = last;
		this.email = email;
	}
	
}
