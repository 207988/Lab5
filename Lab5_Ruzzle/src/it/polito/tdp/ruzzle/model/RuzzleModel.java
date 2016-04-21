package it.polito.tdp.ruzzle.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import it.polito.tdp.ruzzle.db.DBConnect;
import it.polito.tdp.ruzzle.db.ParolaDAO;

public class RuzzleModel {
	private Map<Posizione,Lettera>mappa=new LinkedHashMap<Posizione,Lettera>();
	private List<Lettera>usate=new ArrayList<Lettera>();	
	private List<Parola>risultati=new ArrayList<Parola>();	
	
	
	
	public RuzzleModel() {
		super();
		//INIZIALIZZA MAPPA VUOTA
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				mappa.put(new Posizione(i,j),null );
			}
		}		
		
	}



	public void genera(){
		risultati.clear();
		Random r = new Random();
		String abc = "ABCDEFGHILMNOPQRSTUVZ";
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				Posizione p=new Posizione(i,j);
				//Lettera l=new Lettera((char)(r.nextInt(26) + 'a'),p);
				Lettera l=new Lettera(abc.charAt(r.nextInt(21)),p);
				mappa.put(p,l);
				System.out.print(l.toString()+" ");
			}
			System.out.println();
		}
		
	}
	
	public Map<Posizione,Lettera>getMappa(){
		return mappa;
	}
	
	public void calcolaParole(){
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){		
				usate.add(mappa.get(new Posizione(i,j)));
				ricorsione(mappa.get(new Posizione(i,j)));
				//System.out.println(risultati.get(1).caselle());
				usate.clear();
				//System.out.println(risultati.get(1).caselle());
				
			}		
		}
	}
	
	public void ricorsione(Lettera l){
		int col=l.getPos().getX();
		int rig=l.getPos().getY();
		for(int c=col-1;c<=col+1;c++){
			for(int r=rig-1;r<=rig+1;r++){
				if(r!=rig||c!=col){
					if(r>=1&&r<=4){
						if(c>=1&&c<=4){
							Lettera lett=mappa.get(new Posizione(c,r));
							if(!usate.contains(lett)){
								usate.add(lett);
								if(checkParola(usate))
									 ricorsione(lett);							
								usate.remove(lett);
								
							}
						}
					}
				}
			}
		}
		
	}
	public boolean checkParola(List<Lettera>temp){
		String s="";		
		for(Lettera l:temp)
			s+=l.toString();
		//EXIT PAROLA GIA INSERITA
		if(risultati.contains(new Parola(s,temp)))
			return true;
		//CONTROLLO PAROLA CORRETTA
		ParolaDAO db=new ParolaDAO();		
		boolean corretta=db.checkParola(s);		
		if(corretta){			
			Parola p=new Parola(s,temp);
			risultati.add(p);
			System.out.println(s);	
			//System.out.println(p.caselle());
		}		
		
		return corretta;
	}



	public List<Parola> getRisultato() {
		return risultati;
	}
	
	

}
