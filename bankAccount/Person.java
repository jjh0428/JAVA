package com.java.bankAccount;

public class Person {

	private String name;
	private int age;
	private int cashAmount;
	private BankAccount account;
	
	public void setName(String newName) {
		name = newName;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int newAge) {
		age = newAge;
	}
	public int getAge() {
		return age;
	}
	
	public int getCashAmount() {
		return cashAmount;
	}
	public void setCashAmount(int newCashAmount) {
		cashAmount = newCashAmount;
	}
	
	public BankAccount getAccount() {
		return account;
	}
	public void setAccount(BankAccount newAccount) {
		account = newAccount;
	}
	
	public boolean transfer(Person to, int amount) {
		if(amount < 0 || account.getBalance() < amount) {
			System.out.println("false - from: "+getName()+", to: "+to.getName()+", amount: "+amount+", balance: "+account.getBalance());
			return false;
		}
		account.setBalance(account.getBalance() - amount);
		to.getAccount().setBalance(to.getAccount().getBalance() + amount);
		System.out.println("true - from: "+getName()+", to: "+to.getName()+", amount: "+amount+", balance: "+account.getBalance());
		return true;
	}
	
	public boolean transfer(BankAccount to, int amount) {
		return transfer(to.getOwner(), amount);
	}
	
}
