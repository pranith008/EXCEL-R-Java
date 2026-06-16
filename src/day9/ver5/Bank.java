package day9.ver5;

public interface Bank {
	void deposit(double depositAmount) throws InvalidAmountException;
	void withdraw(double withdrawAmount ) throws InvalidAmountException,InSufficientFundsException;
	void onlineTransfer(double transferamount) throws InvalidAmountException,InSufficientFundsException;
	double checkBalance();
}
