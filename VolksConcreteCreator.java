package factorymethod;
 
/*
 * Chama ConcreteProductGol para cria��o de um exemplo para o creator
 */

public class VolksConcreteCreator extends CarCreator {
	
    protected Car factoryMethod(){
        return new ConcreteProductGol();
    }
    
}

