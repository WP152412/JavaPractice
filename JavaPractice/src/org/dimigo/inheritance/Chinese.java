/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	    └ Japanese
 * 1. 개요 :
 * 2. 작성일: 2017. 5. 8.
 * </pre>
 * @author 15기 신기섭
 * @version : 1.0
 */
public class Chinese extends Person {
	public Chinese(String name) {
		super(name);
	}
	public void sayHello() { System.out.println("니하오"); }
	public void sayBye() { System.out.println("쨔이찌엔"); }
	public String toString() { return "저는 중국사람 " +  super.getName() + "입니다."; }
}
