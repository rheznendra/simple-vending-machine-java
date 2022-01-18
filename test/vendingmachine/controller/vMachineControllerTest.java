package vendingmachine.controller;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author RZ
 */
public class vMachineControllerTest {

	@Test
	public void testSelectItem() {
		int saldo = 20000; //set saldo awal

		vMachineController instance = new vMachineController();
		instance.setSaldo(saldo);
		instance.model.setKode("A1"); //set kode minuman yang dipilih

		instance.selectItem();

		int expResult = 14000;
		assertEquals(expResult, instance.model.getSaldo());
	}

}
