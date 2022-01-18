public class MonApplication9 {

	public static void main (String arg []) {
		System.out.println("Bienvenue dans mon application de gestion ressource humaines");
		
		String employe1 = "Yves";
		
		int salaire;
		
		ServicePaye servicePaye1;
		
		servicePaye1= new ServicePaye();                              // instanciation class = créaction objet mémoire 
		
		salaire = servicePaye1.calculerSalaire(employe1);              // utilisation du savoir-faire de l'objet
		
		System.out.println(employe1 + "a un salaire de " + salaire);
	
	}
}
	
		