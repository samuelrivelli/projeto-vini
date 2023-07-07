package testes;

import java.util.ArrayList;

import entities.Ingrediente;
import entities.Pizza;

public class TestePizza {

	public static void main(String[] args) {

		Ingrediente ingrediente1 = new Ingrediente("Molho de tomate", 5);
		Ingrediente ingrediente2 = new Ingrediente("Mussarela", 25);
		Ingrediente ingrediente3 = new Ingrediente("Calabresa", 20);

		ArrayList<Ingrediente> ingredientes1 = new ArrayList<Ingrediente>();

		ingredientes1.add(ingrediente1);
		ingredientes1.add(ingrediente2);
		ingredientes1.add(ingrediente3);

		ArrayList<Ingrediente> ingredientes2 = new ArrayList<Ingrediente>();
		ingredientes2.add(ingrediente2);

		ArrayList<Ingrediente> ingredientes3 = new ArrayList<Ingrediente>();
		ingredientes3.add(ingrediente2);
		ingredientes3.add(ingrediente3);

		Pizza pizza1 = new Pizza("Mista", ingredientes1);
		Pizza pizza2 = new Pizza("Mussarela", ingredientes2);
		Pizza pizza3 = new Pizza("Mussarela", ingredientes3);

		System.out.println(pizza1);
		System.out.println();
		System.out.println(pizza2);
		System.out.println();
		System.out.println(pizza3);

	}

}