package Classes;

public abstract class Pessoas {
	public String nome;
	public Data nascimento;
	
	public Pessoas(String nome, Data nascimento) {
		super();
		this.nome = nome;
		this.nascimento = nascimento;
	}

	public abstract String imprimeDados();

}
