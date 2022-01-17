package com.java.bankAccount;

public class BankDriver {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setName("홍길동");
		p1.setAge(25);
		p1.setCashAmount(30000);
		
//		System.out.println(p1.getName);
//		System.out.println(p1.getAge);
//		System.out.println(p1.CashAmount);
		
		BankAccount a1 = new BankAccount();
		a1.setBalance(100000);
		
		p1.setAccount(a1);
		a1.setOwner(p1);
		
		// 테스트
		//System.out.println(p1.getName+"의 계좌 잔액: "+p1.getAccount.balance);
//		BankDriver 클래스에 아래 인스턴스를 생성
//		p2(Person) 생성
//		p2에는 장발장, 23, 100000, a2를 할당
//		a2(BankAccount) 생성
//		a2에는 500000, p2
//		
//		p2의 계좌인 a2에 다음을 차례로 실행
//		1. 30,000원 입금
//		2. 170,000원 출금
//		3. 620.000원 입금
//		4. 890,000원 출금
		
		Person p2 = new Person();
		p2.setName("장발장");
		p2.setAge(23);
		p2.setCashAmount(100000);
		
		BankAccount a2 = new BankAccount();
		a2.setBalance(500000);
		
		p2.setAccount(a2);
		a2.setOwner(p2);
		
		System.out.println(a2.deposit(30000));
		System.out.println(a2.withdraw(170000));
		System.out.println(a2.deposit(620000));
		System.out.println(a2.withdraw(890000));

	}

}
