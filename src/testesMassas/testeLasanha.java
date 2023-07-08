package testesMassas;

import java.util.ArrayList;

import entities.Ingrediente;
import entities.Lasanha;

public class testeLasanha {

	public static void main(String[] args) {
	
	Ingrediente ingrediente1 = new Ingrediente("Molho de tomate", 5);
	Ingrediente ingrediente2 = new Ingrediente("Carne moida", 20);
	
	ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();

	ingredientes.add(ingrediente1);
	ingredientes.add(ingrediente2);
	Lasanha l1 = new Lasanha("Bolonhesa",ingredientes);
	
	System.out.println(l1);
	
	}
	
}
