package application;


import java.io.IOException;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import  javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

public class afterLogin {


    @FXML
    private Button cat;

    @FXML
    private Button stat;

    @FXML
    private Button emp;

    @FXML
    void goToCat(ActionEvent event) throws IOException {
    	try {
    	    /*Parent tableViewParent = FXMLLoader.load(getClass().getClassLoader().getResource("cat.fxml"));
            Scene tableViewScene = new Scene(tableViewParent);
            
            //This line gets the Stage information
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            window.setScene(tableViewScene);
            window.show();*/
		} catch(Exception e) {
			e.printStackTrace();
		}
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
