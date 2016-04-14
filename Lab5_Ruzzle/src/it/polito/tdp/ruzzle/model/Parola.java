package it.polito.tdp.ruzzle.model;

import java.util.ArrayList;
import java.util.List;

public class Parola {

	private String s;
	private List<Lettera>lettere;
	public Parola(String s, List<Lettera> lettere) {
		super();
		this.s = s;
		this.lettere = lettere;
	}
	public String getS() {
		return s;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return s;
	}
	
	public List<Posizione> caselle(){
		List<Posizione> temp=new ArrayList<Posizione>();
		for(Lettera l:lettere)
			temp.add(l.getPos());
		return temp;
		
	}
	
	
	
}
