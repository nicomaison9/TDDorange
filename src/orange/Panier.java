package orange;

import java.util.ArrayList;

public class Panier {
	private ArrayList<Orange> basket = new ArrayList<Orange>();
	private int contenance = basket.size();
	private final int CONTENANCEMAX = 20;

	public Panier(ArrayList<Orange> basket, int contenance) {
		super();
		this.basket = basket;
		this.contenance = contenance;
	}

	public Panier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Orange> getBasket() {
		return basket;
	}

	public int getContenance() {
		return contenance;
	}

	// ajoute une orange
	public void add(Orange orange) {
		if (!this.estPlein()) {
			this.basket.add(orange);
			this.contenance = this.basket.size();
			System.out.println("le panier n'est pas plein, on ajoute l'orange " + orange.toString());
		} else
			System.out.println("le panier est plein, on peut pas rajouter " + orange.toString());
	}

	// retire dernière Orange du panier
	public void retireLastOrange() throws Exception {
		if (this.estVide())
			throw new Exception("le panier est vide");
		else
			{this.basket.remove(contenance - 1);
			this.contenance = this.basket.size();
			}
	}

	public boolean estPlein() {
		if (this.contenance == CONTENANCEMAX)
			return true;
		else
			return false;
	}

	public boolean estVide() {
		if (this.contenance == 0)
			return true;
		else
			return false;
	}

	public void boycottOrigin(String origine) {
		for (int i = 0; i < basket.size(); i++) {
			if (basket.get(i).getOrigine() == origine && !estVide())
				{this.basket.remove(i);
				this.contenance = this.basket.size();}

		}
	}

	@Override
	public String toString() {
		String str="Panier [basket=\n";
		
		for (int i = 0; i < basket.size(); i++) {
			str= str + basket.get(i).toString()
					+ ", contenance=" + this.getContenance()+ ", max=" + this.getCONTENANCEMAX() + "]\n";

		}
		return str;

	}

	public int getCONTENANCEMAX() {
		return CONTENANCEMAX;
	}

	public void setBasket(ArrayList<Orange> basket) {
		this.basket = basket;
	}

	public void setContenance(int contenance) {
		this.contenance = contenance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + CONTENANCEMAX;
		result = prime * result + ((basket == null) ? 0 : basket.hashCode());
		result = prime * result + contenance;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Panier other = (Panier) obj;
		if (CONTENANCEMAX != other.CONTENANCEMAX)
			return false;
		if (basket == null) {
			if (other.basket != null)
				return false;
		} else if (!basket.equals(other.basket))
			return false;
		if (contenance != other.contenance)
			return false;
		return true;
	}

}
