/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	    └ Person
 * 1. 개요 :
 * 2. 작성일: 2017. 5. 8.
 * </pre>
 * @author 15기 신기섭
 * @version : 1.0
 */
public class Person {
	private String name;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void sayHello() {
		System.out.println("Hello");
	}
	public void sayBye() {
		System.out.println("Bye");
	}
	public String toString() {
		return "저는 " + name + "입니다.";
	}
}
