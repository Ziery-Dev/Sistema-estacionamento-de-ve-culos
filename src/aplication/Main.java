package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.CadException;
import entities.Carro;
import entities.Estacionamento;
import entities.Moto;

public class Main {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		

		//Intancia da classe estacionamento 
		Estacionamento estacionamento = new Estacionamento();
		
		
		try {
			//inserindo iformações
			System.out.println("Deseja cadastrar um novo veículo? S/N");
			char comando = sc.next().toUpperCase().charAt(0);
			
			if (comando != 'S'&& comando != 'N' ) {
				estacionamento.erroIniciarCad();
			}
			
			
			while(comando == 'S') { //se escolher sim, realiza o cadastro de um novo veiculo
				System.out.println("Insira o modelo do veiculo: ");
				sc.nextLine();
				String modelo = sc.nextLine();
				
				System.out.println("Insira o numero da placa: ");
				String placa = sc.next();
				
				System.out.println("Insira o ano de fabricação: ");
				Date ano = sdf.parse(sc.next()); 
				
				//selecionar carro ou moto
				System.out.println("O veículo se trata de um carro ou moto? (C / M) ");
				char carOuMoto = sc.next().toUpperCase().charAt(0);
				
				if(carOuMoto == 'M') { //se  a escolha for moto
					System.out.println("Insira a quantidade de cilindradas da moto: ");
					int cilindradas = sc.nextInt();
					//aqui é a instacia da classe moto, onde os dados são passado como parâmetro
					Moto moto = new Moto( placa, modelo, ano, cilindradas);
					
					//chamado da função que adiciona as informações da moto à lista passando a instancia da classe moto criada
					estacionamento.adicionarVeiculo(moto);
					
					
					
					System.out.println();
					System.out.println("Dados do veículo cadastrado: ");
					moto.exibirDetalhes();
					System.out.println();
					
					
				}
				else if(carOuMoto == 'C') { //se  a escolha for Carro
					System.out.println("Insira a quantidade de cavalos de potência");
					int cavalos = sc.nextInt();
					//aqui é a instacia da classe moto, onde os dados são passado como parâmetro
					Carro carro = new Carro( placa, modelo, ano, cavalos);
					
					//chamado da função que adiciona as informações da moto à lista passando a instancia da classe moto criada
					estacionamento.adicionarVeiculo(carro);
					
					//exibe os dados somente do carro atual cadastrada
			
					System.out.println();
					System.out.println("Dados do veículo cadastrado ");
					carro.exibirDetalhes();
					System.out.println();
				}
				else {
					estacionamento.erroIniciarCad();
				}
			
				//pede novamente se o usuário deseja cadastrar outro veículo ou finalizar
				System.out.println("Deseja cadastrar um novo veículo? S/N");
				comando = sc.next().toUpperCase().charAt(0);
				if (comando != 'S'&& comando != 'N' ) {
					estacionamento.erroIniciarCad();
				}
				
			}
			//exibição da lista de veículos e taxa total de estacionamento
			estacionamento.exibirVeiculos();
			System.out.println("Taxa total de estacionamento dos veículos: " + String.format("%.2f",  estacionamento.totalEstac()));
			
			System.out.println("Programa encerrado!");
			
		}
		catch(ParseException e) { //se o usuário inserir uma data errada
			System.out.println("Formato de data inválido");
		}
		catch(CadException e) {
			System.out.println("Erro no cadastrado: " + e.getMessage());
		}
		
		
		
	
		

		sc.close();
	}

}
