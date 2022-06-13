package jsnacks;

import java.util.Scanner;

public class JSnack2 {
	
	//Chiedi all'utente di inserire un numero,se è pari stampa in numero
	// se è dispari stampa il numero successivo
	
		public static void main(String[] args) {
			
	    Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Se inserisci un numero pari te lo riscrivo, se dispari ti riscrivo il numero pari successivo");
		int numero;			
		numero = scan.nextInt();
		
		if(numero % 2 == 0)
			System.out.println("Il numero è " + numero);
		else
			System.out.println("Il numero diventa " + (numero+1));
		
		scan.close();
		
	}
	
	

}
