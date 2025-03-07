package Day13.homework.inheritance실습.level02;

public abstract class Account {
	private String accId;
	private long balance;
	private String ownerName;
	public Account(){
		
	}
	public Account(String accId, long balance, String ownerName){
		this.accId = accId;
		this.balance = balance;
		this.ownerName = ownerName;
	}
	public abstract void calcRate();
	public void deposit(long money){
		this.balance = this.balance + money;
		
	}
	public void withdraw(long money){
		this.balance = this.balance - money;
	}
	public long getBalance(){
		return this.balance;
	}
	public String getAccId() {return accId;}
	public String getOwnerName() {return ownerName;}
	public void setAccId(String accId) {this.accId = accId;}
	public void setOwnerName(String ownerName) {this.ownerName = ownerName;}
	public void setBalance(long balance) {this.balance = balance;}

}
