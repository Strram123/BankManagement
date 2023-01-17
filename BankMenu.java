

import java.util.Scanner;

public class BankMenu extends CashWithdraw{

	public static void main(String[] args) {
		
		System.out.println("                    Bank Of India               ");
		System.out.println();
		System.out.println("Main menu");
		System.out.println("               1.cash Deposit");
		System.out.println();
		System.out.println("               2.cash withdrawl");
		System.out.println();
		System.out.println("               3.Create a new account ");
		System.out.println();
		System.out.println("               4.Delete Account");
		System.out.println();
		System.out.println("               5.exit");
		System.out.println();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Choice:");
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			CashDeposit cs=new CashDeposit();
			cs.getName();
			cs.getAcnbr();
			cs.getcash();
			System.out.println("your Cash Has Been Debited!");
			break;
		case 2:
			//CashWithdraw cw=new CashWithdraw();
			CashWithdraw cw=new BankMenu();
			cw.getName();
			cw.getAcnbr();
			cw.getcash();
			System.out.println("your withdraw is success");
			break;
		case 3:
			CreateAccount ca=new CreateAccount();
			ca.getname();
			ca.getMobNo();
			ca.getAadhar();	
			System.out.println("Your Account Creation is Succesfull");
			break;
		case 4:
			DeleteAccount da=new DeleteAccount();
			da.acnbr();
			da.getMobNo();
			da.getAadhar();
			System.out.println("your Account has been Deleted!");
			break;
		case 5:
			System.out.println(" exited!!!!!");
			break;
		default:
			System.out.println("please enter Valid key!");
			
		}
		
		

	}

}
