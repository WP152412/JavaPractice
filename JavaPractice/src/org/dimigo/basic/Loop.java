/**
 * 
 */
package org.dimigo.basic;
import java.util.Scanner;
import java.util.Random;
/**
 * <pre>
 * org.dimigo.basic
 * 	    └ Loop
 * 1. 개요 :
 * 2. 작성일: 2017. 3. 16.
 * </pre>
 * @author 15기 신기섭
 * @vesion : 1.0
 */
public class Loop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int atk = 100; boolean running = true;
		while(running) {
			System.out.println("--------------------");
			System.out.println("<< 게임 메뉴 >> ");
			System.out.println("1. 공격력 증가");
			System.out.println("2. 공격력 감소");
			System.out.println("3. 캐릭터 설정");
			System.out.println("9. 종료");
			System.out.println("--------------------");
			System.out.println("메뉴 입력 => ");
			
			int choice = scanner.nextInt();
			switch(choice) {
			case 1: atk += 10; System.out.println("공격력이 증가되었습니다. 현재 공격력 : " + atk); break;
			case 2: atk -= 10; System.out.println("공격력이 감소되었습니다. 현재 공격력 : " + atk); break;
			case 3:
				String str[] = {"마법사", "영주", "기사", "농민"};
				int num = new Random().nextInt(4);
				System.out.println(str[num]+"(으)로 설정되었습니다."); break;
			case 9: System.out.println("이제 공부하세요!"); running = false; break;
			default: System.out.println("없는 메뉴입니다!");
			}
			
		}
		scanner.close();
	}
	
}
