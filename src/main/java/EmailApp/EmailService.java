package EmailApp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class EmailService {
	
	public String chooseDepartment(int depChoice){
		
		if(depChoice == 1){
			return "sales";
		}
		else if(depChoice == 2){
			return "dev";
		}
		else if(depChoice == 3){
			return "acc";
		}
		else
			return "";
		
	}
	
	public String randomPassport(int length){
		
		String passwordSet = "ABDDJFJDNFJDSMDFKNFDUN";
		char[] password = new char[length];
		
		
		for(int i =0; i< length ;i++){
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	

	
	
}
