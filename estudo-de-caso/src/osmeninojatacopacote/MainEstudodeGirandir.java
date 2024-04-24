package osmeninojatacopacote;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEstudodeGirandir {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		int i=0;
		int op;
		do {
			ArrayList<Equipamento> estoque = new ArrayList<>();
			
			System.out.println("Escolha uma Opcao");
			System.out.println("Digite 1 para Cadastrar Equipamento no Sistema");
			System.out.println("Digite 2 para Visualizar os Equipamentos ja cadastrados");
			System.out.println("Digite 3 para Deletar um Equipamento do Sistema");
			System.out.println("Digite 0 para Encerrar o Programa");
			String opcao = leitura.nextLine();
			op = Integer.valueOf(opcao);
			
			switch(op) {
			
			case 1:
				System.out.println("Digite um código para o Equipamento");
			case 2:
				System.out.println("Digite o Código do Equipamento");
			case 3:
				System.out.println("***Lista de Equipamentos***");
			case 4:
			}
			
		}while(op!=0);
		System.out.println("Fim do Programa");
	}
}
