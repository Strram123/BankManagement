

import java.util.Scanner;

public class CreateAccount {

	private String name;
	private long mobileNumber;
	private long aadharNbr;
	Scanner sc=new Scanner(System.in);
	
	public String getname() {
		System.out.println("Enter your Name: ");
		 name=sc.nextLine();
		 return name;
	}
	public long getMobNo() {
		System.out.println("Enter your Mob number: ");
		mobileNumber=sc.nextLong();
		return mobileNumber;
	}
	public long getAadhar() {
		System.out.println("Enter your aadharNumber: ");
		aadharNbr=sc.nextLong();
		return aadharNbr;
	}
}
