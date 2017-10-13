package akshata.user;


import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/user")
	public List<User> getAllUsers()
	{
		return userService.getAllUsers();
		}
	
	@RequestMapping("/user/{id}")
	public User getUser(@PathVariable String id)
	{
		User user = userService.getUser(id);
		return user;
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/user")
	public void addUser(@RequestBody User user)
	{
		
		userService.addUser(user);
		
		
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/user/{id}")
	public void updateUser(@RequestBody User user,@PathVariable String id)
	{
		userService.updateUser(id,user);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/user/{id}")
	public void deleteUser(@PathVariable String id)
	{
		 userService.deleteUser(id);
	}
	

}
