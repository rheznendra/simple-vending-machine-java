
package vendingmachine.models;

import java.util.ArrayList;

/**
 *
 * @author RZ
 */
public class listHistoryModel {
	private ArrayList<historyModel> listHistory;

	public listHistoryModel(ArrayList<historyModel> listHistory) {
		this.listHistory = listHistory;
	}

	public ArrayList<historyModel> getListHistory() {
		return listHistory;
	}
}
