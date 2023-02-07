package exercice2;

public class Person {
	//propriété
	private String name;
	private String lastName;
	private String email;
	private int age;
	
	//constructeur sans parametres
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//constructeur avec parametres
		public Person(String name, String lastName, String email, int age) {
			super();
			this.name = name;
			this.lastName = lastName;
			this.email = email;
			this.age = age;
		}
		
		//getters et setters
		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getLastName() {
			return lastName;
		}


		public void setLastName(String lastName) {
			this.lastName = lastName;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}
		
		
	@Override
		public String toString() {
			return "Person [name=" + name + ", lastName=" + lastName + ", email=" + email + ", age=" + age + "]";
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("John", "Wick", "john@wick.com", 55);
		System.out.println(person.toString());

	}
	

	
	
}
