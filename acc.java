class Account{
    int balance;
	void bal(int balance)
	{
		this.balance=balance;
		System.out.println(balance);
	}
	public  boolean check(int w){
		
		if(balance>w)
			return true;
		else
			return false;
		
	}
		public  void  withdrawal(int w,boolean status){
			
			if(status==true){
			balance = (balance-w);
				System.out.println("successful...");
				System.out.println("your balance is"+" "+balance);
			}
			else
			{System.out.println("insufficient balance");}
			
		}
}
	class Customer implements Runnable{
		Account acc;
	
   	
		public void run(){
			 synchronized(acc){
			 	acc = new Account();
				java.util.Scanner s=new java.util.Scanner(System.in);
				System.out.println("enter withdrawal amount=");
				int w = s.nextInt();
				boolean status=acc.check(w);
				acc.withdrawal(w,status);
		}}
	}
	class Main{
		public static void main(String args[]){
			Customer mohit=new Customer();
			Customer aman= new Customer();
		    Account ac= new Account();
             ac.bal(1000);
			 
			Thread t1=new Thread(aman);
			Thread t2=new Thread(mohit);
			t1.start();
			t2.start();
	}}