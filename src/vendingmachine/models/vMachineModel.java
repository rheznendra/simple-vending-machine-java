package vendingmachine.models;

import java.util.ArrayList;

/**
 *
 * @author RZ
 */
public class vMachineModel {

	private ArrayList<minumanModel> kodeMinuman;
	private int saldo;
	private String kode;

	public vMachineModel() {
		kodeMinuman = new ArrayList();
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

	public void setKodeMinuman(ArrayList<minumanModel> kodeMinuman) {
		this.kodeMinuman = kodeMinuman;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo += saldo;
	}
}
