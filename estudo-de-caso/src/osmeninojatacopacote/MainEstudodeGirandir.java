package osmeninojatacopacote;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEstudodeGirandir {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		int i = 0;
		int op;
		ArrayList<Equipamento> estoque = new ArrayList<>();
		do {

			System.out.println("");
			System.out.println("*****SISTEMA DE CADASTRO DE EQUIPAMENTOS ELETRÔNICOS*****");

			System.out.println("Escolha uma Opcao");
			System.out.println("Digite 1 para Cadastrar Equipamento no Sistema");
			System.out.println("Digite 2 para Visualizar os Equipamentos ja cadastrados");
			System.out.println("Digite 3 para Deletar um Equipamento do Sistema");
			System.out.println("Digite 4 para Alterar valores");
			System.out.println("Digite 0 para Finalizar o programa");
			System.out.println("");
			String opcao = leitura.nextLine();
			op = Integer.valueOf(opcao);

			switch (op) {

			case 1:
				//provavelmente teremos de mudar a ordem para ajeitar a verificação, ex: codigo 1°
				Equipamento equipamento1 = new Equipamento();
				System.out.println("Digite o nome do produto: ");
				String nomedoequipamento = leitura.nextLine();
				equipamento1.setNome(nomedoequipamento);
				//verificação se tiver a mesma marca?
				
				System.out.println("Digite o numero de serie do produto: ");
				String numseriedoequipamento = leitura.nextLine();
				int numseriedoequipamento1 = Integer.valueOf(numseriedoequipamento);
				equipamento1.setNumerodeserie(numseriedoequipamento1);
				//verificação se tiver o mesmo nome e marca?
				
				System.out.println("Digite o codigo do produto: ");
				String codigodoequipamento = leitura.nextLine();
				int codigodoequipamento1 = Integer.valueOf(codigodoequipamento);
				equipamento1.setCodigo(codigodoequipamento1);
				for (Equipamento equipamento : estoque) {
					if (codigodoequipamento1==(equipamento.getCodigo())) {
						System.out.println("Codigo ja utilizado, digite outro");
						//falta terminar a verificação
					}
				}

				System.out.println("Digite a marca: ");
				String marcadoequipamento = leitura.nextLine();
				equipamento1.setMarca(marcadoequipamento);
				
				System.out.println("Digite o preco do produto: ");
				String precodoequipamento = leitura.nextLine();
				long precodoequipamento1 = Long.valueOf(precodoequipamento);
				equipamento1.setPreco(precodoequipamento1);

				System.out.println("Digite a data de fabricacao do produto: ");
				String datafabdoequipamento = leitura.nextLine();
				equipamento1.setDatafab(datafabdoequipamento);
				estoque.add(equipamento1);
				break;

			case 2:
				System.out.println("***lista de equipamentos***");
				for (Equipamento equipamento : estoque) {
					System.out.println(equipamento.getNome());
					System.out.println(equipamento.getNumerodeserie());
					System.out.println(equipamento.getCodigo());
					System.out.println(equipamento.getMarca());
					System.out.println(equipamento.getPreco());
					System.out.println(equipamento.getDatafab());
					System.out.println("");
				}
				break;

			case 3:
				System.out.println("***Digite o codigo do equipamento para Exclusao***");
				Integer codigoparadeletar = Integer.valueOf(leitura.nextLine());
				for (Equipamento equipamento : estoque) {
					if (codigoparadeletar.equals(equipamento.getCodigo())){
						estoque.remove(equipamento);
						System.out.println("Equipamento encontrado e deletado");
						break;
					}
					else {
						System.out.println("Equipamento nao encontrado");
						break;
					}
				}
				System.out.println("");
				break;
				
			case 4:
				break;
			}
		} while (op != 0);
		System.out.println("Fim do Programa");
	}
}
