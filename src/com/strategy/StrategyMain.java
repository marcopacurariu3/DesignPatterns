package com.strategy;

//am dori sa avem o aplicatie care ne duce din punctul A in punctul B
//class NavigatorApp {
//	public void buildRoute(String pointA, String pointB) {
//		Masina masina = new Masina();
//		masina.conduce(pointA, pointB);
//
//		// am nevoie de o instanta de Tren
//		// am nevoie de o instanta de Avion
//		// mai mult, diversi programatori pot lucra in acelasi timp pe diverse strategii
//		// (avioane, trenuri, autobuze, etc) => o multime de conflicte in clasa
//		// Navigator
//	}
//}

class NavigatorApp {

	private Strategy strategy;

	public NavigatorApp(Strategy strategy) {
		this.strategy = strategy;
	}

	public void changeStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	// izolez logica de business (actiunea in sine) de aplicatia de navigare
	// ne ajuta atunci cand, fara acest pattern, am fi avut multe conditii in
	// aceeasi clasa (ca sa decid ce algoritm sa aleg - masina, vapor, etc)
	public void buildRoute(String pointA, String pointB) {
		strategy.move(pointA, pointB);
	}
}

interface Strategy {
	public void move(String pointA, String pointB);
}

class Masina implements Strategy {
	@Override
	public void move(String pointA, String pointB) {
		System.out.println("Sunt o masina si merg din A in B, am gasit traseul!");
	}
}

class Airplane implements Strategy {
	@Override
	public void move(String pointA, String pointB) {
		System.out.println("Sunt un avion si zbor din A in B, am gasit traseul!");
	}
}

class Ship implements Strategy {
	@Override
	public void move(String pointA, String pointB) {
		System.out.println("Sunt un vapor si navighez din A in B, am gasit traseul!");
	}
}

public class StrategyMain {

	public static void main(String[] args) {
		Strategy dacia = new Masina();
		NavigatorApp navigatorApp = new NavigatorApp(dacia);
		navigatorApp.buildRoute("A", "B");

		navigatorApp.changeStrategy(new Airplane());
		navigatorApp.buildRoute("A", "B");

		navigatorApp.changeStrategy(new Ship());
		navigatorApp.buildRoute("B", "C");
	}

}
