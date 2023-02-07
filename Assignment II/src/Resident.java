
public class Resident {

	private String name = null;
	private String birthDate = null;
	
	public Resident(String residentName, String residentDate) {
		setName(residentName);
		setBirthDate(residentDate);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if (name != null && name.length() > 0) {
			this.name = name;
		}
	}
	
	public String getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(String birthDate) {
		if (birthDate != null && birthDate.length() > 0) {
			this.birthDate = birthDate;
		}
	}
	
	public void printResident() {
		System.out.println("Resident name: " + name + " BirthDate: " + birthDate);
	}

}
