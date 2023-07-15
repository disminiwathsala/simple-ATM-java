import java.util.*;
import java.util.Scanner;

public class Atm
{
	public static void main(String args[])
         {
	   int bal=5000,withdraw,deposit,n;
	   int pin=8085;
	   Scanner s=new Scanner(System.in);
	   Scanner keyboard=new Scanner (System.in);
	   System.out.println("   **WELCOME TO ATM**  ");
	   System.out.println("     INSERT CARD  ");
	   System.out.println("     ENTER YOUR PIN  ");
	   int entry=keyboard.nextInt();
	   while(entry!=pin)
		{
		    System.out.println("\n INCORECT PIN.....TRY AGAIN :");
		    System.out.println("ENTER YOUR PIN");
		    entry=keyboard.nextInt();
		}
	   do
{
System.out.println(" 1.Withdrawal : ");
System.out.println(" 2.Deposit : ");
System.out.println(" 3.Balance Status : ");
System.out.println(" 4.Transfer and Paymant : ");
System.out.println(" 5.Exit :");
System.out.println(" Enter Your Choose : ");

n=s.nextInt();

switch(n)
{
  case 1: System.out.print(" Enter Money to Withdraw :");
  withdraw=s.nextInt();
if(bal>withdraw)
   {
    bal=bal-withdraw;
    System.out.print("Please Collect Your Money :");
    }
    else
    System.out.print(" Insuffient Balance :");
      System.out.print(" ");
break;


case 2:System.out.print(" Enter Money to be Deposit :");
deposit=s.nextInt();
bal=bal+deposit;
System.out.print(" Your Money Deposited ");
System.out.println(" ");
break;

case 3: System.out.print("bal="+bal);
System.out.println(" ");
break;

case 4: System.out.print(" Connect to Bank for Details of Transfer and Payments :");
break;

case 5: System.exit(0);
}
}
while(n!=5);
}
}


