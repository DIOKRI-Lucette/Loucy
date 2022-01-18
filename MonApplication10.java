public class MonApplication10{

	public static void main (String arg[]){
		System.out.println("bienvenue dans mon application de gestion ressources humaines");
		
		String employe1="yves";
		
		ServicePaye2 servicePaye2;
		
		servicePaye2=new ServicePaye2();              //Instanciation
		
	int salaire1 = servicePaye1.calculerSalaire (employe1); 
	
		System.out.println(employe1+"a un salaire de"+ salaire1);
	}
}