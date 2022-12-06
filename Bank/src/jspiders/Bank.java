package jspiders;

public interface Bank {

	void deposit(int amt);
	void withdraw(int amt);
	int getBalance();
	String displayErrorMessage();
	
	
//	The functions declared within interface type is by default public and abstract and this is present implicitly

}
