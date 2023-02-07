package exercice3;

public class Vehicule {
	protected String model;
	protected int speed;
	//constructeur sans parametres
	public Vehicule() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//constructeur avec parametres
	public Vehicule(String model, int speed) {
		super();
		this.model = model;
		this.speed = speed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//getters et setters
	

}
