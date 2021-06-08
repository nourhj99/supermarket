package application;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;

import javafx.scene.control.TextField;

import javafx.event.ActionEvent;

import java.io.IOException;

public class addEmp {

    @FXML
    private TextField addID;

    @FXML
    private TextField addName;

    @FXML
    private TextField addPN;

    @FXML
    private TextField addEmail;

    @FXML
    private TextField addAdress;

    @FXML
    private TextField addRole;

    @FXML
    private DatePicker addStartDate;

    @FXML
    private TextField addDep;

    @FXML
    private TextField addPass;

    @FXML
    private Button addbt;

    @FXML
    void AddAdd(ActionEvent event) {

    }

    @FXML
    private Button cat;

    @FXML
    private Button stat;

    @FXML
    private Button emp;

    @FXML
    void goToCat(ActionEvent event) throws IOException {
    	Main m = new Main();
    	m.changeScene("cat.fxml");
    }

    @FXML
    void goToEmp(ActionEvent event) throws IOException {
    	Main m = new Main();
    	m.changeScene("employees.fxml");
    }

    @FXML
    void goToStat(ActionEvent event) {

    }
}
