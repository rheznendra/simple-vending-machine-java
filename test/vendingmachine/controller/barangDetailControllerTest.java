package vendingmachine.controller;

import static junit.framework.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author RZ
 */
public class barangDetailControllerTest {

	public barangDetailControllerTest() {
	}

	@BeforeClass
	public static void setUpClass() {
	}

	@AfterClass
	public static void tearDownClass() {
	}

	@Before
	public void setUp() {
	}

	@After
	public void tearDown() {
	}

	@Test
	public void testUpdateStock() {
		System.out.println("updateStock");
		int stockNew = 2;
		String kode = "B1";

		barangDetailController instance = new barangDetailController(kode);

		int expResult = 10;
		int result = instance.updateStock(stockNew);
		assertEquals(expResult, result);
	}

}
