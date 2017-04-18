/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	    └ PiggyBankTest
 * 1. 개요 :
 * 2. 작성일: 2017. 4. 18.
 * </pre>
 * @author 15기 신기섭
 * @version : 1.0
 */
public class PiggyBankTest {
	public static void main(String[] args) {
		FamilyMember[] member = new FamilyMember[4];
		String memberName[] = { "아빠", "엄마", "나", "남동생" };
		for(int i=0; i<4; i++) member[i] = new FamilyMember(memberName[i]);
		FamilyMember.printMemberCnt();
		PiggyBank.putMoney(member[0], 10000);
		PiggyBank.putMoney(member[1], 5000);
		PiggyBank.putMoney(member[2], 2000);
		PiggyBank.putMoney(member[3], 1000);
		PiggyBank.printBalance();
		PiggyBank.putMoney(member[2], 1000);
		PiggyBank.printBalance();
	}

}
