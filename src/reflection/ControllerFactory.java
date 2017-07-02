package reflection;

import java.lang.reflect.InvocationTargetException;

public class ControllerFactory {
	public static Controller buildController(Model model, View view) throws IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
		Controller controller = null;
		try {
			Class<?> realFact = Class.forName(model.getClass().getName() + "Controller");
			controller = (Controller) realFact.getDeclaredConstructor(Model.class, View.class).newInstance(model, view);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return controller;
	}
}
	
