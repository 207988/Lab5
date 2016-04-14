package it.polito.tdp.ruzzle.model;

public class Lettera {
	char c;
	Posizione pos;
	
	public Lettera(char c, Posizione pos) {
		super();
		this.c = c;
		this.pos = pos;
	}
	public char getC() {
		return c;
	}
	public void setC(char c) {
		this.c = c;
	}
	public Posizione getPos() {
		return pos;
	}
	public void setPos(Posizione pos) {
		this.pos = pos;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ""+c;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pos == null) ? 0 : pos.hashCode());
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
		Lettera other = (Lettera) obj;
		if (pos == null) {
			if (other.pos != null)
				return false;
		} else if (!pos.equals(other.pos))
			return false;
		return true;
	}
	
	
	
	

}
