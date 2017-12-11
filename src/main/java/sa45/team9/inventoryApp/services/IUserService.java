package sa45.team9.inventoryApp.services;
import sa45.team9.inventoryApp.model.User;


public interface IUserService {
	public User findUserByName(String name);
	public void saveUser(User user);
}
