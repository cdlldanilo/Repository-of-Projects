package com.everis.steps;

import com.everis.pages.ResultadoPesquisaPage;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;

public class ResultadoPesquisaSteps {

	@Quando("^adiciona o produto \"(.*)\" ao carrinho$")
	public void adicionarProdutoAoCarrinho(String nomeProduto) {
		ResultadoPesquisaPage resultadoPesquisaPage = new ResultadoPesquisaPage();
		resultadoPesquisaPage.adicionarProdutoAoCarrinho(nomeProduto);
	}
	
	@E("^acessa o produto \"(.*)\"$")
	public void acessarProduto(String nomeProduto)  {
		ResultadoPesquisaPage resultadoPesquisaPage = new ResultadoPesquisaPage();
		resultadoPesquisaPage.acessarProduto(nomeProduto);
	}
	
	@E("^inclua o produto \"(.*)\" no carrinho$")
	public void incluirProdutoNoCarrinho(String nomeProduto) {
		ResultadoPesquisaPage resultadoPesquisaPage = new ResultadoPesquisaPage();
		resultadoPesquisaPage.incluirProdutoNoCarrinho(nomeProduto);
	}
	
	@E("^acessa o checkout$")
	public void acessarCheckout() {
		ResultadoPesquisaPage resultadoPesquisaPage = new ResultadoPesquisaPage();
		resultadoPesquisaPage.acessarCheckout();
	}
	
	@E("^confirma o endereco de entrega$")
	public void confirmarEnderecoDeEntrega() {
		ResultadoPesquisaPage resultadoPesquisaPage = new ResultadoPesquisaPage();
		resultadoPesquisaPage.confirmarEnderecoDeEntrega();
	}
	
	@E("^escolhe a forma de transporte$")
	public void escolherFormaDeTransporte() {
		ResultadoPesquisaPage resultadoPesquisaPage = new ResultadoPesquisaPage();
		resultadoPesquisaPage.escolherFormaDeTransporte();
	}
	
	@Quando("^o pagamento for confirmado$")
	public void pagarForConfirmado() {
		ResultadoPesquisaPage resultadoPesquisaPage = new ResultadoPesquisaPage();
		resultadoPesquisaPage.pagarForConfirmado();
	}
}