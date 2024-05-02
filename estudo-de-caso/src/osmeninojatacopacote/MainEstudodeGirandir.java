package osmeninojatacopacote;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEstudodeGirandir {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
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
				//verifica se o preço não é negativo

				System.out.println("Digite a data de fabricacao do produto: ");
				String datafabdoequipamento = leitura.nextLine();
				equipamento1.setDatafab(datafabdoequipamento);
				estoque.add(equipamento1);
				//não acho que precisa verificar data
				break;

			case 2:
				//provavelmente vamo mudar a ordem da apresentação, codigo é +importante qNumerodSerie
				System.out.println("***lista de equipamentos***");
				for (Equipamento equipamento : estoque) {
					System.out.println("Nome: "+equipamento.getNome());
					System.out.println("Numero de Serie: "+equipamento.getNumerodeserie());
					System.out.println("Codigo: "+equipamento.getCodigo());
					System.out.println("Marca: "+equipamento.getMarca());
					System.out.println("Preço: R$"+equipamento.getPreco());
					System.out.println("Data de Fabricacao"+equipamento.getDatafab());
					System.out.println("");
				}
				break;

			case 3:
			    System.out.println("***Digite o código do equipamento para Exclusão***");
			    Integer codigoParaDeletar = Integer.valueOf(leitura.nextLine());
			    boolean EquipamentoEncontrado = false;
			    for (Equipamento equipamento : estoque) {
			        if (codigoParaDeletar.equals(equipamento.getCodigo())) {
			            estoque.remove(equipamento);
			            EquipamentoEncontrado = true;
			            break;
			        }
			    }
			    if (EquipamentoEncontrado==true) {
			        System.out.println("Equipamento removido com sucesso!");
			    } else {
			        System.out.println("Equipamento não encontrado.");
			    }
			    System.out.println("");
			    break;

				
			case 4:
				//aqui vai o baguio de alterar valores
				break;
			}
		} while (op != 0);
		System.out.println("Fim do Programa");
	}
}
