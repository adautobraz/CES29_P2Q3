package reflection;

public class View {
	public void printDetails(String personType, String personName, String fieldValue, String field) {
		System.out.println(personType + ": ");
		System.out.println("Name: " + personName);
		System.out.println(field + ": " + fieldValue);
	}

}