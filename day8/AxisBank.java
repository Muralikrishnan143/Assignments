package Interface;

public class AxisBank extends BankInfo {

	public void deposit() {
		
		System.out.println("deposit");
		
	}
	
	public static void main(String[] args) {
		
		AxisBank account=new AxisBank();
		account.savings();
		account.fixed();
		account.deposit();
		
	}

}
