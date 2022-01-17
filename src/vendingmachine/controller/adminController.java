package vendingmachine.controller;

import javax.swing.JFrame;
import vendingmachine.loginUI;
import vendingmachine.models.adminModel;

/**
 *
 * @author RZ
 */
public class adminController {

	adminModel model = new adminModel();

	public adminModel getModel() {
		return model;
	}

	public void logout(JFrame frame) {
		model.setUsername(null);
		frame.dispose();
		new loginUI(model).setVisible(true);
	}
}
