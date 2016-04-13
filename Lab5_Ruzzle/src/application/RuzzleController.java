package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class RuzzleController {

	private String s="";
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lbl2;

    @FXML
    private Label lbl1;

    @FXML
    private Label lbl5;

    @FXML
    private Label lbl9;

    @FXML
    private Label lbl13;

    @FXML
    private Label lbl6;

    @FXML
    private Label lbl10;

    @FXML
    private Label lbl14;

    @FXML
    private Label lbl3;

    @FXML
    private Label lbl7;

    @FXML
    private Label lbl11;

    @FXML
    private Label lbl15;

    @FXML
    private Label lbl4;

    @FXML
    private Label lbl8;

    @FXML
    private Label lbl12;

    @FXML
    private Label lbl16;

    @FXML
    private Button btnGenera;

    @FXML
    private ListView<?> listParole;

    @FXML
    void doGenera(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert lbl2 != null : "fx:id=\"lbl2\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lbl1 != null : "fx:id=\"lbl1\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lbl5 != null : "fx:id=\"lbl5\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lbl9 != null : "fx:id=\"lbl9\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lbl13 != null : "fx:id=\"lbl13\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lbl6 != null : "fx:id=\"lbl6\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lbl10 != null : "fx:id=\"lbl10\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lbl14 != null : "fx:id=\"lbl14\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lbl3 != null : "fx:id=\"lbl3\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lbl7 != null : "fx:id=\"lbl7\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lbl11 != null : "fx:id=\"lbl11\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lbl15 != null : "fx:id=\"lbl15\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lbl4 != null : "fx:id=\"lbl4\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lbl8 != null : "fx:id=\"lbl8\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lbl12 != null : "fx:id=\"lbl12\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert lbl16 != null : "fx:id=\"lbl16\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert btnGenera != null : "fx:id=\"btnGenera\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        assert listParole != null : "fx:id=\"listParole\" was not injected: check your FXML file 'Ruzzle.fxml'.";
        //SELECT NOME FROM PAROLA WHERE NOME LIKE "av%"
    }
}
