package demenagementPack;



public class Demenagement {
	private String nom; // attributs
	private int capCamion;
	

	public Demenagement(String nom,int capCamion) { // constructeur/methode
		this.nom = nom;
		this.capCamion = capCamion;
		}
	

	public void auTravail(int nbCartons){
		System.out.println(nom + " possède un camion de capacité : " + capCamion);
		System.out.println("Début du déménagement");

		
		int voyage = 0;
		int emport;
		
		while (nbCartons > 0){
			voyage++;
			if (nbCartons <= capCamion) {
				emport = nbCartons;
			}else{
				emport = capCamion;
			}
			System.out.println("nbCartons:" + nbCartons + " emport:" + emport +" capCamion:" + capCamion + " nbvoyage:" + voyage);
			nbCartons -= emport; // on commence le calcul de soustraction
			
			//if (i < capCamion){ // quand le calcul est avant l'affichage 
			//break;
			// affichait -2 donc il fallait stopper la boucle = break
		//}
		}
		
		System.out.println("Fin du déménagement");
		
		
	};
	
	
	// 34 - capCamion = nbCartons à chaque voyage
	// emport = nbCartons à chaque voyage
	// tant que nbCartons <=9 alors on refait un voyage
	
	
}