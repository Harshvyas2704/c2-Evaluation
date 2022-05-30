package com.masai1;

public class Demo extends Demo2{
	
	void test2() {
		
		System.out.println("inside test2");
		
	}
	
	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		d1.test();
		d1.test2();
		
	}
}

/* Is- A relationship and Has- A relationship
 
 Is- A relationship is based on inheritance where Has- A relationship based on object
 
 as in example
 there are 2 classes Demo and Demo2. I define a method as test in Demo2 and I want to use 
 it in Demo class. To achieve this I extends a class Demo2 to Demo. by doing this I can 
 use test method in Demo class.
 this is called Is- A relationship
 
 Has- A relationship is based on object when we create object of any particular class 
 to use non static method or variable inside main method, we create object 
 that creating a object is called as Has- A relationship.
 
*/



/* What is Access Modifier
	we can control scope of usage of variable, method or class with help of Access Modifier
 */
// Types of Access modifiers 
/* there are 4 type of access modifier in java
1) Public
2) Private
3) Default
4) 

1) Public -> when we define any variable, class or method inside a class or package with 
	public modifier then we can use it at any place (if static then we can use it directly 
	and if non static we can use it with help of object). 
2) Private -> when we define any variable, class or method inside class or package with private
	Modifier  then we can not access it out side of brackets. but If we want to use it anyway then
	there are methods of getter and setter came to rescue. with help of that we can use this 
	variables, class or method at any place.
3) Default ->  when we do not define Access modifier then compiler will consider Access modifier as 
	default.
4) Protected -> when we define any variable, class or any method with protected modifier then, 
	we can use only inside a same package and it's child class if we extends it. If not then we can
	not use that particular.
	

*/