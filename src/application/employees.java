package application;
import java.io.IOException;

import com.sun.glass.events.MouseEvent;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;


public class employees {

    @FXML
    private TableView<?> tabEmp;

    @FXML
    private TableColumn<?, ?> colID;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colDep;


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
