package bank_application;
import java.util.Scanner;
public class Process {
	Scanner sc = new Scanner(System.in);  
	  static BankInfo bank1 = new BankInfo();
       static String saving="saving",current="current";
       static double deposite;
        static String digit,newpin;
    	public static void login(int choice) {

    		Scanner scan = new Scanner(System.in);
    		Process bankprocess = new Process();
    		 switch (choice) 
    		 {
    			case 1:
    				System.out.print("Enter Pin : ");
    				newpin=scan.next();
    				newlogin(newpin);
    				break;
    			case 2:
    			    System.out.print("    [CREATE ACCOUNT]    ");
    			    System.out.println();
    				openAccount();
    			    System.out.println("Goto Login Page >> PRESS t ->");
    				while(scan.next().charAt(0)!='t') {
    					System.out.println("INVALID KEY!");
    				}
    				Operation z2 = new Operation();
    				z2.logininfo();
    				break;		
    		 }
    		
    	}
	    public static void openAccount()
	    {
	    	Scanner sc = new Scanner(System.in); 
	    	System.out.println(); 
	        System.out.print("Enter Account No: ");  
	        bank1.setAccno(sc.next());
	        System.out.print("Set Pin (4-16 digits required): ");
	        
	        long k=10000000;
	       while(k>0) {
	        digit=sc.next();
	        if(digit.length()>=4 && digit.length()<=16) {
	        break;
	        }
	        else {
	        System.out.print("INVALID PIN! TRY AGAIN: ");
	        }
	       } 

	        bank1.setPin(digit);
	        System.out.print("Enter Account type: ");  
	        bank1.setAcc_type(sc.next());
	        System.out.print("Enter Name: ");  
	        bank1.setName(sc.next());
            System.out.println("ACCOUNT CREATED SUCCESSFULLY \u2713");  
            System.out.println(); 
	  
	    }
	    public static void newlogin(String x) {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println(); 
			if(x.equals(bank1.getPin())){
				Operation z = new Operation();
				z.bankinfo();
			}else { 
				System.out.println("PIN NOT MATCHED [x]");
				System.out.println("Press t To Try Again :");
					while(sc.next().charAt(0)!='t') {
						System.out.println("Entered Wrong Key! ");
					}
					Operation y=new Operation();
					y.logininfo();
			}
	    }
		public static void checkbalance() 
		{
			System.out.println("Your name is           : " + bank1.getName());
	        System.out.println("Account no             : " + bank1.getAccno());  
	        System.out.println("Account type           : " + bank1.getAcc_type());  
		    System.out.println("Balance                : " + bank1.getBalance());  
			System.out.println("THANKS FOR BALANCE CHECKING ");
			
		}
	    public static void deposite()
	    {
	    	Operation z3 = new Operation();
	    	System.out.println(); 
	    	Scanner sc = new Scanner(System.in); 
	    	System.out.println("Enter the Amount you want to deposite : ");
		    deposite =sc.nextDouble();
			
			if(deposite<500)
			{
			System.out.println("[You Have To Deposite At Least BDT 500.00] ");
			System.out.println(); 
		    System.out.println("Goto Main Page >> PRESS 1 ->");
			if (sc.nextInt()==1) 
				z3.bankinfo();
			}
			else {
				
			double amount =(double) ((bank1.getBalance())+deposite);
			bank1.setBalance(amount);
			System.out.println("BDT "+ deposite+" is deposited into your Account \u2713");
			System.out.println("Current Available Balance is BDT "+ bank1.getBalance());
	    }
		
			
	    }
	    public static void withdraw() 
	    {
	    	Scanner sc = new Scanner(System.in); 
	    	System.out.println("Enter the Amount you want to withdraw:");
			long withdraw =sc.nextInt();
			if(withdraw<=bank1.getBalance())
			{
				long new_amount=(long)((bank1.getBalance())-withdraw);
				bank1.setBalance(new_amount);
				System.out.println(" "+ withdraw+" is withdrawn from your Account");
				System.out.println("Current Available Balance is BDT "+ bank1.getBalance());
			}
			else
			{
				System.out.println("Low Balance");
				System.out.println("Current Available Balance is BDT "+ bank1.getBalance());
			}
	    }

}
