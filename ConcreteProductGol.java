package factorymethod;

/*
 * Seta os atributos do carro
 */

public class ConcreteProductGol extends Car {

	public ConcreteProductGol() {
		 this.setModel("Gol");
		 this.setFactory("Volks");
		 this.setCategory("Hatch");
		 this.showInformation();
	}
}
