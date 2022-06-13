package jsnacks;

import java.util.Scanner;

public class JSnack1 {

	public static void main(String[] args) {
		
	// Il software deve chiedere per 5 volte all'utente di inserire un numero.	
	// Il programma stampa la somma di tutti i numeri inseriti.
	// Esegui questo programma in due versioni, con il for e con il while.
		
		
		Scanner scan = new Scanner (System.in);
		
		//Esercizio con ciclo for
		int numero;
		int somma = 0;	
		
		
//		for (int i = 1; i < 6; i++)	{
//			System.out.println("Inserisci un numero");
//			numero = scan.nextInt();
//			somma = somma + numero;
//		} 	
//		
//		System.out.println("La somma dei numeri è " + somma);		
		
		//Esercizio ciclo while
		
		int i = 1;
		
		while (i < 6) {
			System.out.println("Inserisci un numero");
			numero = scan.nextInt();
			somma = somma + numero;
			i++;
		}
		 System.out.println("La somma dei numeri è " + somma);
		 
		 scan.close();
		 
	}	

}
