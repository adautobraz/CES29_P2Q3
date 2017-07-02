package reflection;

public class StudentController extends Controller {
	
	Student student = (Student) model; 
	
	public StudentController(Model model, View view) {
		super(model, view);
	}

	public void setPersonRollNo(String rollNo) {
		student.setRollNo(rollNo);
	}

	public String getPersonRollNo() {
		return student.getRollNo();
	}

	public void updateView(){
		view.printDetails("Student", student.getName(), student.getRollNo(), "RollID" );
	}
;
}