package com.infoscilabs;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName(value = "When running MathUtils")
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
	
	@Nested
	@DisplayName(value = "add method")
	class AddTest {
		@Test
		@DisplayName(value = "when adding two Positive numbers")
		void testAddForPositive() {
			int expected = 10;
			int actual = mathUtils.add(5,5);
			assertEquals(expected, actual, "should return the right sum");
		}
		@Test
		@DisplayName(value = "when adding two negetive numbers")
		void testAddForNegetive() {
			int expected = -10;
			int actual = mathUtils.add(-5,-5);
			assertEquals(expected, actual, "should return the right sum");
		}
	}

	//@Test
	@RepeatedTest(3)
	@DisplayName(value = "test the DIVIDE method")
	void testDivide() {
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(5,0) ,"divide by zero should throw");
	}

	@Test
	@DisplayName(value = "test the MULTIPLY method")
	void testMultiply() {
		//assertThrows(ArithmeticException.class, () -> mathUtils.divide(5,0) ,"divide by zero should throw");
		assertAll(
		() -> assertEquals(4,  mathUtils.multiply(2,2)),
		() -> assertEquals(0,  mathUtils.multiply(2,0)),
		() -> assertEquals(-2,  mathUtils.multiply(2,-1))
		);
	}
	
	@Test
	@DisplayName(value = "test the COMPUTE CIRCLE AREA method")
	//@Disabled
	void testComputeCircleArea() {
		boolean isServerUp = true;
		assumeTrue(isServerUp);
		double expected = 314.1592653589793;
		double actual = mathUtils.computeCircleArea(10);
		assertEquals(expected, actual, () -> "should return right area "+expected +" but returned "+actual);
	}

}
