package Classes;

public class Cliente extends Pessoas{
	public int codigo; 

	public Cliente(String nome, Data nascimento, int codigo) { 
		super(nome, nascimento);
		this.codigo = codigo;
	}

	@Override
	public String imprimeDados() {
		return "Nome do Cliente: " + super.nome + "\nAniversario do Cliente: " + super.nascimento.Dia +"/" + super.nascimento.Mes+"/" + super.nascimento.Ano
				+ "\nCodigo do Cliente " + this.codigo;
	}

	

}
