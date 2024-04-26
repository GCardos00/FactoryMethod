package factorymethod;

/*
 * Define todos os geters e seters
 */
public abstract class Car {

	private String model;
	private String factory;
	private String category;
	
	public void showInformation() {
		System.out.println("Model:"+ this.getModel()+ "\n Factory: " + this.getFactory() + "\n Category: " + this.getCategory());
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getFactory() {
		return factory;
	}
	
	public void setFactory(String factory) {
		this.factory = factory;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
}
