package com.math;

import static org.junit.Assert.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ArihmaticTest {

	int num1,num2,expected;
	
	public ArihmaticTest(int num1, int num2, int expected) {
		//super();
		System.out.println("in cons "+num1+"  "+num2);
		this.num1 = num1;
		this.num2 = num2;
		this.expected = expected;
	}
	static Arithmatic arithmatic;
	@BeforeClass
	public static void init(){
		arithmatic=new Arithmatic();
	}
	@Test
	public void testSum() {
		System.out.println("in test sum");
		//Arithmatic arithmatic=new Arithmatic();
	/*	System.out.println(num2+"nnnnnnnnnn");
		//int num2=(Integer) null;
		assertNotNull(num2);*/

		int actual=arithmatic.sum(num1, num2);
		assertEquals(expected, actual);
		//fail("Not yet implemented");
	}

@Parameters
public static Collection<Object[]> getvalues(){
	System.out.println("in collection");
	Object[][] values=new Object[][]{{1,2,3},{2,3,5}};
	return Arrays.asList(values);
}
}
