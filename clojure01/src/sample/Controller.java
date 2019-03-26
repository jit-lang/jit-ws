package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Button button1;

    @FXML
    public void onPushButton1( ActionEvent e )
    {
        System.out.println("clicked!");
        button1.setText("clicked!");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println(button1.getText());
    }
}
