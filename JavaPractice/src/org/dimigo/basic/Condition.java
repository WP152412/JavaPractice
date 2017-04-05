/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;

/**
 * <pre>
 * org.dimigo.basic
 * 	    └ Condition
 * 1. 개요 :
 * 2. 작성일: 2017. 3. 14.
 * </pre>
 * @author 15기 신기섭
 * @vesion : 1.0
 */
public class Condition {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 17;
		if( age >= 19 ) System.out.println("투표하러 가세요");
		else System.out.println("선거권이 없네요");
		System.out.println(new Random().nextInt(6)+1);
	}

}
