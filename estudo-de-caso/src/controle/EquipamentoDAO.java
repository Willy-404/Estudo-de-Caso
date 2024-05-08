package controle;

import java.util.ArrayList;

import modelo.Equipamento;

public class EquipamentoDAO {
	//não sei se é pra ter
	//Equipamento dao = new Equipamento();
	
	private ArrayList<Equipamento> estoque;
	private int geradorCod;
	
	//construtor "pseudo-metodo"
	public EquipamentoDAO() {
		this.estoque = new ArrayList<>();
		this.geradorCod = 1;
	}
	//função do cadastro
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
	//função da listagem
	public ArrayList<Equipamento> listar(){
		return this.estoque;
	}
	
	
	public ArrayList<Equipamento> getEstoque() {
		return estoque;
	}
	public void setEstoque(ArrayList<Equipamento> estoque) {
		this.estoque = estoque;
	}
}
