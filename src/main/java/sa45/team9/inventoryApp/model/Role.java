package sa45.team9.inventoryApp.model;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "role")
public class Role {
	//@ManyToMany(targetEntity=User.class, fetch = FetchType.EAGER)
	//@JoinTable()
	//private List<User> users;	
//	@ManyToOne(fetch = FetchType.EAGER)	
//	@JoinColumn(name="User")
//	private User user;
	
	@Id
	@Column(name="role_id")
	private String id;
//	@Column(name="user_id")
//	private String userID;
	
	@Column(name="role")
	private String role;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
//	public User getUser() {
//		return user;
//	}
//	public void setUser(User user) {
//		this.user = user;
//	}
//	public String getUserID() {
//		return userID;
//	}
//	public void setUserID(String userID) {
//		this.userID = userID;
//	}
	
}