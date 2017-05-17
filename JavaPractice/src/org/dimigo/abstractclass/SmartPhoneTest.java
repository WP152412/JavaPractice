 /**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	    └ SmartPhoneTest
 * 1. 개요 : 
 * 2. 작성일: 2017. 5. 15.
 * </pre>
 * @author 15기 신기섭
 * @version : 1.0
 */
public class SmartPhoneTest {
	public static void main(String[] args) {
		SmartPhone[] phone = { new IPhone("iPhone 7", "애플", 900000), new Galaxy("갤럭시 S8", "삼성", 800000) };
		System.out.println(phone[0]);
		phone[0].turnOn();
		phone[0].pay();
		phone[0].useSpecialFunction();
		phone[0].turnOff();
		System.out.println("");
		System.out.println(phone[1]);
		phone[1].turnOn();
		phone[1].pay();
		phone[1].useSpecialFunction();
		phone[1].turnOff();
	}
}
