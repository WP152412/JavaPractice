/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 * 	    └ Operator
 * 1. 개요 :
 * 2. 작성일: 2017. 3. 14.
 * </pre>
 * @author 15기 신기섭
 * @vesion : 1.0
 */
public class Operator {
	public static void main(String[] args) {
		int pg = 1700000;
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d", pg) + "원");
		System.out.println("점포 내 직원 수 : 3명");
		System.out.println("점포 수 : " + String.format("%,d", 1500)+"개" );
		System.out.println("");
		System.out.println("연간 인건비 " + String.format("%,d", (long)pg*12*1500*3) + "원");
	}
}
