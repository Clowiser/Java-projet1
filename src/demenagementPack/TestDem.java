package demenagementPack ;

public class TestDem{
	public static void main(String[] args) { // String = classe
		System.out.println("Bienvenue");
		
		// on cr�� une 'instance'
		Demenagement dem = new Demenagement("Entreprise bretonne",9);
		
		// on apelle la m�thode d'instance 'auTravail()'
		dem.auTravail(34);
	}
}