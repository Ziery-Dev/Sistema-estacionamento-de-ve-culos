package entities;

import java.util.Date;

public class Carro  extends Veiculo{
	private int cavPotencia;
	
	//construtor
	public Carro(String placa, String modelo, Date ano, int cavPotencia ) {
		super(placa, modelo, ano);
		this.cavPotencia = cavPotencia;
	}
	
	
	//get e set
	public int getCavPotencia() {
		return cavPotencia;
	}


	public void setCavPotencia(int cavPotencia) {
		this.cavPotencia = cavPotencia;
	}




	//metodos
	@Override
	public double cacularTaxa() {
		return cavPotencia * 1.2;
	}


	@Override
	public void exibirDetalhes() {
		System.out.println("Tipo de veículo: Carro " + "\nModelo: " + modelo + "\nPlaca: " + placa + "\nAno de fabricação: " + sdf.format(ano) + "\nTaxa de estacionamento: "+ String.format("%.2f", cacularTaxa()));

	}


	
	
}
