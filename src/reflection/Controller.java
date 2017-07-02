package reflection;

public abstract class Controller {
	
	protected Model model;
	protected View view;

	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}

	public void setModelName(String name) {
		model.setName(name);
	}

	public String getPersonName() {
		return model.getName();
	}
	
	public abstract void updateView();

}
