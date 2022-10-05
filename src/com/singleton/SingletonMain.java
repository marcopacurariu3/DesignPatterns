package com.singleton;

class StatulRoman {

	private static StatulRoman obj;

	private StatulRoman() {

	}

	// campurile + metodele statice pot fi apelate de forma: Clasa.numeMetoda();
	public static StatulRoman getInstance() {
		// daca nu am un obiect creat
		if (obj == null) {
			obj = new StatulRoman();
		}
		return obj;
	}
}

public class SingletonMain {

	public static void main(String[] args) {
		System.out.println(StatulRoman.getInstance());
		System.out.println(StatulRoman.getInstance());
		System.out.println(StatulRoman.getInstance());
	}

}
