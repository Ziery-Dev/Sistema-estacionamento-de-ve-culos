package entities;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
	private List <Veiculo> lista = new ArrayList<>();
	
	//construtor 
	public Estacionamento() {
		
	}
	
	//get
	public List<Veiculo> getLista() {
		return lista;
	}
	
    public void adicionarVeiculo(Veiculo v) {
    	lista.add(v);
    }
	
	public void exibirVeiculos(){
		int contador = 01;
		 for(Veiculo v : lista) {
			 System.out.println("Veículo #"+contador++);
			 v.exibirDetalhes();
			 System.out.println();
		 }
	}
	
	public double totalEstac() {
		double total = 0;
		 for(Veiculo v : lista) {
			total = v.cacularTaxa();
		 }
		 return total;
	}
	
	
	
	
	
}
