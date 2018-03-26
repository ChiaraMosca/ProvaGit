package it.polito.tdp.libretto;

import java.util.*;

public class Libretto {
	private List<Voto> voti;
	
	public Libretto() {
		this.voti= new ArrayList<>(); //oppure <Voto> tanto è definito prima quando creo voti
	}
	public Libretto(List<Voto> voti) {
		//shallowCopy copio il riferimento all'oggetto e se lo cmbio d qualche parte incide sul resto
		//this.voti=voti;
		//deepCopy copia tutto l'oggetto le modifiche su uno non incidono sula sua copia 
		this.voti=new ArrayList<Voto>();
		for(Voto v:voti)
			this.voti.add(new Voto(v.getEsame(),v.getVoto()));
			
		//ora ho due liste diverse e separate in memoria 
	}
	
	public void add(Voto v) {
		if(this.voti.contains(v))
		{System.out.println("Il voto esiste già");
		return;}
		
		for(Voto voto:voti) {
			if(voto.getEsame().equals(v.getEsame()))
			{System.out.println("Trovato lo stesso esame (aggiorno voto)");
			v.setVoto(v.getVoto());
			return;
			}
	
		}
		this.voti.add(v);
	}
	
	public void stampa() {
		System.out.println("Ci sono "+voti.size()+"voti");
		for(Voto v:this.voti)
			System.out.println(v);
	}

	public void stampa25() {
		for(Voto v:this.voti)
			if(v.getVoto()==25)
			System.out.println(v);
		
	}

	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("Ci sono " +voti.size() +"voti");
		
		for(Voto v:this.voti) {
			sb.append(v.toString());
			sb.append("\n");}
		return sb.toString();
	}

	public String getVoto(String string) {

		for(Voto v:this.voti) {
			if(v.getEsame().compareTo(string)==0) {
				return String.valueOf(v.getVoto());
			}
		}
		return "Nome corso non trovato"; 	
	}

	
	public List<Voto> getVoti() {
		return this.voti;
	}
public void alzaVoti() {
	for(Voto v:this.voti)
		{if(v.getVoto()>=24)
			v.setVoto(v.getVoto()+2);
	if(v.getVoto()>=24)
		v.setVoto(v.getVoto()+1);}
}	
		
}

