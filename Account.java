import java.util.*;
public class Account {
	public Account(int id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	private int id;
	private String name;
	private double balance;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getBalance() {
		return balance;
	}
	
	public void withdraw() throws Exception{
		Scanner g=new Scanner(System.in);
		synchronized(this){
			wait();
			System.out.println("Enter amount to be withdrawn");
			double d=g.nextDouble();
			g.nextLine();
			System.out.println("Withdraw Thread");
			if(d<balance){
				balance-=d;
			}
			else Thread.sleep(5000);
		}
	}
	public void deposit() throws Exception{
		Scanner g=new Scanner(System.in);
		synchronized(this){
			System.out.println("Enter amount to be deposited");
			double d=g.nextDouble();
			g.nextLine();
			System.out.println("Deposit Thread");
			balance+=d;
			notify();
			Thread.sleep(5000);
		}
	}
}
