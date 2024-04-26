package factorymethod;
/*
 * Mostra o escopo para os creators
 */
public class Client {

	public static void main(String[] args) {
		
		CarCreator creator1 = new FiatConcreteCreator();
		creator1.buildCar();
		
		CarCreator creator2 = new VolksConcreteCreator();
		creator2.buildCar();
	}
}
