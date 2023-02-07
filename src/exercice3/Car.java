package exercice3;

public class Car extends Vehicule{
	//propriete
	private String name;
	//constructeur sans parametres
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	//constructeur avec parametres
	public Car(String name) {
		//super(model, speed);
		this.name = name;
	}
	
	
	//getters et setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	 // This function calls the Base class functions and appends the result with the input
	  public String getDetails(String carName) {
		return "NameCar : " + carName + " model : " + this.getModel() + " speed : " + this.getSpeed();
	        
		
	  }
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car("Roadster");
		myCar.setModel("Tesla");;
		myCar.setSpeed(100);
		System.out.println(myCar.getDetails("Roadster"));

	}

}
