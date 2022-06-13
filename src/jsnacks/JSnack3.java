package jsnacks;

import java.util.Random;

public class JSnack3 {

	public static void main(String[] args) {
		
		// Generatore di "nomi cognomi" casuali: prendendo una lista di nomi
		// e una lista di cognomi, genera una falsa lista di 3 invitati
		
		String[] nomi = {"Luciano", "Vasco", "Tiziano", "Max", "Claudio"};
		String[] cognomi = {"Ligabue","Rossi","Ferro", "Pezzali", "Baglioni"};			
		String[] Lista = new String [3];
		
		Random rand = new Random();
		
		  
	    for	(int i=0; i<3; i++) {
	    	String nome = nomi[rand.nextInt(5)];
	    	String cognome = cognomi[rand.nextInt(5)];
	    				    	
	    	System.out.println("Gli invitati sono: " + nome + " " + cognome);
	    }
		
			

	}

}
