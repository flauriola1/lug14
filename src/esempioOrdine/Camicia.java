package esempioOrdine; //cartella in cui si trova il file java

public class Camicia { //corrsipondente al 1 rigo UML 
	//public : file visibile esternamente al package
	// class : dichiarazione di classe Java
	
	//2 ° rigo diagramma UML : attributi 
	public int camiciaID; //int:intero
	public String descrizione = "- descrizione mancante"; // String:testo, in questo caso con un valore iniziale
	public char codiceColore = 'U'; // colori disponibili: R = red,G= green, B = blue, W = white, U=unset
	public double prezzo; // double: tipo numerico decimale
	public int acquistate; 
	
	
	//3^ rigo diagramma UML: i metodi della classe
	
	public void display() { //void: il metodo non deve fornire valori di ritorno ma solo stampare
		System.out.println("ID della camicia: " + camiciaID); //+ operatore polimorfo(fa somme numeriche o concatenazioni di String)
		System.out.println("Descrizione:" + descrizione);

		System.out.println("Codice Colore:" + codiceColore);

		System.out.println("Prezzo unitario:" + prezzo + "euro");
		
		System.out.println("Quantità acquistata:" + acquistate);
		System.out.println(); //rigo vuoto
		
		
	}
	
	//4° rigo del diagramma UML: camicia non crea oggetti a sua volta
	

}
