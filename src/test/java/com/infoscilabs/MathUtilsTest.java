package com.infoscilabs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class MathUtilsTest {

	MathUtils mathUtils;

	@BeforeAll
	void beforeAll() {
		System.out.println("beforeAll............. ");
	}
	
	@BeforeEach
	void beforeEach() {
		mathUtils = new MathUtils();
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("AfterEach............. ");
	}

	@AfterAll
	void afterAll() {
		System.out.println("afterAll............. ");
	}
	
	@Test
	void testAdd() {
		int expected = 10;
		int actual = mathUtils.add(5,5);
		assertEquals(expected, actual, "check the calculations !");
	}

	@Test
	void testDivide() {
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(5,0) ,"divide by zero should throw");
	}
	
	@Test
	void testComputeCircleArea() {
		double expected = 314.1592653589793;
		double actual = mathUtils.computeCircleArea(10);
		assertEquals(expected, actual, "should return right area");
	}

}
