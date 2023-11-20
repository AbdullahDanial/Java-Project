package bank_application;
import java.util.Scanner;
public class BankInfo {
	private String accno;  
    private String name;  
    private String acc_type;  
    private double balance;  
    private String pin;
    
	public void setName(String name) 
	{
		this.name = name;
	}
    public String getName() 
    {
		return name;
	}
	public void setPin(String pin)
	{
		this.pin = pin;
	}
	public String getPin() 
	{
		return pin;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public double getBalance() 
	{
		return balance;
	}
	public void setAccno(String accno)
	{
		this.accno = accno;
	}
	public String getAccno()
	{
		return accno;
	}
	public void setAcc_type(String acc_type) 
	{
		this.acc_type = acc_type;
	}
	public String getAcc_type() 
	{
		return acc_type;
	}

}
