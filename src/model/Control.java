package model;

import java.util.ArrayList;

public class Control {
	
	String[][] m1;
	String[][] m2;
	String[][] automata;
	public Control(int i, int j, int k, int l) {
		m1 = new String[i][j];
		m2 = new String[k][l];
	}
	
	public void agregarM1(ArrayList<String> am1) {
		int contador = 0;
		for(int i = 0; i < m1.length; i++) {
			for(int j = 0; j < m1[0].length; j++) {
				m1[i][j] = am1.get(contador);
				contador++;
			}
		}
	}
	
	public void agregarM2(ArrayList<String> am2) {
		int contador = 0;
		for(int i = 0; i < m2.length; i++) {
			for(int j = 0; j < m2[0].length; j++) {
				m2[i][j] = am2.get(contador);
				contador++;
			}
		}
		paso3();
	}
	
	public void paso1() {
		boolean esta = false;
		for(int i = 1; i < m1.length; i++) {
			
			for(int j = 1; j < m1[i].length;j++) {
				
			}
		}
	}
	
	public void paso3() {
		automata = new String[m1.length + m2.length][4];
		for(int i = 0; i < m1.length; i++) {
			for(int j = 0; j < m1[i].length; j++) {
				automata[i][j] = m1[i][j];
			}
		}
		
		for(int i = 0; i < m2.length; i++) {
			for(int j = 0; j < m2[i].length; j++) {
				automata[m1.length+i][j] = m2[i][j];
			}
		}
	}
	
	public void paso4() {
		
	}
	
	
	
}
