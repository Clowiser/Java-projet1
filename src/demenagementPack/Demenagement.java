package demenagementPack;



public class Demenagement {
	private String nom; // attributs
	private int capCamion;
	

	public Demenagement(String nom,int capCamion) { // constructeur/methode
		this.nom = nom;
		this.capCamion = capCamion;
		}
	

	public void auTravail(int nbCartons){
		System.out.println(nom + " poss�de un camion de capacit� : " + capCamion);
		System.out.println("D�but du d�m�nagement");

		
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
		
		System.out.println("Fin du d�m�nagement");
		
		
	};
	
	
	// 34 - capCamion = nbCartons � chaque voyage
	// emport = nbCartons � chaque voyage
	// tant que nbCartons <=9 alors on refait un voyage
	
	
}