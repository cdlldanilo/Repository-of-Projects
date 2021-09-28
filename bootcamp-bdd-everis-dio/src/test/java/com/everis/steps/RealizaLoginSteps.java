package com.everis.steps;

import com.everis.pages.RealizaLoginPage;

import io.cucumber.java.pt.E;

public class RealizaLoginSteps {

	@E("^realiza o login$")
	public void realizarLogin()  {
		RealizaLoginPage realizaLoginPage = new RealizaLoginPage();
		realizaLoginPage.realizarLogin();
	}
	
}