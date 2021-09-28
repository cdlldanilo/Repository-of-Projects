package com.everis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.everis.util.Hooks;

public class ResultadoPesquisaPage extends BasePage {

	@FindBy(xpath = "//*[text()='Add to cart']")
	protected WebElement botaoAdicionarAoCarrinho;
	
	@FindBy(css = "[title='Proceed to checkout']")
	protected WebElement botaoProsseguir;
	
	@FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]")
	protected WebElement botaoFinalizar;
	
	@FindBy(xpath = "//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]")
	protected WebElement botaoConfirmarFormaDeTransporte;
	
	@FindBy(xpath = "//span[normalize-space()='I confirm my order']")
	protected WebElement botaoConfirmarPagamento;
	
	public ResultadoPesquisaPage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}

	public void adicionarProdutoAoCarrinho(String nomeProduto) {
		WebElement nomeProdutoTela = driver.findElement(By.xpath(".//*[@itemprop='name']/*[contains(text(), '" + nomeProduto + "')] | .//*[@itemprop='name'][text()='" + nomeProduto + "']"));
		moveToElement(nomeProdutoTela);
		botaoAdicionarAoCarrinho.click();
		waitElement(botaoProsseguir, 10).click();
		log("Adicionou o produto [" + nomeProduto + "] ao carrinho");
	}

	public void acessarProduto(String nomeProduto) {
		WebElement tituloProduto = driver.findElement(By.xpath("//*[@title = '" + nomeProduto + "'][@class='product-name']"));
		tituloProduto.click();
		log("Acessou o produto: " + nomeProduto);
	}

	public void incluirProdutoNoCarrinho(String nomeProduto) {
		WebElement adicionarNoCarrinho = driver.findElement(By.xpath("//span[normalize-space()='Add to cart']"));
		adicionarNoCarrinho.click();		
		waitElement(botaoProsseguir, 10).click();			
		log("Adicionou o produto [" + nomeProduto + "] no carrinho");
		
	}

	public void acessarCheckout() {		
		WebElement selecionarCheckout = driver.findElement(By.xpath("//a[@title='View my shopping cart']"));
		selecionarCheckout.click();		
		waitElement(botaoFinalizar, 10).click();
	}

	public void confirmarEnderecoDeEntrega() {
		WebElement selecionarEnderecoEntrega = driver.findElement(By.xpath("//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]"));
		selecionarEnderecoEntrega.click();
	}

	public void escolherFormaDeTransporte() {
		WebElement escolherFormaParaTransportar = driver.findElement(By.xpath("//input[@name='cgv']"));
		escolherFormaParaTransportar.click();
		botaoConfirmarFormaDeTransporte.click();
	}

	public void pagarForConfirmado() {
		WebElement pagamentoConfirmado = driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
		pagamentoConfirmado.click();
		botaoConfirmarPagamento.click();
	}


}