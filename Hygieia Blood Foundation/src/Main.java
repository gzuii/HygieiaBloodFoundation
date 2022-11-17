
public class Main {

	public static void main(String[] args) {
		
		UserAndPass userNpass = new UserAndPass();
		
		LoginPage loginPage = new LoginPage(userNpass.getLoginInfo());

	}

}
