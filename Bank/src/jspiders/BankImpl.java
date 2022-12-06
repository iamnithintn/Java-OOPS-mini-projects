package jspiders;

public class BankImpl implements Bank{

	int balance;

	BankImpl(int balance){
		this.balance=balance;
	}



	@Override
	public void deposit(int amt) {

		System.out.println("Depositing Rs: "+amt);
		balance+=amt;
		try {
			Thread.sleep(3000);
		}catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println("Sucessfully Deposited");

	}



	@Override
	public void withdraw(int amt) {
		if(amt<=balance) {
			System.out.println("Withdrawring Rs: "+amt);
			balance-=amt;
			try {
				Thread.sleep(3000);
			}catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println("Collect your cash please");
		}
		else {
			try {
				throw new InsufficientBalanceException("Insufficent Balance");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}


	@Override
	public int getBalance() {
		return balance;
	}


	@Override
	public String displayErrorMessage() {
		return "Invalid Choice";
	}	
}
