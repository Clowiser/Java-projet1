package demenagementPack ;

public class Demenagement {
	private String nom; // attributs
	private int capCamion;
	

	public Demenagement(String nom,int capCamion) { // constructeur/methode
		this.nom = nom;
		this.capCamion = capCamion;
		}
	

	public void auTravail(int i){
		System.out.println(nom + " poss�de un camion de capacit� : " + capCamion);
		System.out.println("D�but du d�m�nagement");
		//System.out.println("nbCartons:" + i + " capCamion:" + capCamion);
		
		int voyage = 0;
		
		
		while (i > 0){
			voyage++;
			if (i <= 9) {
				System.out.println("emport :" + i);
			}else{
				System.out.println("emport :" + capCamion);
			}
			System.out.println("nbCartons:" + i + " capCamion:" + capCamion + " nbvoyage:" + voyage);
			i -= capCamion; // on commence le calcul de soustraction
			
			
			
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