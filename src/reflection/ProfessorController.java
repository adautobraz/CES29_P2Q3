package reflection;

public class ProfessorController extends Controller {
	
	Professor professor = (Professor) model; 
	
	public ProfessorController(Model model, View view) {
		super(model, view);
	}

	public void setProfId(String profId) {
		professor.setprofID(profId);
	}

	public String getProfID() {
		return professor.getprofID();
	}

	public void updateView(){
		view.printDetails("Professor", professor.getName(), professor.getprofID(), "ProfID");
	}
;
}