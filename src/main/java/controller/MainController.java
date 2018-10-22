package controller;

import java.net.URL;
import java.util.HashMap;
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

	private HashMap<String, String> hash;
	
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
		String m = "Practica: GP 1.1. Descripcion: Perform the specific practices of the process area to develop work products and provide services to achieve the specific goals of the process area.\n";
		info[0] = m;

		m = "Practica: GP 2.1. Descripción: Establish and maintain an organizational policy for planning and "
				+ "performing the process.\r\n";
		m += "Practica: GP 2.2. Descripcion: Establish and maintain the plan for performing the process.\n";

		m += "Practica: GP 2.3. Descripción: Provide adequate resources for performing the process, "
				+ "developing the work products, and providing the services of the " + "process.\n";
		m += "Practica: GP 2.4. Descripcion: Assign responsibility and authority for performing the process, "
				+ "developing the work products, and providing the services of the " + "process. \n";

		m += "Practica: GP 2.5. Descripción: Train the people performing or supporting the process as needed. \n";
		m += "Practica: GP 2.6. Descripcion: Place selected work products of the process under appropriate "
				+ "levels of control.\n";

		m += "Practica: GP 2.7. Descripción: Identify and involve the relevant stakeholders of the process as "
				+ "planned. \n";
		m += "Practica: GP 2.8. Descripcion: Monitor and control the process against the plan for performing "
				+ "the process and take appropriate corrective action. \n";

		m += "Practica: GP 2.9. Descripción: Objectively evaluate adherence of the process and selected work "
				+ "products against the process description, standards, and "
				+ "procedures, and address noncompliance.  \n";
		
		m += "Practica: GP 2.10. Descripción: Review the activities, status, and results of the process with higher" + 
				"level management and resolve issues.\n";

		info[1] = m;

		m = "Practica: GP 3.1. Descripción: Establish and maintain the description of a defined process.\n";
		m += "Practica: GP 3.2. Descripción: Collect process related experiences derived from planning and" + 
				"performing the process to support the future use and improvement" + 
				"of the organization’s processes and process assets.\n";
		info[2] = m;
		
		for (int i = inicio; i < fin; i++) {
			msg += " " + info[i];
			if(i == 0) {
				
			}
		}
		
		txtTexto.setText(msg);
	}
	
	private void createHash() {
		hash = new HashMap<>();
		String m = "SP 1.1 Select Outcomes for Analysis\r\n" + 
				"SP 1.2 Analyze Causes\r\n" +  
				"SP 2.1 Implement Action Proposals\r\n" + 
				"SP 2.2 Evaluate the Effect of Implemented Actions\r\n" + 
				"SP 2.3 Record Causal Analysis Data \n";
		hash.put("CAR", m);
		
		m = "SP 1.1 Select Outcomes for Analysis\r\n" + 
				"SP 1.2 Analyze Causes\r\n" +  
				"SP 2.1 Implement Action Proposals\r\n" + 
				"SP 2.2 Evaluate the Effect of Implemented Actions\r\n" + 
				"SP 2.3 Record Causal Analysis Data \n";
		hash.put("CM", m);
		
		m = "SP 1.1 Establish the Project’s Defined Process\r\n" + 
				"SP 1.2 Use Organizational Process Assets for Planning Project Activities\r\n" + 
				"SP 1.3 Establish the Project’s Work Environment\r\n" + 
				"SP 1.4 Integrate Plans\r\n" + 
				"SP 1.5 Manage the Project Using Integrated Plans\r\n" + 
				"SP 1.6 Establish Teams\r\n" + 
				"SP 1.7 Contribute to Organizational Process Assets\r\n" +  
				"SP 2.1 Manage Stakeholder Involvement\r\n" + 
				"SP 2.2 Manage Dependencies\r\n" + 
				"SP 2.3 Resolve Coordination Issues \n";
		hash.put("IPM", m);
		
		m= "SP 1.1 Establish Standard Processes\r\n" + 
				"SP 1.2 Establish Lifecycle Model Descriptions\r\n" + 
				"SP 1.3 Establish Tailoring Criteria and Guidelines\r\n" + 
				"SP 1.4 Establish the Organization’s Measurement Repository\r\n" + 
				"SP 1.5 Establish the Organization’s Process Asset Library\r\n" + 
				"SP 1.6 Establish Work Environment Standards\r\n" + 
				"SP 1.7 Establish Rules and Guidelines for Teams \n";
		hash.put("OPD", m);
		
		m = "SP 1.1 Maintain Business Objectives\r\n" + 
				"SP 1.2 Analyze Process Performance Data\r\n" + 
				"SP 1.3 Identify Potential Areas for Improvement\r\n" + 
				"SP 2.1 Elicit Suggested Improvements\r\n" + 
				"SP 2.2 Analyze Suggested Improvements\r\n" + 
				"SP 2.3 Validate Improvements\r\n" + 
				"SP 2.4 Select and Implement Improvements for Deployment\r\n" + 
				"SP 3.1 Plan the Deployment\r\n" + 
				"SP 3.2 Manage the Deployment\r\n" + 
				"SP 3.3 Evaluate Improvement Effects \n";
		hash.put("OPM" ,m);
		
		m = "SP 1.1 Establish Strategic Training Needs\r\n" + 
				"SP 1.2 Determine Which Training Needs Are the Responsibility of the Organization\r\n" + 
				"SP 1.3 Establish an Organizational Training Tactical Plan\r\n" + 
				"SP 1.4 Establish a Training Capability\r\n" + 
				"SP 2.1 Deliver Training\r\n" + 
				"SP 2.2 Establish Training Records\r\n" + 
				"SP 2.3 Assess Training Effectiveness \n";
		hash.put("OT", m);
		
		m = "SP 1.1 Monitor Project Planning Parameters\r\n" + 
				"SP 1.2 Monitor Commitments\r\n" + 
				"SP 1.3 Monitor Project Risks\r\n" + 
				"SP 1.4 Monitor Data Management\r\n" + 
				"SP 1.5 Monitor Stakeholder Involvement\r\n" + 
				"SP 1.6 Conduct Progress Reviews\r\n" + 
				"SP 1.7 Conduct Milestone Reviews\r\n" +  
				"SP 2.1 Analyze Issues\r\n" + 
				"SP 2.2 Take Corrective Action\r\n" + 
				"SP 2.3 Manage Corrective Actions \n";
		hash.put("PMC", m);
		
		m = "SP 1.1 Objectively Evaluate Processes\r\n" + 
				"SP 1.2 Objectively Evaluate Work Products\r\n" +  
				"SP 2.1 Communicate and Resolve Noncompliance Issues\r\n" + 
				"SP 2.2 Establish Records \n";
		hash.put("PPQA", m);
		
		m = "SP 1.1 Elicit Needs\r\n" + 
				"SP 1.2 Transform Stakeholder Needs into Customer Requirements\r\n" + 
				"SP 2.1 Establish Product and Product Component Requirements\r\n" + 
				"SP 2.2 Allocate Product Component Requirements\r\n" + 
				"SP 2.3 Identify Interface Requirements\r\n" +  
				"SP 3.1 Establish Operational Concepts and Scenarios\r\n" + 
				"SP 3.2 Establish a Definition of Required Functionality and Quality Attributes\r\n" + 
				"SP 3.3 Analyze Requirements\r\n" + 
				"SP 3.4 Analyze Requirements to Achieve Balance\r\n" + 
				"SP 3.5 Validate Requirements \n";
		
		hash.put("RD", m);
		
		m = "SP 1.1 Determine Risk Sources and Categories\r\n" + 
				"SP 1.2 Define Risk Parameters\r\n" + 
				"SP 1.3 Establish a Risk Management Strategy\r\n" +  
				"SP 2.1 Identify Risks\r\n" + 
				"SP 2.2 Evaluate, Categorize, and Prioritize Risks\r\n" + 
				"SP 3.1 Develop Risk Mitigation Plans\r\n" + 
				"SP 3.2 Implement Risk Mitigation Plans \n";
		hash.put("RSKM", m);
		
		m = "SP 1.1 Develop Alternative Solutions and Selection Criteria\r\n" + 
				"SP 1.2 Select Product Component Solutions\r\n" + 
				"SP 2.1 Design the Product or Product Component\r\n" + 
				"SP 2.2 Establish a Technical Data Package\r\n" + 
				"SP 2.3 Design Interfaces Using Criteria\r\n" + 
				"SP 2.4 Perform Make, Buy, or Reuse Analyses\r\n" + 
				"SP 3.1 Implement the Design\r\n" + 
				"SP 3.2 Develop Product Support Documentation \n";
		hash.put("TS", m);
		
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
