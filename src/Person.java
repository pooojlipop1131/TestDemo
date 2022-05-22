
public class Person {
	private String _name;
	
	//creating an object for the telephonenum class
	// Classname objectname = new classname();
	TelephoneNumber mytelephone = new TelephoneNumber();
	
	public String getName() {
		return _name;
	}
	
	// you can call object and call methods from the other class like this.
	// object.methodname();
	public String getTelephoneNumber(){
		return mytelephone.getTelephoneNumber();
	}
}
