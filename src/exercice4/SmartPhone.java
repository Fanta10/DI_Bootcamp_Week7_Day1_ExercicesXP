package exercice4;

public class SmartPhone extends Computer{
	private int nombrePouce;
	
	
	
	public SmartPhone() {
		super.affiche();;
		// TODO Auto-generated constructor stub
	}


	public SmartPhone(int nombrePouce, String name, String marque, String model) {
		super(name, marque, model);
		// TODO Auto-generated constructor stub
	}


	public void methode() {
		System.out.println("je suis une classe fille et j'herite de la classe mere computer");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone monPhone = new SmartPhone();
		monPhone.methode();

	}

}
