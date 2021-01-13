package testsmano;

import orange.Orange;
import orange.Panier;

public class testPanier {

	public static void main(String[] args) {
		
		
		try {
			Panier b = new Panier();
			b.add(new Orange(0.80, "France"));
System.out.println(b); // u nseul element : france
			b.add(new Orange(0.80, "Espagne"));
			b.add(new Orange(0.90, "Floride"));
			System.out.println(b); // 3elements : france espagne floride
			
			b.boycottOrigin("Espagne");
			System.out.println(b);

			b.add(new Orange(0.80, "Espagne"));
			System.out.println(b);

			b.retireLastOrange();
			System.out.println(b);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("--------------------;--------");	
		System.out.println();
		try {
			Panier c = new Panier();
			c.add(new Orange(0.80, "France"));
			c.add(new Orange(0.80, "Espagne"));
			c.add(new Orange(0.90, "Floride"));
			
			Panier d = new Panier();
			d.add(new Orange(0.80, "France"));
			d.add(new Orange(0.80, "Espagne"));
			d.add(new Orange(0.90, "Floride"));
			
			Panier e = new Panier();
			e.add(new Orange(0.80, "France"));
			e.add(new Orange(0.80, "Espagne"));
			e.add(new Orange(0.90, "Floride"));
			e.add(new Orange(0.90, "Floride"));

			System.out.println("attendu:panier c==panier d mais panier e différent");
			
			c.toString();
			d.toString();
			if (c.equals(d)) System.out.println("panier c = panier d");
			else System.out.println("panier c différent de panier d");
			e.toString();
			if (c.equals(e)) System.out.println("panier c = panier e");
			else System.out.println("panier c différent de panier e");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
