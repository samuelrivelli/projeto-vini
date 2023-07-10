package entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class CarrinhoCompras {

	private String nomeCliente;
	private ArrayList<Massa> listaMassas = new ArrayList<Massa>();
	private static int contador = 0;
	private String codigoIdentificador;

	public CarrinhoCompras(String nomeCliente, ArrayList<Massa> listaMassas) {
		this.nomeCliente = nomeCliente;
		this.setListaMassas(listaMassas);
		contador++;
		this.codigoIdentificador ="Cliente "+ contador;
	}

	public String getNomeCliente() {
		return new String(this.nomeCliente);
	}

	public void setCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public ArrayList<Massa> getListaMassas() {
		return listaMassas;
	}

	public void setListaMassas(ArrayList<Massa> listaMassas) {
		this.listaMassas = listaMassas;
	}

	public double calculaValorCarrinho() {
		double valorCarrinho = 0;

		for (Massa massa : listaMassas) {
			valorCarrinho += massa.calculaPreco();
		}

		return valorCarrinho;

	}

	public void relatorioCarrinho_IngredientesPorOrdemAlfabetica() {
		for (Massa massa : getListaMassas()) {
			System.out.println(massa);
		}

	}

	public void relatorioCarrinho_IngredientesPorPreco() {
		for (Massa massa : getListaMassas()) {
			System.out.println(massa.toStringPorPreco());
		}
	}

	public int getQuantidadeItens() {
		return listaMassas.size();
	}
	
	public void getCategoria() {
		if(this.calculaValorCarrinho()>3000) {
			Map<String,String> categoria = new HashMap<>();
			categoria.put(codigoIdentificador, "Categoria A");
			System.out.println(categoria);
		}
		else if(this.calculaValorCarrinho()>1000 && this.calculaValorCarrinho()<3000){
			Map<String,String> categoria = new HashMap<>();
			categoria.put(codigoIdentificador, "Categoria B");
			System.out.println(categoria);
		}
		else {
			Map<String,String> categoria = new HashMap<>();
			categoria.put(codigoIdentificador, "Categoria C");
			System.out.println(categoria);
		}
	}

}
