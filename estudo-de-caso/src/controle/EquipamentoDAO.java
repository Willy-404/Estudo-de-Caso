
package controle;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.Equipamento;

public class EquipamentoDAO {
	//DAO significa "Decentralized Autonomous Organization";
	
	//construtor "pseudo-metodo";
	private EquipamentoDAO() {
		this.estoque = new ArrayList<>();
		this.geradorCod = 1;
	}	
	
	//Arraylist dentro do EquipamentoDAO
	private ArrayList<Equipamento> estoque;
	private int geradorCod;
	private static EquipamentoDAO instancia;
	
	public static EquipamentoDAO getInstancia() {
		if(instancia==null) {
			instancia = new EquipamentoDAO();
		}
		return instancia;
	}

	//função do cadastro;
	public int cadastro(Equipamento equip) {
	if (equip != null) {
		equip.setCodigo(geradorCod);
		geradorCod = geradorCod + 1;
		estoque.add(equip);
	}
		return equip.getCodigo();
	}
	public int getGeradorId() {
		return geradorCod;
	}
	public void setGeradorId(int geradorId) {
		this.geradorCod = geradorId;
	}
	
	//função da listagem;
	public ArrayList<Equipamento> listar(){
		return this.estoque;
	}
	
	//metodo  remover;
	public boolean remover(Equipamento equipamento) {
		boolean verifica = estoque.remove(equipamento);
		return verifica;
	}
}
