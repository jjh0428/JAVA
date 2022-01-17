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
	
	
}
