package vendingmachine.controller;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author RZ
 */
public class barangDetailControllerTest {

	@Test
	public void testUpdateStock() {
		int stockNew = 2;
		String kode = "A1";

		barangDetailController instance = new barangDetailController(kode);

		int expResult = 9;
		int result = instance.updateStock(stockNew);
		assertEquals(expResult, result);
	}

}
