package visao;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.Equipamento;

public class MainEstudodeGirandir {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		int op;
		boolean EquipamentoEncontrado;
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
				Equipamento equipamento1 = new Equipamento();
				System.out.println("Digite o codigo do produto: ");
				String codigodoequipamento = leitura.nextLine();
				int codigodoequipamento1 = Integer.valueOf(codigodoequipamento);
				equipamento1.setCodigo(codigodoequipamento1);
				for (Equipamento equipamento : estoque) {
					while (codigodoequipamento1 == (equipamento.getCodigo())) {
						System.out.println("Codigo ja utilizado, digite outro: ");
						String codigoequipamentoconf = leitura.nextLine();
						codigodoequipamento1 = Integer.valueOf(codigoequipamentoconf);
						equipamento1.setCodigo(codigodoequipamento1);
					}
				}

				System.out.println("Digite o numero de serie do produto: ");
				String numseriedoequipamento = leitura.nextLine();
				int numseriedoequipamento1 = Integer.valueOf(numseriedoequipamento);
				equipamento1.setNumerodeserie(numseriedoequipamento1);
				while (numseriedoequipamento1 < 0) {
					System.out.println("Numero de serie invalido, digite de novo: ");
					String numserieconferir = leitura.nextLine();
					numseriedoequipamento1 = Integer.valueOf(numserieconferir);
					equipamento1.setNumerodeserie(numseriedoequipamento1);
				}
				System.out.println("Digite o nome do produto: ");
				String nomedoequipamento = leitura.nextLine();
				equipamento1.setNome(nomedoequipamento);

				System.out.println("Digite a marca: ");
				String marcadoequipamento = leitura.nextLine();
				equipamento1.setMarca(marcadoequipamento);

				System.out.println("Data de fabricacao do produto (dd/mm/aa): ");
				System.out.println("Digite o Dia: ");
				String dd = leitura.nextLine();
				while ((Integer.valueOf(dd) > 31) || (Integer.valueOf(dd)) < 1) {
					System.out.println("Digite um dia Valido!");
					String ddverif = leitura.nextLine();
					dd = ddverif;
				}
				System.out.println("Digite o Mes: ");
				String mm = leitura.nextLine();
				while ((Integer.valueOf(mm) > 12) || (Integer.valueOf(mm)) < 1) {
					System.out.println("Digite um Mes Valido!");
					String mmverif = leitura.nextLine();
					mm = mmverif;
				}
				System.out.println("Digite o Ano: ");
				String aa = leitura.nextLine();
				while ((Integer.valueOf(aa) > 2024) || (Integer.valueOf(aa)) < 1900) {
					System.out.println("Digite um Ano Valido!");
					String aaverif = leitura.nextLine();
					aa = aaverif;
				}
				equipamento1.setDatafab(dd + "/" + mm + "/" + aa);
				estoque.add(equipamento1);

				System.out.println("Digite o preco do produto: ");
				String precodoequipamento = leitura.nextLine();
				float precodoequipamento1 = Float.valueOf(precodoequipamento);
				equipamento1.setPreco(precodoequipamento1);
				while (precodoequipamento1 < 1) {
					System.out.println("Preco invalido, digite um valor real: ");
					String precoconferir = leitura.nextLine();
					precodoequipamento1 = Float.valueOf(precoconferir);
				}
				break;

			case 2:
				System.out.println("***lista de equipamentos***");
				for (Equipamento equipamento : estoque) {
					System.out.println("Codigo: " + equipamento.getCodigo());
					System.out.println("Nome: " + equipamento.getNome());
					System.out.println("Numero de Serie: " + equipamento.getNumerodeserie());
					System.out.println("Marca: " + equipamento.getMarca());
					System.out.println("Preço: R$" + equipamento.getPreco());
					System.out.println("Data de Fabricacao: " + equipamento.getDatafab());
					System.out.println("");
				}
				break;

			case 3:
				System.out.println("***Digite o código do equipamento para Exclusão***");
				Integer CodigoParaDeletar = Integer.valueOf(leitura.nextLine());
				EquipamentoEncontrado = false;
				for (Equipamento equipamento : estoque) {
					if (CodigoParaDeletar.equals(equipamento.getCodigo())) {
						estoque.remove(equipamento);
						EquipamentoEncontrado = true;
						break;
					}
				}
				if (EquipamentoEncontrado == true) {
					System.out.println("Equipamento removido com sucesso!");
				} else {
					System.out.println("Equipamento não encontrado.");
				}
				System.out.println("");
				break;

