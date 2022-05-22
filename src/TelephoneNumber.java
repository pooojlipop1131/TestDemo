
public class TelephoneNumber {

	private String _areaCode;
	private String _number;
	
	public String getTelephoneNumber() {
		return ("(" + getAreaCode() + ") " + getNumber());
	}
	
	String getAreaCode() {
		return _areaCode;
	 }
	
	void setAreaCode(String arg) {
		 _areaCode = arg;
	}
	
	String getNumber() {
		return _number;
	 }
	
	void setNumber(String arg) {
		 _number = arg;
	}
}
