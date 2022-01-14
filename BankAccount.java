package project.bankAccount;

public class BankAccount {

	int balance;
	Person owner;
	
	// 파라미터: 입금할 액수(정수)
	// 리턴: 성공여부(불린)
	
//	입금
//	1. 입금을 성공하면 true, 실패하면 false 리턴
//	2. 입금 성공시, 현재 잔고(balance)에 파라미터로 받은 금액(account)를 더함
//	3. 입금 성공시, 계좌주의 현금액(cashAcout)를 입금액만큼 줄임
//	4. 입금할 금액이 음수이면 입금 실패(0원은 성공으로 침)
//	5. 계좌주의 현금이 입금액보다 작을 경우 입금 실패
//	6. 입금 실패시 "입금 실패입니다. 잔고: xx원, 현금: xx원"
//	7. 입금 성공시 "xx원 입금하였습니다. 잔고: xx원, 현금: xx원"
	
	boolean deposit(int amount) {
		if(amount < 0 || owner.cashAmount < amount) {
			System.out.println("입금 실패입니다. 잔고: "+balance+"원, 현금: "+owner.cashAmount);
			return false;
		}
		balance += amount;
		owner.cashAmount -= amount;
		
		System.out.println(amount+"원 입금하였습니다. 잔고: "+balance+"원, 현금: "+owner.cashAmount);
		return true;
	}
	
	// 파라미터: 출금할 액수(정수)
	// 리턴: 성공여부(불린)
//	boolean withdraw(int amount) {
//		
//	}
	
	// 첫 번째 파라미터: 받는 사람(Person)
	// 두 번쨰 파라미터: 이체할 금액(정수)
	// 리턴: 성공여부(불린)
//	boolean transfer(Person to, int amount) {
//		
//	}
}
