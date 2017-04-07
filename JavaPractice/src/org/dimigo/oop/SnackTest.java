/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	    └ SnackTest
 * 1. 개요 :
 * 2. 작성일: 2017. 4. 7.
 * </pre>
 * @author 15기 신기섭
 * @vesion : 1.0
 */
public class SnackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Snack[] snack = new Snack[3];
		snack[0] = new Snack("새우깡", "농심", 1100, 2);
		snack[1] = new Snack("콘칲", "크라운", 1200, 1);
		snack[2] = new Snack("허니버터칩", "해태", 1500, 4);
		for(int i=0; i < 3; i++) System.out.println(snack[i].toString());
		System.out.println("총 구매 금액 : "+ String.format("%,d", ( snack[1].calcPrice() + snack[2].calcPrice() + snack[0].calcPrice())) + "원");
	}
}
