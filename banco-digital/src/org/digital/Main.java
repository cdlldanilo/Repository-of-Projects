package org.digital;

public class Main {

	public static void main(String[] args) {
		
		Cliente danilo = new Cliente();
		danilo.setNome("Danilo");
		danilo.setIdade(40);
		
		
		
		Conta cc = new ContaCorrente(danilo);
		Conta poupanca = new ContaPoupanca(danilo);
		
		cc.depositar(100);		
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		cc.verificarIdade(danilo.getIdade());
		poupanca.imprimirExtrato();
		poupanca.verificarIdade(danilo.getIdade());
		

	}

}
