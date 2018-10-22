package controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class MainController implements Initializable {

	public static final String[] areas = new String[] { "CAR", "CM", "DAR", "IPM", "MA", "OPD", "OPF", "OPM", "OPP",
			"OT", "PI", "PMC", "PP", "PPQA", "QPM", "RD", "REQM", "RSKM", "SAM", "TS", "VAL", "VER" };

	@FXML
	private JFXComboBox<String> comboArea;

	@FXML
	private JFXComboBox<Integer> comboAct;

	@FXML
	private JFXComboBox<Integer> comboObj;

	@FXML
	private JFXButton btnAgregar;

	@FXML
	private JFXTextArea txtTexto;

	@FXML
	void agregar(ActionEvent event) {
		String msg = "Área de proceso: " + comboArea.getSelectionModel().getSelectedItem() + "\n";

		int inicio = comboAct.getSelectionModel().getSelectedIndex();
		int fin = comboObj.getSelectionModel().getSelectedIndex();

		String[] metas = new String[3];
		metas[0] = "Achieve Specific Goals";
		metas[1] = "Institutionalize a Managed Process";
		metas[2] = "Institutionalize a Defined Process";

		msg += "Para alcanzar el nivel de capacidad " + fin + ", se deben cumplir las siguientes metas: ";

		for (int i = inicio; i < fin; i++) {
			msg += "GG " + (i + 1) + ", ";
		}

		msg += "que consisten en";

		for (int i = inicio; i < fin; i++) {
			msg += " " + metas[i] + ",";
		}

		msg = msg.substring(0, msg.length() - 1) + ".\n";

		String[] info = new String[3];
		String m = "Practica: GP 1.1. Descripción: Perform the specific practices of the process area to develop work products and provide services to achieve the specific goals of the process area.\n";
		info[0] = m;
		
		m = "Practica: GP 2.1. Descripción: Establish and maintain an organizational policy for planning and " + 
				"performing the process.\r\n";
		
		m+= "Practica: GP 2.3. Descripción: Provide adequate resources for performing the process, " + 
				"developing the work products, and providing the services of the " + 
				"process.\n";
		
		m+= "Practica: GP 2.5. Descripción: Train the people performing or supporting the process as needed. \n";
		
		m+= "Practica: GP 2.7. Descripción: Identify and involve the relevant stakeholders of the process as " + 
				"planned. \n";
		
		m+= "Practica: GP 2.9. Descripción: Objectively evaluate adherence of the process and selected work " + 
				"products against the process description, standards, and " + 
				"procedures, and address noncompliance.  \n";
		
		info[1] = m;

		txtTexto.setText(msg);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ObservableList<Integer> listInt = FXCollections.observableArrayList(0, 1, 2, 3);
		comboAct.setItems(listInt);
		comboAct.getSelectionModel().select(0);

		comboObj.setItems(listInt);
		comboObj.getSelectionModel().select(0);

		ObservableList<String> list = FXCollections.observableArrayList(areas);
		comboArea.setItems(list);
		comboArea.getSelectionModel().select(0);

		txtTexto.setWrapText(true);
	}

}
