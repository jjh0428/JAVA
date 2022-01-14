package project.bankAccount;

public class BankDriver {

	public static void main(String[] args) {
		
		// 사람 선언
		Person pl = new Person();
		pl.name = "홍길동";
		pl.age=35;
		pl.cashAmount = 30000;
		
		System.out.println(pl.name);
		System.out.println(pl.age);
		System.out.println(pl.cashAmount);
		
		// 계좌 생성
		BankAccount al = new BankAccount();
		al.balance = 100000;
		
		// 두 객체의 관계 설정
		pl.account = al;
		al.owner = pl;

	}

}
