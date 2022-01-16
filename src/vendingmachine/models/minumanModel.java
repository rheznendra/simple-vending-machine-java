
package vendingmachine.models;

/**
 *
 * @author RZ
 */
public class minumanModel {
	private String kode, nama;
	private int harga, stock;

	public minumanModel(String kodeParam, String namaParam, int hargaParam, int stockParam) {
		kode = kodeParam;
		nama = namaParam;
		harga = hargaParam;
		stock = stockParam;
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

	public int getStock() {
		return stock;
	}
}
