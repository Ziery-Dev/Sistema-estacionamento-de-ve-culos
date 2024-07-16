# **Estacionamento de Veículos**
### **Descrição**
Este projeto é uma aplicação simples em Java que simula a gestão de um estacionamento de veículos. Ele permite cadastrar carros e motos, calcular taxas de estacionamento e exibir detalhes dos veículos cadastrados. O projeto é uma aplicação prática dos conceitos de orientação a objetos, incluindo herança, polimorfismo, encapsulamento e exceções personalizadas.

## **Estrutura do Projeto**
**O projeto é composto pelas seguintes classes:**

**Veiculo:** Classe abstrata que representa um veículo genérico. Possui os atributos comuns placa, modelo e ano, além dos métodos abstratos cacularTaxa e exibirDetalhes.

**Moto:** Subclasse de Veiculo que representa uma moto. Adiciona o atributo cilindradas e implementa os métodos abstratos.

**Carro:** Subclasse de Veiculo que representa um carro. Adiciona o atributo cavPotencia e implementa os métodos abstratos.

**Estacionamento:** Classe que gerencia a lista de veículos estacionados. Permite adicionar veículos, exibir detalhes dos veículos e calcular a taxa total de estacionamento.

**CadException:** Classe de exceção personalizada para tratar erros específicos no cadastro de veículos.

**Main:** Classe principal que contém o método main e gerencia a interação com o usuário.

## **Funcionalidades**
**Cadastrar Veículos:** O usuário pode cadastrar novos carros e motos informando o modelo, placa, ano de fabricação, e características específicas (cilindradas ou cavalos de potência).

**Exibir Detalhes:** Após o cadastro, os detalhes dos veículos são exibidos, incluindo a taxa de estacionamento calculada.

**Listar Veículos:** É possível listar todos os veículos cadastrados no estacionamento.

**Calcular Taxa Total:** O sistema calcula e exibe a taxa total de estacionamento para todos os veículos cadastrados.
