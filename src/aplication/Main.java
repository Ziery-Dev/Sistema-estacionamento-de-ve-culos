package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Estacionamento;
import entities.Moto;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		

		//Intancia da classe estacionamento 
		Estacionamento estacionamento = new Estacionamento();
		
		
		//inserindo iformações
		System.out.println("Deseja cadastrar um novo veículo? S/N");
		char comando = sc.next().toUpperCase().charAt(0);
		
		while(comando == 'S') {
			System.out.println("Insira o modelo do veiculo");
			sc.nextLine();
			String modelo = sc.nextLine();
			
			System.out.println("Insira o numero da placa");
			int placa = sc.nextInt();
			
			System.out.println("Insira o ano de fabricação");
			Date ano = sdf.parse(sc.next()); 
			
			//selecionar carro ou moto
			System.out.println("O veículo se trata de um carro ou moto? (C / M) ");
			char carOuMoto = sc.next().toUpperCase().charAt(0);
			
			if(carOuMoto == 'M') { //se  a escolha for moto
				System.out.println("Insira a quantidade de cilindradas da moto");
				int cilindradas = sc.nextInt();
				//aqui é a instacia da classe moto, onde os dados são passado como parâmetro
				Moto moto = new Moto( placa, modelo, ano, cilindradas);
				
				//chamado da função que adiciona as informações da moto à lista passando a instancia da classe moto criada
				estacionamento.adicionarVeiculo(moto);
				
				System.out.println("Deseja cadastrar um novo veículo? S/N");
				comando = sc.next().toUpperCase().charAt(0);
			}
			
			
		}
		
		
		//exição da lista de veículos e taxa total de estacionamento
		estacionamento.exibirVeiculos();
		System.out.println("Taxa total de estacionamento dos veículos: " + estacionamento.totalEstac());
		
		
		System.err.println("Programa encerrado!");

		sc.close();
	}

}
