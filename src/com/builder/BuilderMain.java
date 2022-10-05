package com.builder;

//Builder-ul este strans legat de zona de immutability -> adica, un obiect, odata creat, nu mai poate fi modificat

class Person {
	private final String nume;
	private final String prenume;
	private final int varsta;
	private final int inaltime;
	private final String gen;

	public Person(String nume, String prenume) {
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = 18;
		this.inaltime = 160;
		this.gen = "F";
	}

	public Person(String nume, String prenume, int varsta) {
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.inaltime = 160;
		this.gen = "F";
	}

	public Person(String nume, String prenume, int varsta, String gen) {
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.inaltime = 160;
		this.gen = gen;
	}

	public Person(String nume, String prenume, int inaltime, int varsta) {
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.inaltime = inaltime;
		this.gen = "F";
	}

}

public class BuilderMain {

	public static void main(String[] args) {

	}

}
