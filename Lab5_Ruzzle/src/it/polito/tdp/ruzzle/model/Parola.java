package it.polito.tdp.ruzzle.model;

import java.util.ArrayList;
import java.util.List;

public class Parola {

	private String s;
	private List<Lettera>lettere=new ArrayList<Lettera>();;
	public Parola(String s, List<Lettera> lettere) {
		super();
		this.s = s;		
		this.lettere.addAll(lettere);
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((s == null) ? 0 : s.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parola other = (Parola) obj;
		if (s == null) {
			if (other.s != null)
				return false;
		} else if (!s.equals(other.s))
			return false;
		return true;
	}
	
	
	
}
