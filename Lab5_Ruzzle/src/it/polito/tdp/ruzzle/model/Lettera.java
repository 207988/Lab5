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
	
	

}
