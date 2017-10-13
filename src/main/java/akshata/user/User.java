package akshata.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Table(name="users")

@SQLDelete(sql =
"UPDATE users " +
        "SET deleted = something " +
        "WHERE id = ?")
@Where(clause = "deleted = false")

public class User {
	
	@Id
	@GeneratedValue
	private String id;
	
	
	private String name;
	

	private String email;
	
	private int phoneNumber;
	
	
	private String password;
	
	private boolean deleted;
	
	
	public User()
	{
		
	}
	
	public User(String id,String name,String email,int phoneNumber,String password,boolean deleted) {
		super();
		
		this.id=id;
		this.name=name;
		this.email=email;
		this.password=password;
		this.phoneNumber=phoneNumber;
		this.deleted=deleted;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
