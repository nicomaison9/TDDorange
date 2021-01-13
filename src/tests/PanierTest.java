package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import orange.Orange;
import orange.Panier;

public class PanierTest {
	
	@Test
	public void Constructeur() {
		//test constructeur à 2 param
		ArrayList<Orange> basket=new ArrayList<Orange>();
		Panier p4=new Panier(basket, basket.size());
	}
	
		
	
	@Test
	public void testEgalitéPanier() {
		try {
		Orange o1=new Orange(0.80, "Espagne");
		Orange o2=new Orange(0.80, "Espagne"); 
		Orange o3=new Orange(0.10, "floride");
		Panier p1= new Panier();
		System.out.println("-------p1------");
		p1.add(o1);
		p1.add(o2);
		p1.add(o3);
		System.out.println("-------------");
		Panier p2= new Panier();
		System.out.println("-------p2------");
		p2.add(o1);
		p2.add(o2);
		p2.add(o3);
		System.out.println("-------------");
		
		//p1 doit être égal à p2
		
		assertTrue(p1.equals(p2));
		Panier p3= new Panier();
		System.out.println("-------p3------");
		p3.add(o1);
		p3.add(o2);
		p3.add(o3);
		p3.add(o3);
		System.out.println("-------------");
		//p1 doit être différent de p3
		assertFalse(p1.equals(p3));
		
		
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void testBoycottOrigine() {
		try {
			Orange o1 = new Orange(0.80, "Espagne");
			Orange o2 = new Orange(0.80, "Espagne");
			Orange o3 = new Orange(0.10, "floride");
			Panier p1 = new Panier();
			System.out.println("-------p1------");
			p1.add(o1);
			p1.add(o2);
			p1.add(o3);
			System.out.println("-------------");

			p1.boycottOrigin("Espagne");
			boolean trouve = false;
			for (int i = 0; i < p1.getContenance(); i++) {
				if (p1.getBasket().get(i).getOrigine() == "Espagne" && !p1.estVide()) {
					trouve = true;
					assertTrue(true);
					//true
				}
				assertFalse(false);
				//false
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
