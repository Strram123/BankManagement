

import java.util.Scanner;

public class DeleteAccount {
	
	private long acnbr;
	private long mobileNumber;
	private long aadharNbr;
	Scanner sc=new Scanner(System.in);
	
	public long acnbr() {
		System.out.println("Enter your Account number: ");
		acnbr=sc.nextLong();
		 return acnbr;
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
