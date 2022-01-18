
package vendingmachine.models;

/**
 *
 * @author RZ
 */
public class minumanModel {
	private String kode, nama, slug;
	private int harga, stock;

	public minumanModel(String kode, String nama, String slug, int harga, int stock) {
		this.kode = kode;
		this.nama = nama;
		this.slug = slug;
		this.harga = harga;
		this.stock = stock;
	}

	public String getKode() {
		return kode;
	}

	public String getNama() {
		return nama;
	}

	public String getSlug() {
		return slug;
	}

	public int getHarga() {
		return harga;
	}

	public int getStock() {
		return stock;
	}
}
