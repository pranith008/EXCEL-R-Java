package day9.ver4;

public interface Bank {
	void deposit(double depositAmount);
	void withdraw(double withdrawAmount );
	void onlineTransfer(double transferamount);
	double checkBalance();
}
