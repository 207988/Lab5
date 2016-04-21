package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import com.sun.prism.paint.Color;

import it.polito.tdp.ruzzle.model.Lettera;
import it.polito.tdp.ruzzle.model.Parola;
import it.polito.tdp.ruzzle.model.Posizione;
import it.polito.tdp.ruzzle.model.RuzzleModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

public class RuzzleController {

	private Map<Posizione,Label> mappaCaratteri=new LinkedHashMap<Posizione,Label>();
	private RuzzleModel ruzzle;
	private List<Posizione>listParTemp=new ArrayList<Posizione>();
	
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
    	listParole.getItems().clear();
    	ruzzle.genera();
    	Map<Posizione,Lettera>mappa=new LinkedHashMap<Posizione,Lettera>(ruzzle.getMappa());
    	List<Lettera>temp=new ArrayList<Lettera>();
    	int i=1;
    	int j=1;
    	for(Lettera l:mappa.values()){
    		if(i==5){
    			i=1;
    			j++;
    		}
    		mappaCaratteri.get(new Posizione(j,i)).setText(l.toString());    		
    		i++; 		
    	}
    	ruzzle.calcolaParole();
    	List<Parola>finale=new ArrayList<Parola>(ruzzle.getRisultato());  
    	Collections.sort(finale);
    	
    	listParole.getItems().addAll(finale);
    	
    	
    	

    }
    @FXML
    void doClick(MouseEvent event) {
    	if(listParole.getItems().size()==0){
    		System.out.println("PRIMA DEVI GENERARE");
    		return;
    	}
    	for(Posizione p:listParTemp){
    		mappaCaratteri.get(p).setStyle("-fx-background-color:green");
    	}
    	listParTemp.clear();
    	
    	//System.out.println("CLICK");
    	//PRENDO LE CASELLE DELLA PAROLA SELEZIONATA    	
    	System.out.println(listParole.getSelectionModel().getSelectedItem());
    	listParTemp.addAll(listParole.getSelectionModel().getSelectedItem().caselle());
    	
    	for(Posizione p:listParTemp){
    		mappaCaratteri.get(p).setStyle("-fx-background-color:red");
    	}
    	
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
        
        mappaCaratteri.put(new Posizione(1,1),lbl1);
        mappaCaratteri.put(new Posizione(1,2),lbl2);
        mappaCaratteri.put(new Posizione(1,3),lbl3);
        mappaCaratteri.put(new Posizione(1,4),lbl4);
        mappaCaratteri.put(new Posizione(2,1),lbl5);
        mappaCaratteri.put(new Posizione(2,2),lbl6);
        mappaCaratteri.put(new Posizione(2,3),lbl7);
        mappaCaratteri.put(new Posizione(2,4),lbl8);
        mappaCaratteri.put(new Posizione(3,1),lbl9);
        mappaCaratteri.put(new Posizione(3,2),lbl10);
        mappaCaratteri.put(new Posizione(3,3),lbl11);
        mappaCaratteri.put(new Posizione(3,4),lbl12);
        mappaCaratteri.put(new Posizione(4,1),lbl13);
        mappaCaratteri.put(new Posizione(4,2),lbl14);
        mappaCaratteri.put(new Posizione(4,3),lbl15);
        mappaCaratteri.put(new Posizione(4,4),lbl16);
        
       
       
        
        
        
        //SELECT NOME FROM PAROLA WHERE NOME LIKE "av%"
    }
}
