package Classes;

public class Funcionario extends Pessoas{
	public double salario;

	public Funcionario(String nome, Data nascimento, double salario) {
		super(nome, nascimento);
		this.salario = salario; 
	}
	public double calcularImposto() {
        return this.salario * (1 - 0.03);}

	
	@Override
	public String imprimeDados() {
		
		return "Nome do Funcionario: " + super.nome + "\nAniversario do Funcionario: " + super.nascimento.Dia +"/" + super.nascimento.Mes+"/" + super.nascimento.Ano
				+ "\nSalario Bruto do Funcionario R$: " + this.salario
				+ "\nSalario liquido R$: " + this.calcularImposto();
	}
	
}

