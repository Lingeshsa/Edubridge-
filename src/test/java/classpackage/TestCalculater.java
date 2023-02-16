package classpackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCalculater {
	
	static Calculater calculater=null;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		calculater = new Calculater();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		assertEquals(1000,calculater.add(500, 500));
			
		
	}
	@Test
	void testGreater() {
		assertTrue(calculater.checkGreater(100,20));
			
		
	}

}
