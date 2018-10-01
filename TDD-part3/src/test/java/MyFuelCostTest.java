import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyFuelCostTest {
	private MyFuelCost fuel;

	@Before
	public void setUp() throws Exception {
		fuel = new MyFuelCost();
	}

	@After
	public void tearDown() throws Exception {
		fuel = null;
	}

	@Test
	public void testSmallCar() {
		double expected = 5.8 * 100 * 2.40;
		assertEquals(expected, fuel.smallCar(5.8, 100, 2.40), 0.5);
		
	}

	@Test
	public void testSUV() {
		//need to add another 15% levy for SUV
		double expected = 10.5 * 100.5 * 2.40 * 1.15;
		
		assertEquals(expected, fuel.SUV(10.5, 100.5, 2.40, 1.15), 0.5);
		
	}
}
