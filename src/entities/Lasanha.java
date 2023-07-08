package entities;

import java.util.ArrayList;

public class Lasanha extends Massa {

	public Lasanha(String sabor, ArrayList<Ingrediente> listaIngredientes) {
		super(sabor, listaIngredientes);
		
	}

	@Override
	public String getCodigoLetra() {
		return "L";
	}

	@Override
	public double calculaPreco() {
		double valorLasanha = 0;
		
		for(Ingrediente ingrediente : getListaIngredientes()) {
			valorLasanha += ingrediente.getPreco();
		}
		
		return valorLasanha;
	}
	
	@Override
	public String getDescricao() {
		return "Isso é uma lasanha";
	}
	
	@Override
	public String toString() {
		return "Lasanha de " + getSabor() + "\nPreço: " + this.calculaPreco() + "\nIngredientes: " + getListaIngredientes() + "\nCodigo: " + getCodigo()
		;
	}
	
}
