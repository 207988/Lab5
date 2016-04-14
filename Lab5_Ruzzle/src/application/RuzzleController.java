package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import it.polito.tdp.ruzzle.model.Lettera;
import it.polito.tdp.ruzzle.model.Parola;
import it.polito.tdp.ruzzle.model.Posizione;
import it.polito.tdp.ruzzle.model.RuzzleModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class RuzzleController {

	private List<Label> mappaCaratteri=new ArrayList<Label>();
	private RuzzleModel ruzzle;
	
	public void setModel(RuzzleModel model){
		ruzzle=model;
	}
	
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
    private ListView<Parola> listParole;

    @FXML
    void doGenera(ActionEvent event) {
    	//POPOLAZIONE MAPPA
    	ruzzle.genera();
    	Map<Posizione,Lettera>mappa=new LinkedHashMap<Posizione,Lettera>(ruzzle.getMappa());
    	List<Lettera>temp=new ArrayList<Lettera>();
    	int i=0;
    	for(Lettera l:mappa.values()){
    		mappaCaratteri.get(i).setText(l.toString());
    		i++; 		
    	}
    	ruzzle.calcolaParole();
    	List<Parola>finale=new ArrayList<Parola>(ruzzle.getRisultato());
    	
    	listParole.getItems().addAll(finale);
    	
    	

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
        
        mappaCaratteri.add(lbl1);
        mappaCaratteri.add(lbl2);
        mappaCaratteri.add(lbl3);
        mappaCaratteri.add(lbl4);
        mappaCaratteri.add(lbl5);
        mappaCaratteri.add(lbl6);
        mappaCaratteri.add(lbl7);
        mappaCaratteri.add(lbl8);
        mappaCaratteri.add(lbl9);
        mappaCaratteri.add(lbl10);
        mappaCaratteri.add(lbl11);
        mappaCaratteri.add(lbl12);
        mappaCaratteri.add(lbl13);
        mappaCaratteri.add(lbl14);
        mappaCaratteri.add(lbl15);
        mappaCaratteri.add(lbl16);
       
        
        
        
        //SELECT NOME FROM PAROLA WHERE NOME LIKE "av%"
    }
}
