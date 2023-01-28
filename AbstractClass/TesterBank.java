package AbstractClass;

public class TesterBank {

	public static void main(String[] args) {
		Bank bankA = new BankA();
		System.out.println("Bank A balance: " + bankA.getBalance());

		Bank bankB = new BankB();
		System.out.println("Bank B balance: " + bankB.getBalance());

		Bank bankC = new BankC();
		System.out.println("Bank C balance: " + bankC.getBalance());
	}

}
