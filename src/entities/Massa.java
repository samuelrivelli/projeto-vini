package entities;

import java.util.ArrayList;

public abstract class Massa {
	private String sabor;
	private ArrayList<Ingrediente> listaIngredientes = new ArrayList<Ingrediente>();
	private static int contador = 0;
    private String codigo;
    
	
	public Massa(String sabor, ArrayList<Ingrediente> listaIngredientes) {
		this.sabor = sabor;
		this.listaIngredientes = listaIngredientes;
		contador++;
		this.codigo = getCodigoLetra() + contador;
		
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public ArrayList<Ingrediente> getListaIngredientes() {
	    return new ArrayList<>(listaIngredientes);
	}
	
	public static int getQuantidadeMassas() {
		return contador;
	}

	public void setListaIngredientes(ArrayList<Ingrediente> listaIngredientes) {
		this.listaIngredientes = listaIngredientes;
	}
	
	public String getCodigo() {
		return this.codigo;
	}
	
	public abstract String getCodigoLetra();
	
	public void addIngrediente(Ingrediente ingrediente) {
		listaIngredientes.add(ingrediente);
	}
	
	public void removeIngrediente(Ingrediente ingrediente) {
		listaIngredientes.remove(ingrediente);
	}
	
	public boolean verificaIngrediente(Ingrediente ingrediente) {
		if(listaIngredientes.contains(ingrediente)) {
			return true;
		}
		return false;
	}
	
	public abstract double calculaPreco();
	
	public abstract String getDescricao();
	
	
}
