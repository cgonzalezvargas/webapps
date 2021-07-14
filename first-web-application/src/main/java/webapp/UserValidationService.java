package webapp;

public class UserValidationService 
{
	public boolean isUserValid(String user, String password) 
	{
		if(user.equals("Chris") && password.equals("yolo")) 
			return true;
			 
				return false;
		
		
	}

}
