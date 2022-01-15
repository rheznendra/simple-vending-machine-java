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
		kodeMinuman.add(new minumanModel("A1", 6000));
		kodeMinuman.add(new minumanModel("B1", 6000));
		kodeMinuman.add(new minumanModel("C1", 6000));

		kodeMinuman.add(new minumanModel("A2", 6000));
		kodeMinuman.add(new minumanModel("B2", 6000));
		kodeMinuman.add(new minumanModel("C2", 6000));

		kodeMinuman.add(new minumanModel("A3", 7000));
		kodeMinuman.add(new minumanModel("B3", 7000));
		kodeMinuman.add(new minumanModel("C3", 7000));

		kodeMinuman.add(new minumanModel("A4", 8000));
		kodeMinuman.add(new minumanModel("B4", 8000));
		kodeMinuman.add(new minumanModel("C4", 8000));

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
