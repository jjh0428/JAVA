package com.java.bankAccount;

public class BankAccount {

	private int balance;
	private Person setOwner;
	
	public void setBalance(int newBalance) {
		balance  = newBalance;
	}
	public int getValance() {
		return balance;
	}
	
	public void setOwner(Person newOwner) {
		setOwner = newOwner;
	}
	public Person getOwner() {
		return setOwner;
	}
	
	public boolean deposit(int amount) {
		if(amount < 0 || setOwner.getCashAmount() < amount) {
			System.out.println("입금 실패입니다. 잔고: "+balance+"원, 현금: "+setOwner.getCashAmount());
			return false;
		}
		balance += amount;
//		owner.cashAmount -= amount;
//		owner.cashAmount = owner.cashAmount - amount;
		setOwner.setCashAmount(setOwner.getCashAmount() - amount);
		
		System.out.println(amount+"원 입금하였습니다. 잔고: "+balance+"원, 현금: "+setOwner.getCashAmount());
		return true;
	}
	
	public boolean withdraw(int amount) {
		if(amount < 0 || balance < amount) {
			System.out.println("출금 실패입니다. 잔고: "+balance+"원, 현금: "+setOwner.getCashAmount());
			return false;
		}
		balance -= amount;
//		owner.cashAmount += amount;
		setOwner.setCashAmount(setOwner.getCashAmount() + amount);
		
		System.out.println(amount+"원 출금하였습니다. 잔고: "+balance+"원, 현금: "+setOwner.getCashAmount());
		return true;
	}
	
	public boolean transfer(Person to, int amount) {
		
		return true;
	}
}
