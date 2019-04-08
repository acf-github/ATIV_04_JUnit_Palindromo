package com.palindromo.test;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.palindromo.domain.Palindromo;

public class PalindromoTest {
	
	private Palindromo palindromo;
	
	@Before
	public void before(){
		this.palindromo = new Palindromo();
	}
	
	@Test
	public void validaCerto1(){
		
		String value = "Ana";
		Assert.assertEquals(true, palindromo.isPalindromo(value));
	}

	@Test
	public void validaCerto2(){
		
		String value = "Arara";
		Assert.assertEquals(true, palindromo.isPalindromo(value));
	}

	@Test
	public void validaCerto3(){
		
		String value = "Ame o Poema";
		Assert.assertEquals(true, palindromo.isPalindromo(value));
	}

	@Test
	public void validaErrado(){
		
		String value = "Teste de Palindromo";
		Assert.assertEquals(true, palindromo.isPalindromo(value));
	}

	@Test
	public void validaErroVazio(){
		
		String value = "";
		Assert.assertEquals(true, palindromo.isPalindromo(value));
	}

	@Test
	public void validaErroNulo(){
		
		String value = null;
		Assert.assertEquals(true, palindromo.isPalindromo(value));
	}

}
