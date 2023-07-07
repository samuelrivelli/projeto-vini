package entities;
import java.util.ArrayList;

public class Pizza {
	
	private String sabor;
	private double preco;
	private ArrayList<Ingrediente> listaIngredientes = new ArrayList<Ingrediente>();
	
	public Pizza(String sabor, ArrayList<Ingrediente> listaIngredientes) {
		super();
		this.sabor = sabor;
		this.listaIngredientes = listaIngredientes;
	}

	public double calculaPreco() {
		int numIngredientes = listaIngredientes.size();
        double valorTotal = 0;

        for (Ingrediente ingrediente : listaIngredientes) {
            valorTotal += ingrediente.getPreco();
        }

        if (numIngredientes == 2) {
            valorTotal += valorTotal * 0.1;
        } else if (numIngredientes == 3) {
            valorTotal += valorTotal * 0.2;
        }

        return valorTotal;
	}

	
	@Override
	public String toString() {
		return "Pizza de " + sabor + "\nPreço: " + this.calculaPreco() + "\nIngredientes: " + listaIngredientes;
	}
	
	
	
	
}
