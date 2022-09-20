import java.util.*;
import java.util.Random;
public class Employee {
String firstName;
String lastName;

Employee(String firstName,String lastName ){
	this.firstName = firstName;
	this.lastName = lastName;
	}
public String getFirstName() {
	return firstName;
}
public String getLastName() {
	return lastName;
}

public static void main(String args[]) {
	
	Employee employee = new Employee("akshada","wagh");
	CredentialService empCred = new CredentialService(employee);
	System.out.println("Please Enter the Department from the Following");
	System.out.println("1. Technical");
	System.out.println("2. Admin");
	System.out.println("3. Human Resources");
	System.out.println("4. Legal");
    Scanner sc = new Scanner(System.in);
    int choice = sc.nextInt();
    
    switch(choice)
    {
    case 1: empCred.generateEmailID("tech");
    	break;
    case 2: empCred.generateEmailID("admin");
    	break;
    case 3: empCred.generateEmailID("hr");
    	break;
    case 4: empCred.generateEmailID("legal");
    	break;
    default:
    	System.out.println("Please Enter the valid Department Choice");
    
    }
    empCred.generateRandomPassword();
	
}
}
