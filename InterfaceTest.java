package BankInterest;



class Bank{
	public double totalAmount;
	public Bank(double amt) {
		totalAmount=amt;
	}
}

public class InterfaceTest extends Bank implements BankFunction{

	public InterfaceTest(double amt) {
		super(amt);
		// TODO Auto-generated constructor stub
	}
	public void increment(double amt) {
		// TODO Auto-generated method stub
		super.totalAmount+=amt;
		System.out.println("Your increment amount is "+amt+"\n Your amount is "+super.totalAmount);
	}
	public void decrement(double amt) {
		// TODO Auto-generated method stub
		super.totalAmount-=amt;
		System.out.println("Your decrement amount is "+amt+"\n Your amount is "+super.totalAmount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank(100);
		InterfaceTest i=new InterfaceTest(200);
		i.increment(300);
		i.decrement(100);
		
	}
}

