package demenagementPack;

import java.util.Scanner; // LIRE LES ENTR�ES CLAVIER EN JAVA => pour utiliser le clavier et donc permettre d'entrer des donn�es

public class TestDem{
	public static void main(String[] args) { // String = classe
		System.out.println("Bienvenue");
		
		int cartons;
		Scanner clavier = new Scanner(System.in);
		System.out.print("Saisir le nombre de cartons : ");
		cartons = clavier.nextInt();
		
		System.out.print(cartons);
		
		// on cr�� une 'instance'
		Demenagement dem = new Demenagement("Entreprise bretonne",9);
		
		// on apelle la m�thode d'instance 'auTravail()'
		dem.auTravail(cartons);
		
		// fermer les ressources
        clavier.close();
	}
}