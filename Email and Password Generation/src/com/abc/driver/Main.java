package com.abc.driver;
import com.abc.model.*;
import com.abc.service.*;
import java.util.*;

/*Main is the driver code*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee1=new Employee("Anubhab","Gupta");
		System.out.println("Please enter the department from the following\n 1. Technical\n 2. Admin\n 3. Human Resource\n 4. Legal");
		int option,flag=0;
		Scanner sc=new Scanner(System.in);
		option=sc.nextInt();
		String dept="";

		switch(option)					/*gets the user department*/
		{
		case 1:dept="tech";break;
		case 2:dept="admin";break;
		case 3:dept="hr";break;
		case 4:dept="legal";break;
		default:flag=1;					/*code in case user provides wrong input*/

		}
		if(flag==1)
			System.out.println("Sorry,You need to choose the right department");
		else
		{
			System.out.println("Dear "+ employee1.getFirstName() +" your generated credentials are as follows ");
			CredentialService myCreds=new CredentialService();
			myCreds.generatePassword();
			myCreds.generateEmailAddress(employee1,dept);
			myCreds.showCredentials();	//displays the email and password

		}



	}

}
