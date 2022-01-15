
package vendingmachine.models;

/**
 *
 * @author RZ
 */
public class minumanModel {
	private String kode;
	private int harga;

	public minumanModel(String kodeParam, int hargaParam) {
		kode = kodeParam;
		harga = hargaParam;
	}

	public String getKode() {
		return kode;
	}

	public int getHarga() {
		return harga;
	}
}
