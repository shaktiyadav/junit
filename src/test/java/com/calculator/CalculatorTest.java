package com.calculator;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
@RunWith(JUnitPlatform.class)	
public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test
    public static void testCalcOne() throws Exception
    {
        System.out.println("======TEST ONE EXECUTED=======");
        Assertions.assertEquals( 3 , Calculator.sum(2, 2));
    }
     
   /* @Disabled
    @Test
    void testCalcTwo()
    {
        System.out.println("======TEST TWO EXECUTED=======");
        Assertions.assertEquals( 6 , Calculator.sum(2, 4));
    }*/

}
