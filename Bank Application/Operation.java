package bank_application;
import java.util.Scanner;
public class Operation {
	public static void logininfo() {
		
		Scanner scan = new Scanner(System.in);
        System.out.println();
	    System.out.println("    [Banking System Application]    ");
        System.out.println();
        System.out.println("-> Login To Your Account : Press [1] ");
        System.out.println();
        System.out.println("-> Create a New Account  : Press [2] ");
		int choice=scan.nextInt();
		int loop1=1000000;
		while(loop1>0) {
		if(choice==1 || choice==2)
	    break;
		else {
			System.out.println("INVALID CHOICE [x] ");
		}
		}
		Process oop=new Process();
		oop.login(choice);
	}
	

	public static void bankinfo() 
	{
		Scanner scan = new Scanner(System.in);
	    System.out.println();
	    System.out.println(" 1. Check Balance\n 2. Deposit the amount \n 3. Withdraw the amount  \n 4. Exit  \n\nENTER CHOICE ->> "); 
	    int key=scan.nextInt();
	    operation(key);
	    
	   
	}
		public static void operation(int key)
		{
			Scanner scan = new Scanner(System.in);
			Process bankprocess = new Process();
			 switch (key) 
			 {

				case 1:
					System.out.println();
					bankprocess.checkbalance();
					System.out.println();
					System.out.println();
				    System.out.println("Goto Main Page >> PRESS 1 ->");
					if (scan.nextInt()==1) 
						bankinfo();
					break;
				case 2:
					System.out.println();
					System.out.println("         [WELCOME TO DEPOSITE PAGE]        ");
					System.out.println();
					bankprocess.deposite();
					System.out.println();
					System.out.println();
				    System.out.println("Goto Main Page >> PRESS 1 ->");
					if (scan.nextInt()==1) 
						bankinfo();
					break;
				case 3:
					System.out.println();
					bankprocess.withdraw();
					System.out.println();
					System.out.println();
				    System.out.println("Goto Main Page >> PRESS 1 ->");
					if (scan.nextInt()==1) 
						bankinfo();
					break;
				case 4:
					System.out.println("THANKS FOR USING BANK APPLICATION");
					break;
				}
		}
}
