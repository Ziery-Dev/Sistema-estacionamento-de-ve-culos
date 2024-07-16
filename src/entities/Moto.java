package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Moto extends Veiculo{
	private int cilindradas;
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
	
	//construtor
	public Moto(int placa, String modelo, Date ano, int cilindradas) {
		super(placa, modelo, ano);
		this.cilindradas = cilindradas;
	}

	
	//getters e setters
	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	//metodos 
	//a taxa é calculada de acordo com as cilindradas da moto mutiplicado por 1.5
	@Override
	public  double cacularTaxa() {
		return 1.5 * cilindradas;
		
	};
	
	@Override
	public  void exibirDetalhes() {
		System.out.println("Modelo: " + modelo + "\nPlaca: " + placa + "\nAno de fabricação: " + sdf.format(ano));
	};
	
	
	
	
}
