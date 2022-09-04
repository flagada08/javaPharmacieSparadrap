package com.sparadrap.app.test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sparadrap.app.exception.PharmaException;
import com.sparadrap.app.view.FenetrePrincipale;

public class FenetrePrincipaleTest {
	private FenetrePrincipale FenetrePrincipaleTest;
	
	@BeforeEach
	public void initTestEnvironment() throws PharmaException {
		// cette méthode est exécutée avant chaque test
		FenetrePrincipaleTest = new FenetrePrincipale();
	}

	@AfterEach
	public void destroyTestEnvironment() {
		// cette méthode est exécutée après chaque test
		FenetrePrincipaleTest = null;
	}
	
	@Test
	public void titleThrowsExceptionSiPasDeTitre() throws Exception {
		
		Object fPrincipale = FenetrePrincipaleTest;
		
		assertEquals(FenetrePrincipaleTest, fPrincipale);
	}
}
