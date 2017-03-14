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

/**
 * 
 *//*
package org.dimigo.basic;*/

/**
 * <pre>
 * org.dimigo.basic
 * 	    └ Operator
 * 1. 개요 :
 * 2. 작성일: 2017. 3. 10.
 * </pre>
 * @author 15기 신기섭
 * @vesion : 1.0
 *//*
public class Operator {
	public static void main(String[] args) {
		// 1. 산술연산자
		int a = 5, b = 2;
//		System.out.println(a + b);
//		System.out.println(a - b);
//		System.out.println(a * b);
//		System.out.println(a / b);
//		System.out.pArintln(a / b);
//		System.out.println(a % b);
		
		// 2.  다른 타입간의 연산(큰 타입으로 자동 변환)
		int i = 0; double d = 3.14;
		int r1 = (int) ( i + d );
		System.out.println(i + d);
		
		
		// int보다 작은 타입간의 연산 ( int 타입으로 자동 변환 )
		short s1 = 1, s2 = 2;
		short r2 = (short)(s1 + s2);
		
		// 3. short-Circuit test
		boolean flag = true;
		a = 10; b = 0;
		if( flag || (a / b == 0)) System.out.println("OR 연산");
		
		int x = 10;
		
		// 4. 문자열 연결 연산자
		String school = "디미고";
		int grade = 2, ban = 4;
		String name = "나자바";
		System.out.println(school + grade + ban + name);
		System.out.println("" + grade + ban + school + name);
	}
}*/
