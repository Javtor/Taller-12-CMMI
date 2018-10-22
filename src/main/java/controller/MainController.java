package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainController {

    @FXML
    private JFXComboBox<String> comboArea;

    @FXML
    private JFXComboBox<Integer> comboAct;

    @FXML
    private JFXComboBox<Integer> comboObj;

    @FXML
    private JFXButton btnAgregar;

    @FXML
    private JFXTextField txtTexto;

    @FXML
    void agregar(ActionEvent event) {

    }

}
