
package vendingmachine.models;

/**
 *
 * @author RZ
 */
public class minumanModel {
	private String kode, nama;
	private int harga;

	public minumanModel(String kodeParam, String namaParam, int hargaParam) {
		kode = kodeParam;
		nama = namaParam;
		harga = hargaParam;
	}

	public String getKode() {
		return kode;
	}

	public String getNama() {
		return nama;
	}

	public int getHarga() {
		return harga;
	}
}
