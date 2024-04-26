package factorymethod;

/*
 * Cria a ligação do Car com a factoryMethod
 */

public abstract class CarCreator {

	public void buildCar() {
		Car carro = factoryMethod();
	}
	
	protected abstract Car factoryMethod();
}
