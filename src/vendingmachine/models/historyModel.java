
package vendingmachine.models;

/**
 *
 * @author RZ
 */
public class historyModel {
	private String nama, tanggal;

	public historyModel(String nama, String tanggal) {
		this.nama = nama;
		this.tanggal = tanggal;
	}

	public String getNama() {
		return nama;
	}

	public String getTanggal() {
		return tanggal;
	}
}
