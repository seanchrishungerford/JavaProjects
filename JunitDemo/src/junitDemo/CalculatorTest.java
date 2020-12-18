package junitDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@BeforeEach
	public void callbefore() {
		System.out.println("called before");
	}
	@AfterEach
	public void callAfter() {
		System.out.println("called After");
	}
	
	@Test
	void testAdd() {
		assertEquals(20, new Calculator().add(10, 10));
	}
	
	@Test
	void testMult() {
		assertEquals(20, new Calculator().multiply(10, 10));
	}

}
