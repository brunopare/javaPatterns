package br.com.aragy.patterns.factoryMethod;

public class InstitutionalPlan extends Plan {

	//ao chamar a classe pai o m�todo utilizado � o da classe filho 
	//@Overrride 
	
	void getRate() {
		//o rate vem da classe pai Plan
		rate = 5.50; 

	}
	

}
