package model;

public class LoginLogic {
	public boolean execute(Login login) {

		if (login.getUserId().equals("root") && login.getPass().equals("1234")) {

			return true;
		} else {
			return false;
		}
	}
}