			case 4:
				EquipamentoEncontrado = false;
				System.out.println("Digite o codigo do equipamento que deseja alterar");
				Integer CodigoParaAlterar = Integer.valueOf(leitura.nextLine());
				for (Equipamento equipamento : estoque) {
					if (CodigoParaAlterar.equals(equipamento.getCodigo())) {
						EquipamentoEncontrado = true;
						System.out.println("Digite o que deseja alterar:");
						System.out.println("1-Nome");
						System.out.println("2-Numero de Serie");
						System.out.println("3-Marca");
						System.out.println("4-Preco");
						System.out.println("5-Data de Fabricacao");
						System.out.println("0-Cancelar");
						int po = Integer.valueOf(leitura.nextLine());
						switch (po) {
						case 1:
							System.out.println("Renomeie o Equipamento: ");
							String NomeParaSubstituir = leitura.nextLine();
							equipamento.setNome(NomeParaSubstituir);
							System.out.println("Nome alterado com sucesso!");
							po = 0;
							break;
						case 2:
							System.out.println("Digite um novo Numero de Serie: ");
							int NumSerieSubstituir = Integer.valueOf(leitura.nextLine());
							equipamento.setNumerodeserie(NumSerieSubstituir);
							while (NumSerieSubstituir < 0) {
								System.out.println("Numero de serie invalido, digite de novo: ");
								String numserieconferir = leitura.nextLine();
								NumSerieSubstituir = Integer.valueOf(numserieconferir);
								equipamento.setNumerodeserie(NumSerieSubstituir);
							}
							System.out.println("Numero de Serie alterado com sucesso!");
							po = 0;
							break;
						case 3:
							System.out.println("Digite a nova marca do equipamento: ");
							String MarcaParaSubstituir = leitura.nextLine();
							equipamento.setMarca(MarcaParaSubstituir);
							System.out.println("Marca alterada com sucesso!");
							po = 0;
							break;
						case 4:
							System.out.println("Digite um novo Preco para o Equipamento: ");
							float PrecoSubstituir = Float.valueOf(leitura.nextLine());
							equipamento.setPreco(PrecoSubstituir);
							while (PrecoSubstituir < 1) {
								System.out.println("Preco invalido, digite um valor real: ");
								String precoconferir = leitura.nextLine();
								PrecoSubstituir = Float.valueOf(precoconferir);
							}
							System.out.println("Preco alterado com sucesso!");
							po = 0;
							break;
						case 5:
							System.out.println("Nova data de fabricacao do produto (dd/mm/aa): ");
							System.out.println("Digite o Dia: ");
							String dd1 = leitura.nextLine();
							while ((Integer.valueOf(dd1) > 31) || (Integer.valueOf(dd1)) < 1) {
								System.out.println("Digite um dia Valido!");
								String ddverif = leitura.nextLine();
								dd1 = ddverif;
							}
							System.out.println("Digite o Mes: ");
							String mm1 = leitura.nextLine();
							while ((Integer.valueOf(mm1) > 12) || (Integer.valueOf(mm1)) < 1) {
								System.out.println("Digite um Mes Valido!");
								String mmverif = leitura.nextLine();
								mm1 = mmverif;
							}
							System.out.println("Digite o Ano: ");
							String aa1 = leitura.nextLine();
							while ((Integer.valueOf(aa1) > 2024) || (Integer.valueOf(aa1)) < 1900) {
								System.out.println("Digite um Ano Valido!");
								String aaverif = leitura.nextLine();
								aa1 = aaverif;
							}
							String DataSubstituir = leitura.nextLine();
							equipamento.setDatafab(DataSubstituir);
							equipamento.setDatafab(dd1 + "/" + mm1 + "/" + aa1);
							estoque.add(equipamento);
							System.out.println("Data alterada com sucesso!");
							po = 0;
							break;
						}
						while (po != 0);
						System.out.println("Fim das Alteracoes");
						break;
					}
				}
				if (EquipamentoEncontrado == false) {
					System.out.println("Equipamento não encontrado, verifique o codigo");
				}
				break;
			}
		} while (op != 0);
		System.out.println("Fim do Programa");
	}
}