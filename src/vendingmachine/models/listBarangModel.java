
package vendingmachine.models;

import java.util.ArrayList;

/**
 *
 * @author RZ
 */
public class listBarangModel {
	private ArrayList<minumanModel> listBarang;

	public listBarangModel(ArrayList<minumanModel> listBarang) {
		this.listBarang = listBarang;
	}

	public ArrayList<minumanModel> getListBarang() {
		return listBarang;
	}
}
