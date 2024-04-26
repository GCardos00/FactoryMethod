package factorymethod;

/*
 * Seta os atributos do carro
 */
public class ConcreteProductPalio extends Car{
	
	public ConcreteProductPalio() {
		
		this.setModel("Palio");
		this.setFactory("Fiat");
		this.setCategory("Hatch");
		this.showInformation();
		
	}

}
