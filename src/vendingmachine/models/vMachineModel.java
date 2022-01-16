package vendingmachine.models;

import java.util.ArrayList;

/**
 *
 * @author RZ
 */
public class vMachineModel {

	private final ArrayList<minumanModel> kodeMinuman;
	private int saldo;
	private String kode;

	public vMachineModel() {
		kodeMinuman = new ArrayList();
		kodeMinuman.add(new minumanModel("A1", "coca-cola", 6000));
		kodeMinuman.add(new minumanModel("B1", "coca-cola-zero", 6000));
		kodeMinuman.add(new minumanModel("C1", "sprite", 6000));

		kodeMinuman.add(new minumanModel("A2", "sprite-light", 6000));
		kodeMinuman.add(new minumanModel("B2", "fanta-strawberry", 6000));
		kodeMinuman.add(new minumanModel("C2", "fanta-orange", 6000));

		kodeMinuman.add(new minumanModel("A3", "pocari-sweat", 7000));
		kodeMinuman.add(new minumanModel("B3", "cap-panda", 7000));
		kodeMinuman.add(new minumanModel("C3", "green-sands", 7000));

		kodeMinuman.add(new minumanModel("A4", "nescafe-original", 8000));
		kodeMinuman.add(new minumanModel("B4", "nescafe-latte", 8000));
		kodeMinuman.add(new minumanModel("C4", "nescafe-mocha", 8000));

		saldo = 0;
		kode = "";
	}

	public String getKode() {
		return kode;
	}

	public void setKode(String kode) {
		this.kode = kode;
	}

	public ArrayList<minumanModel> getKodeMinuman() {
		return kodeMinuman;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo += saldo;
	}
}
