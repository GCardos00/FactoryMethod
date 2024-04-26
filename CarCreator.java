package factorymethod;

/*
 * Cria a liga��o do Car com a factoryMethod
 */

public abstract class CarCreator {

	public void buildCar() {
		Car carro = factoryMethod();
	}
	
	protected abstract Car factoryMethod();
}
