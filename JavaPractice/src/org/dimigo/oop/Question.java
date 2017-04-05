/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 * 	    └ Question
 * 1. 개요 :
 * 2. 작성일: 2017. 3. 31.
 * </pre>
 * @author 15기 신기섭
 * @vesion : 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String quest[] = {"가장 좋아하는 가수는?", "가장 좋아하는 배우는?", "가장 좋아하는 과목은?"};
		String answer[] = { "빅뱅", "조인성", "응용 프로그래밍" };
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			System.out.println(quest[i]);
			System.out.println(((answer[i].equals(scanner.nextLine()))?"정답입":"틀렸습")+"니다!");
		}
		scanner.close();
		System.out.println("<< 결과 출력 >>");
		for(int i=0; i<3; i++) {
			StringBuilder str = new StringBuilder();
			System.out.println(str.append(quest[i]).append(' ').append(answer[i]));
		}
	}
}
