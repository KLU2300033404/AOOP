package Login;

public class Main {

	public static void main(String[] args) {
		BankingProcess2 bankingProcess = new BankingProcess2();
 bankingProcess.viewBalance();
 bankingProcess.deposit(200);
 bankingProcess.withdraw(150);
 UserLoginManager2.getInstance().login("Pinky", "password123");
 bankingProcess.viewBalance();
 bankingProcess.deposit(200);
 bankingProcess.withdraw(150);
 UserLoginManager2.getInstance().logout();
 bankingProcess.viewBalance();
				
	}

}
