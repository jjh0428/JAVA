package com.java.bankAccount;

public class BankAccount {

	private int balance;
	private Person owner;
	
	public void setBalance(int newBalance) {
		balance  = newBalance;
	}
	public int getBalance() {
		return balance;
	}
	
	public void setOwner(Person newOwner) {
		owner = newOwner;
	}
	public Person getOwner() {
		return owner;
	}
	
	public boolean deposit(int amount) {
		if(amount < 0 || owner.getCashAmount() < amount) {
			System.out.println("입금 실패입니다. 잔고: "+balance+"원, 현금: "+owner.getCashAmount());
			return false;
		}
		balance += amount;
//		owner.cashAmount -= amount;
//		owner.cashAmount = owner.cashAmount - amount;
		owner.setCashAmount(owner.getCashAmount() - amount);
		
		System.out.println(amount+"원 입금하였습니다. 잔고: "+balance+"원, 현금: "+owner.getCashAmount());
		return true;
	}
	
	public boolean deposit(double amount, double exchangeRate) {
		return deposit((int)(amount*exchangeRate));
	}
	
	public boolean withdraw(int amount) {
		if(amount < 0 || balance < amount) {
			System.out.println("출금 실패입니다. 잔고: "+balance+"원, 현금: "+owner.getCashAmount());
			return false;
		}
		balance -= amount;
//		owner.cashAmount += amount;
		owner.setCashAmount(owner.getCashAmount() + amount);
		
		System.out.println(amount+"원 출금하였습니다. 잔고: "+balance+"원, 현금: "+owner.getCashAmount());
		return true;
	}
	
//	1. 송금 성공시 true 리턴, 실패시 false 리턴
//	2. 송금하고자 하는 금액(amount)이 음수일 때 송금 실패
//	3. amount가 잔고(balance)보다 클 때 송금 실패
//	4. 나의 balance를 amount만큼 줄이고, 받는 사람(to)의 balance를 amount만큼 늘림
//	5. 송금 성공시
//		true - from: [송금자 이름], to: [수신자 이름], amount: [송금액], balance: [송금자 잔고]
//	6. 송금 실패시
//		false - from: [송금자 이름], to: [수신자 이름], amount: [송금액], balance: [송금자 잔고]
	
	public boolean transfer(Person to, int amount) {
		if(amount < 0 || balance < amount) {
			System.out.println("false - from: "+owner.getName()+", to: "+to.getName()+", amount: "+amount+", balance: "+balance);
			return false;
		}
		balance -= amount;
		to.getAccount().balance += amount;
		System.out.println("true - from: "+owner.getName()+", to: "+to.getName()+", amount: "+amount+", balance: "+balance);
		return true;
	}
	
	public boolean transfer(BankAccount to, int amount) {
		return transfer(to.owner, amount);
	}
}
