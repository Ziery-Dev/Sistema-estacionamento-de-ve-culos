package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Veiculo {
	protected String placa;
	protected String modelo;
	protected Date ano;
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
	
	//construtor
	public Veiculo(String placa, String modelo, Date ano) {
		this.placa = placa;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	
	//getters e setters
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Date getAno() {
		return ano;
	}

	public void setAno(Date ano) {
		this.ano = ano;
	}
	
	//metodos 
	public abstract double cacularTaxa();
	
	public abstract void exibirDetalhes();
	
}
