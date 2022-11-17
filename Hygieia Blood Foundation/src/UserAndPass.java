import java.util.HashMap;

public class UserAndPass {
	
	//HashMap declaration
	HashMap<String, String> logininfo = new HashMap<String, String>();
	
	//constructor
	UserAndPass(){
		
		logininfo.put("Paolo", "sheesh");
		logininfo.put("Narte", "bruh");
		logininfo.put("Banag", "skrrr");
	}
	
	protected HashMap getLoginInfo(){
		return logininfo;
	}

}
