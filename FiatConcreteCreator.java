package factorymethod;

/*
 * Chama ConcreteProductPalio para cria��o de um exemplo para o creator
 */

public class FiatConcreteCreator extends CarCreator {
		
	    protected Car factoryMethod(){
	        return new ConcreteProductPalio();
	    }

}
