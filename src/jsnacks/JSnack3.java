package jsnacks;

import java.util.Random;

public class JSnack3 {

	public static void main(String[] args) {
		
		// Generatore di "nomi cognomi" casuali: prendendo una lista di nomi
		// e una lista di cognomi, genera una falsa lista di 3 invitati
		
		String[] nomi = {"Luciano", "Vasco", "Tiziano", "Max", "Claudio", "Lucio"};
		String[] cognomi = {"Ligabue","Rossi","Ferro", "Pezzali", "Baglioni", "Dalla"};			
		String[] Lista = new String [3];
		
		Random rand = new Random();
		
		{System.out.println("Gli invitati sono: ");}
		
		  
	    for	(int i=0; i<3; i++) {
	    	int nom = rand.nextInt(nomi.length);
	    	int cogn = rand.nextInt(cognomi.length);
	    	
	    			
	    	
	    	System.out.println(nomi[nom] + " " + cognomi[cogn]);
	    }	
		
			

	}

}
