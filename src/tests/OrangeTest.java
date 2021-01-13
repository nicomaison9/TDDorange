package tests;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.junit.Test;

import orange.Orange;
import orange.Panier;

public class OrangeTest {

	@Test
	public void testEgalitéOrange() {
		try {
		Orange o1=new Orange(0.80, "Espagne");
		Orange o2=new Orange(0.80, "Espagne");
		Orange o3=new Orange(0.10, "floride");
		assertTrue(o1.equals(o2));
		assertFalse(o1.equals(o3));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
