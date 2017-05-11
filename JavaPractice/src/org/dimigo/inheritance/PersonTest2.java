/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	    └ PersonTest
 * 1. 개요 :
 * 2. 작성일: 2017. 5. 8.
 * </pre>
 * @author 15기 신기섭
 * @version : 1.0
 */
public class PersonTest2 {
	public static void main(String[] args) {
		Person []people = { new Person("Tom"), new Korean("홍길동"),
				new Japanese("다나카"), new Chinese("왕밍") };
		for(Person person : people) greeting(person);
	}
	private static void greeting(Person person) {
		System.out.println(person);
		person.sayHello();
		person.sayBye();
		System.out.println();
	}
	
}
