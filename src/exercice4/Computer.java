package exercice4;

public class Computer {
	
	protected String name = "macBook";
	protected String marque = "pro";
	protected String model = "mac";
	//
	public Computer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Computer(String name, String marque, String model) {
		super();
		this.name = name;
		this.marque = marque;
		this.model = model;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	//
	public void affiche() {
		System.out.println("model : " + this.getModel() + "\n marque : " + this.getMarque() + 
				"\n name : " + this.getName());
	}
	

}
