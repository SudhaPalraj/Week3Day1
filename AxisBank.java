package week3.day1;

public class AxisBank extends BankInfo {

	public void deposit() {

		System.out.println("Interest rate for AXIS BANK deposit  is 9 %");

	}

	public static void main(String[] args) {

		AxisBank bankobj = new AxisBank();

		bankobj.deposit();

		bankobj.saving();

		bankobj.fixed();

	}

}
