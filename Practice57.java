import java.util.Random;
import java.util.Scanner;
class BankAccount{
	private String name, accoutNo;
	private int balance;
	private double interest;
	@Override
	public String toString() {
		return accoutNo +" :: " + name + " :: " + balance + "원 :: " + interest + "%";
	}
	private int calcInterest(){
		return (int) (balance * (interest*0.01));
	}
	public BankAccount() {
		this.name = "김동덕";
		this.balance = 100;
		this.interest = 3.1;
		this.accoutNo = makeID();
	}
	public BankAccount(String name, int balance) {
		this.name = name;
		this.balance = balance;
		this.interest = 2.15;
		this.accoutNo = makeID();
	}
	public BankAccount(String name, int balance, double interest) {
		this.name = name;
		this.balance = balance;
		this.interest = interest;
		this.accoutNo = makeID();
	}
	private String makeID() {
		Random rand = new Random();
		int n1 = rand.nextInt(9000) + 1000;
		int n2 = rand.nextInt(9000) + 1000;
		return this.accoutNo =  n1 + "-" +n2;}
	
	public String getAccoutNo() {return accoutNo;}
	
	public boolean deposit(int money) {
		if(money>=0)
			{
			balance += money;
			return true;
			}
		else
			return false;
	}
	public boolean withdraw(int money) {
		if(balance > money)
		{
			balance -= money;
			return true;
			}
		else return false;
	}
	public static boolean transfer(BankAccount from, BankAccount to, int money) {
		if(to.deposit(money) == true && from.withdraw(money)==true) {
			return true;
		}
		else
			return false;
	}
}
public class Practice57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		BankAccount b1 = new BankAccount();
		BankAccount b2 = new BankAccount("홍길동", 2000);
		BankAccount b3 = new BankAccount("성춘향", 500, 2.05);

		
		System.out.println("은행 계좌 모두의 정보입니다.");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		System.out.printf("\n계좌 %s에 입금할 금액을 입력하세요: ", b1.getAccoutNo());
		int amount = input.nextInt();
		if(b1.deposit(amount) == true)
			System.out.println("입금이 성공했습니다.");
		else
			System.out.println("입금이 실패했습니다.");
		
		System.out.println("\n은행 계좌 모두의 정보입니다.");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		System.out.printf("\n계좌 %s에서 출금할 금액을 입력하세요: ", b2.getAccoutNo());
		amount = input.nextInt();
		if(b2.withdraw(amount) == true)
			System.out.println("출금이 성공했습니다.");
		else
			System.out.println("출금이 실패했습니다.");
		
		System.out.println("\n은행 계좌 모두의 정보입니다.");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		System.out.printf("\n계좌 %s에서 계좌 %s으로 송금할 금액을 입력하세요: ", b2.getAccoutNo(), b3.getAccoutNo());
		amount = input.nextInt();
		if(BankAccount.transfer(b2, b3, amount)== true)
			System.out.println("송금이 성공했습니다.");
		else
			System.out.println("송금이 실패했습니다.");
		
		System.out.println("\n은행 계좌 모두의 정보입니다.");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}

}