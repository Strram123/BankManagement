

import java.util.Scanner;

public class CashDeposit {

Scanner sc=new Scanner(System.in);
private String name;
private int nbr;
private int cash;
public String getName(){
	System.out.println("Enter Your Name: ");
	name=sc.nextLine();
	return name;
}
public int  getAcnbr() {
	System.out.println("Enter Your account no: ");
	 nbr=sc.nextInt();
	 return nbr;

}
public int getcash() {
	System.out.println("Enter your cash:");
	 cash=sc.nextInt();
	 return cash;
}
 
}
