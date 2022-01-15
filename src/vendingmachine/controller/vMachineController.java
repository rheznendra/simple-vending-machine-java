package vendingmachine.controller;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import vendingmachine.CurrencyID;
import vendingmachine.models.minumanModel;
import vendingmachine.models.vMachineModel;

/**
 *
 * @author RZ
 */
public class vMachineController {

	vMachineModel model = new vMachineModel();
	private final ArrayList<minumanModel> kodeMinuman;

	public vMachineController() {
		kodeMinuman = model.getKodeMinuman();
	}

	public vMachineModel getModel() {
		return model;
	}

	public void changeSaldo(JLabel label, int saldo) {
		model.setSaldo(saldo);
		label.setText(String.valueOf(new CurrencyID(saldo)));
	}

	public void typingKode(JLabel label, String text) {
		if (model.getSaldo() >= 1) {
			String kode = model.getKode();
			if (kode.length() < 2) {
				kode = kode + text;
				model.setKode(kode);
				label.setText(kode);
			}
		}
	}

	public void deleteKode(JLabel label) {
		String kode = model.getKode();
		if (kode.length() >= 1) {
			kode = kode.substring(0, kode.length() - 1);
			model.setKode(kode);
			label.setText(kode);
		}
	}

	public void selectItem(JLabel labelSaldo, JLabel labelKode, JLabel getItemLabel) {
		if (model.getKode().length() >= 1) {
			String loopKode, kode = model.getKode();
			int loopHarga;
			for (int i = 0; i < kodeMinuman.size(); i++) {
				loopKode = kodeMinuman.get(i).getKode();
				loopHarga = kodeMinuman.get(i).getHarga();
				if (loopKode.equalsIgnoreCase(kode)) {

					if (model.getSaldo() >= loopHarga) {
						model.setSaldo(-loopHarga);
						model.setKode("");
						labelSaldo.setText(String.valueOf(new CurrencyID(model.getSaldo())));
						labelKode.setText("");
						getItemLabel.setVisible(true);
					} else {
						JOptionPane.showMessageDialog(null, "Saldo Tidak Mencukupi.");
					}
					break;
				}
				if (i == kodeMinuman.size() - 1) {
					JOptionPane.showMessageDialog(null, "Kode Minuman Tidak Tersedia.");
				}
			}
		}
	}
}
