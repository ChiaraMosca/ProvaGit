package it.polito.tdp.libretto;

public abstract class TestLibretto {

	public static void main(String[] args) {
		Libretto lib=new Libretto();
		
		lib.add(new Voto("Chimica",30));
		lib.add(new Voto("Analisi",28));
		lib.add(new Voto("Fisica",25));
		
		lib.stampa();
		
		System.out.println("\n Esami con voto 25: ");
		lib.stampa25();
		
		System.out.println("\n Voto del corso :");
		lib.getVoto("TdP");
		System.out.println(lib.getVoto("TdP"));
		
		lib.add(new Voto("Fisica",25));
		
		System.out.println("\n NUOVO LIBRETTO");
		Libretto newLib= new Libretto(lib.getVoti());
		//newLib.alzaVoti();
		newLib.stampa();
	
	}

}
