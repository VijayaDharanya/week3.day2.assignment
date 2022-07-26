//Class     :BankInfo
//Methods :saving(),fixed(),deposit()

//Class     :AxisBank
//Methods :deposit()

//Description:
//You have to override the method deposit in AxisBank.
package week3.day2;

public class AxsBank {
	public void deposit() {
		System.out.println("deposit is 4%");
	}

	public static void main(String[] args) {

		AxsBank percent = new AxsBank();
		percent.deposit();
	}

}
