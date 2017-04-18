/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	    └ FamilyMember
 * 1. 개요 :
 * 2. 작성일: 2017. 4. 18.
 * </pre>
 * @author 15기 신기섭
 * @version : 1.0
 */
public class FamilyMember {
	private static int memberCnt = 0;
	private String memberName;
	public FamilyMember(String memberName) { ++FamilyMember.memberCnt; this.memberName = memberName; }
	public String getMemberName() { return memberName; }
	public static void printMemberCnt() { System.out.println("가족 총 인원 수 : " + memberCnt + "명"); };
}
