package com.sparadrap.app.test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sparadrap.app.exception.PharmaException;
import com.sparadrap.app.model.Client;

public class StringTest {
	private String stringTest;
	
	@BeforeEach
	public void initTestEnvironment() throws PharmaException {
		// cette méthode est exécutée avant chaque test
		stringTest = new Client(
				"TEST1", 
				"test1", 
				0, 
				null,
				0, 
				null, 
				0, 
				null, 
				null, 
				null
			).getNom();
	}

	@AfterEach
	public void destroyTestEnvironment() {
		// cette méthode est exécutée après chaque test
		stringTest = null;
	}
	
	@Test
	public void stringThrowsExceptionSiPasUpperCase() throws Exception {
		
		String majuscule = stringTest.toUpperCase();
		
		assertEquals(stringTest, majuscule);
	}
}
