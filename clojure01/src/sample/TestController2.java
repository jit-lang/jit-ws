package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;

import java.net.URL;
import java.util.ResourceBundle;

public class TestController2 implements Initializable {
    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        //System.out.println(button1.getText());
    }

    @FXML
    public SplitPane splitPane;

    /*
    @FXML
    private Button button1;

    @FXML
    public void onButton1( ActionEvent e )
    {
        System.out.println("clicked!");
        button1.setText("clicked!");
    }

    void setButton1Text(String text) {
        this.button1.setText(text);
    }
    */
}
