package com.visitor;

//avem clasele Person si Animal cu multe proprietati + un constructor + settere
class Person implements Visitable {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

}

class Animal {
	private String name;
}

/*
 * Fiecare clasa ce accepta sa fie vizitata, va implementa aceasta interfata
 */
interface Visitable {
	public void accept(Visitor visitor);
}

interface Visitor {
	public void visit(Person person);

	public void visit(Animal animal);
}

class MailVisitor implements Visitor {
	@Override
	public void visit(Person person) {
		System.out.println("Trimit mail cu datele persoanei: " + person);
	}

	@Override
	public void visit(Animal animal) {
		System.out.println("Trimit mail cu datele animalului: " + animal);
	}
}

class XMLFileVisitor implements Visitor {
	@Override
	public void visit(Person person) {
		System.out.println("Scriu intr-un fisier XML datele persoanei: " + person);
	}

	@Override
	public void visit(Animal animal) {
		System.out.println("Scriu intr-un fisier XML datele animalului: " + animal);
	}
}

public class VisitorMain1 {

	public static void main(String[] args) {
		Visitor visitorMail = new MailVisitor();
		Visitor visitorXML = new XMLFileVisitor();
		Person marco = new Person("Marco");
		marco.accept(visitorMail);
	}

}

/* Implementari ale clasei Produs sunt:
1. Lamaie, ce va avea urmatoarele atribute:
- calitate (o valoare precum 1, 2 sau 3)
- cantitate (kg)
2. Patrunjel
- cantitate (kg)
- numarFrunze
3. Pepsi
- litraj
- luniPanaLaExpirare
4. PieptPui
- zonaPuiCrescut (o valoare intre 1 si 10, double)
- procentGrasime
- cantitateProteine

Toate aceste produse se vand fie la un SuperMarket, fie la un Magazin de cartier. Preturile sunt calculate in mod diferit, iar Produsul nu ar trebui sa fie responsabil de acest aspect. 
Implementati astfel posibilitatea calcularii preturilor de produse, atat de catre supermarket, cat si de magazinul de cartier, fara a modifica in vreun fel clasele de tipul Produs, odata ce au fost construite. 
Regulile de calcul ale preturilor sunt alese de catre voi.

interface Vistior{
	visit(Lamaie);
	visit(Pepsi);
}

class SuperMarket implements Visitor{

	Pair<Produs, Integer> pereche = 
	visit(Lamaie lamaie){
		pereche.add(lamaie, 0.8 * lamaie.getCalitate() + 0.1 * lamaie.getCantitate() + adaosMic);
	}
}

class MagazinCartier implements Visitor{
	visit(Lamaie lamaie){
		return lamaie.getCalitate() + 0.1 * lamaie.getCantitate() + adaosMare;
	}
}
*/
