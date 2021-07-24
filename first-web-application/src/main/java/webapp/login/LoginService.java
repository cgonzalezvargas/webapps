package webapp.login;

import org.springframework.stereotype.Service;

//new LoginService()
@Service
public class LoginService 
{
	public boolean validateUser(String username, String password) 
	{
		return username.equalsIgnoreCase("Chris") && password.equals("yolo");
	}

}
