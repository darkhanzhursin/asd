package application;

import framework.Before;
import framework.Test;
import framework.TestClass;

@TestClass
public class MyTest2 {
	
	@Before
	public void init() {
		System.out.println("perform initialization T2");
	}
	
	@Test
	public void testMethod1() {
		System.out.println("perform test method 1 T2");
	}

	@Test
	public void testMethod2() {
		System.out.println("perform test method 2 T2");
	}

	@Test
	public void testMethod3() {
		System.out.println("perform test method 3 T2");
	}
}
