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
	
    
    //exibe a lista de veiculos, mostrando detalhes dos veiculos atraves do chamado do metodo exibir detalhes presente tanto na classe moto quanto na classe carro
	public void exibirVeiculos(){
		int contador = 01;
		 for(Veiculo v : lista) {
			 System.out.println("Veículo #"+contador++);
			 v.exibirDetalhes();
			 System.out.println();
		 }
	}
	
	//calcula o total de taxa de estacionamento somando todos os veiculos
	public double totalEstac() {
		double total = 0;
		 for(Veiculo v : lista) {
			total += v.cacularTaxa();
		 }
		 return total;
	}
	
	//excessão ao iniciar novo cadastro
	public void erroIniciarCad() throws CadException {
		throw new CadException("A resposta inserida é diferente do esperado!");
	}
	
	
	
}
