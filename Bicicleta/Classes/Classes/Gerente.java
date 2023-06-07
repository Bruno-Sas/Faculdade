package Classes;

public class Gerente extends Funcionario{
	public String area;
	
	public Gerente(String nome, Data nascimento, double salario, String area) {
		super(nome, nascimento, salario);
		this.area = area;
	}
	public double calcularImposto() {
		return super.salario * (1 - 0.05);
	}
	@Override
	public String imprimeDados() {
		
		return "Nome do Gerente: " + super.nome + "\nAniversario do Gerente: " + super.nascimento.Dia +"/" + super.nascimento.Mes+"/" + super.nascimento.Ano
				+ "\nSalario Bruto do Gerente R$: " + this.salario
				+ "\nSalario Gerente R$: " + this.calcularImposto() + "\nArea do Gerente" + this.area;
	}


}
