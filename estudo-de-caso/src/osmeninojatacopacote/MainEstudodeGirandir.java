package osmeninojatacopacote;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEstudodeGirandir {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		int i=0;
		int op;
		ArrayList<Equipamento> estoque = new ArrayList<>();
		do {

			
			System.out.println("");
		    System.out.println("*****SISTEMA DE CADASTRO DE EQUIPAMENTOS ELETRÔNICOS*****");

			System.out.println("Escolha uma Opcao");
			System.out.println("Digite 1 para Cadastrar Equipamento no Sistema");
			System.out.println("Digite 2 para Visualizar os Equipamentos ja cadastrados");
			System.out.println("Digite 3 para Deletar um Equipamento do Sistema");
			System.out.println("Digite 4 para Encerrar o Programa");
			System.out.println("");
			String opcao = leitura.nextLine();
			op = Integer.valueOf(opcao);

			switch(op) {
			
			case 1:
				Equipamento equipamento1 = new Equipamento();
				System.out.println("Digite o nome do produto: ");
				String nomedoequipamento = leitura.nextLine();
				equipamento1.setNome(nomedoequipamento);
				System.out.println("Digite o codigo do produto: ");
				
				
				System.out.println("Digite a marca: ");
				String marcadoequipamento = leitura.nextLine();
				equipamento1.setMarca(marcadoequipamento);
				System.out.println("Digite o preco do produto: ");
		        Long precodoequipamento = leitura.nextLine();
				equipamento1.setPreco(precodoequipamento);
				System.out.println("Digite a data de fabricacao do produto: ");
				
				System.out.println("Digite o numero de serie do produto: ");
				
				estoque.add(equipamento1);
				break;
				
			case 2:
			System.out.println("***lista de equipamentos***");
				for (Equipamento equipamento : estoque) {
					System.out.println(equipamento.getNome());
				}
				break;

			case 3:
				//estoque.remove(equipamento);
				System.out.println("***Digite o codigo do equipamento para Exclusao***");
				break;
			}
			
		}while(op!=4);
		System.out.println("Fim do Programa");
	}
}
