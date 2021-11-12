package com.infoscilabs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void testAdd() {
		MathUtils mathUtils = new MathUtils();
		int expected = 10;
		int actual = mathUtils.add(5,5);
		assertEquals(expected, actual, "check the calculations !");
	}

	@Test
	void testDivide() {
		MathUtils mathUtils = new MathUtils();
		assertThrows(NullPointerException.class, () -> mathUtils.divide(5,0) ,"divide by zero should throw");
	}
	
	@Test
	void testComputeCircleArea() {
		MathUtils mathUtils = new MathUtils();
		double expected = 314.1592653589793;
		double actual = mathUtils.computeCircleArea(10);
		assertEquals(expected, actual, "should return right area");
	}

}
