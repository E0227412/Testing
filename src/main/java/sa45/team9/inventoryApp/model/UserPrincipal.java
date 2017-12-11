package sa45.team9.inventoryApp.model;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
public class UserPrincipal implements UserDetails {
	private static final long serialVersionUID = 1L;
	private User user;
    public UserPrincipal(User user) {
        this.user = user;
    }
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
//		List<SimpleGrantedAuthority> auths = new java.util.ArrayList<SimpleGrantedAuthority>();
//		auths.add(new SimpleGrantedAuthority("ADMIN"));
//		return auths;
		 final List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
	        for (final Role role : user.getRoles()){
	            authorities.add(new SimpleGrantedAuthority(role.getRole()));
	        }
	        return authorities;
	}
	@Override
	public String getPassword() {
		return user.getPassword();
	}
	@Override
	public String getUsername() {
		return user.getUsername();
	}
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}
	@Override
	public boolean isEnabled() {
		return true;
	}
	public User getUser() {
        return user;
    }
}
