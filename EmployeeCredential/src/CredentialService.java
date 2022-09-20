
import java.util.Random;
public class CredentialService {
	Employee emp;

	CredentialService(Employee emp){
		this.emp=emp;
	}
	
	void generateEmailID(String dept) {
		System.out.println("Email ----> "+emp.getFirstName()+emp.getLastName()+"@"+dept+".abc.com");
	}
	
    void generateRandomPassword() {
       String capitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       String lowerLetters="abcdefghijklmnopqrstuvwxyz";
       String numbers="1234567890";
       String special="!@#$%^&*";
       String combine=capitalLetters+lowerLetters+numbers+special;
       Random random=new Random();
       char[] pass=new char[8];
       pass[0]=lowerLetters.charAt(random.nextInt(lowerLetters.length()));
       pass[1]=capitalLetters.charAt(random.nextInt(capitalLetters.length()));
       pass[2]=numbers.charAt(random.nextInt(numbers.length()));
       pass[3]=special.charAt(random.nextInt(special.length()));
       
       for(int i=4;i<8;i++) {
    	   
    	   pass[i]=combine.charAt(random.nextInt(combine.length()));
       }
       System.out.println("Password ----> "+String.valueOf(pass));
 
    }

}
