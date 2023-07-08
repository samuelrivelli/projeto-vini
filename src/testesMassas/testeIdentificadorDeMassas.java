package testesMassas;

import java.util.ArrayList;

import entities.Ingrediente;
import entities.Lasanha;
import entities.Pizza;

public class testeIdentificadorDeMassas {

	public static void main(String[] args) {
		
		Ingrediente ingrediente1 = new Ingrediente("Molho de tomate", 5);
		Ingrediente ingrediente2 = new Ingrediente("Carne moida", 20);
		
		ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();

		ingredientes.add(ingrediente1);
		ingredientes.add(ingrediente2);
		Lasanha l1 = new Lasanha("Bolonhesa",ingredientes);
		
		Pizza p1 = new Pizza("Mista", ingredientes);
		
		System.out.println(l1.getDescricao());
		System.out.println();
		System.out.println(p1.getDescricao());

	}

}
