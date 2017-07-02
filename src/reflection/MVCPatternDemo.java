package reflection;

import java.lang.reflect.InvocationTargetException;

public class MVCPatternDemo {
	public static void main(String[] args) throws IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {

		// Create a view : to write student details on console
		View view = new View();
		Model student = retriveStudentFromDatabase();
		Model prof = retriveProfFromDatabase();

		
		Controller controllerS = ControllerFactory.buildController(student, view);
		Controller controllerP = ControllerFactory.buildController(prof, view);

		controllerS.updateView();

		// update model data
		controllerS.setModelName("John");
		controllerS.updateView();
		

		controllerP.updateView();
		controllerP.setModelName("Marcus");
		controllerP.updateView();

	}

	private static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}
	
	private static Professor retriveProfFromDatabase() {
		Professor prof = new Professor();
		prof.setName("Tom");
		prof.setprofID("12");
		return prof;
	}

}