package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroPessoais {
	Scanner sc = new Scanner(System.in);
	List<Pessoas> pess = new ArrayList<>();
	public int qtdAtual;
	Data nascimento;

	public void CadastrarPessoas() {
		System.out.println("Quantas pessoas vao ser cadastradas?");
		qtdAtual = sc.nextInt();

		for (int i = 0; i < qtdAtual; i++) {
			System.out.println(
					"Informe o usuario a ser inserido" + "\n1 - Cliente" + "\n2 - Funcionario" + "\n3 - Gerente");
			int aux = sc.nextInt();
			
			while (aux < 1 || aux > 3) {
				System.out.println("Comando invalido, Tente novamente");
				aux = sc.nextInt();
			}
			switch (aux) {
			case (1):
				System.out.print("Infome o Nome do Cliente: ");
				String nome = sc.next();
				System.out.println("Data de Nascimento");
				System.out.print("Dia: ");
				int dia = sc.nextInt();
				while (dia < 1 || dia > 31) {
					System.out.print("Dia invalido...\nInsira um novo dia\nDia: ");
					dia = sc.nextInt();
				}
				System.out.print("Mes: ");
				int mes = sc.nextInt();
				while (mes < 1 || mes > 12) {
					System.out.print("Mes invalido...\nInsira um novo mes\nMes: ");
					mes = sc.nextInt();
				}
				System.out.print("Ano:");
				int ano = sc.nextInt();
				nascimento = new Data(dia, mes, ano);
				System.out.print("Insira o Codigo do Cliente: ");
				int codigo = sc.nextInt();
				Cliente cliente = new Cliente(nome, nascimento, codigo);
				pess.add(cliente);
				break;

			case (2):

				System.out.print("Infome o Nome do Funcionario: ");
				nome = sc.next();
				System.out.println("Data de Nascimento");
				System.out.print("Dia: ");
				dia = sc.nextInt();
				while (dia < 1 || dia > 31) {
					System.out.print("Dia invalido...\nInsira um novo dia\nDia: ");
					dia = sc.nextInt();
				}
				System.out.print("Mes: ");
				mes = sc.nextInt();
				while (mes < 1 || mes > 12) {
					System.out.print("Mes invalido...\nInsira um novo mes\nMes: ");
					mes = sc.nextInt();
				}
				System.out.print("Ano:");
				ano = sc.nextInt();
				nascimento = new Data(dia, mes, ano);
				System.out.print("Infome o salario bruto do Funcionario: ");
				double salario = sc.nextDouble();
				Funcionario func = new Funcionario(nome, nascimento, salario);
				pess.add(func);
				break;

			case (3):
				System.out.print("Infome o Nome do Gerente: ");
				nome = sc.next();
				System.out.println("Data de Nascimento");
				System.out.print("Dia: ");
				dia = sc.nextInt();
				while (dia < 1 || dia > 31) {
					System.out.print("Dia invalido...\nInsira um novo dia\nDia: ");
					dia = sc.nextInt();
				}
				System.out.print("Mes: ");
				mes = sc.nextInt();
				while (mes < 1 || mes > 12) {
					System.out.print("Mes invalido...\nInsira um novo mes\nMes: ");
					mes = sc.nextInt();
				}
				System.out.print("Ano:");
				ano = sc.nextInt();
				nascimento = new Data(dia, mes, ano);
				System.out.print("Infome o salario bruto do Gerente: ");
				salario = sc.nextDouble();
				System.out.print("Informe a area do Gerente: ");
				String area = sc.next();
				Gerente ger = new Gerente(nome, nascimento, salario, area);
				pess.add(ger);
				break;
			default:
				break;
			}
		}
	}
    public void imprimeCadastros() {
		for(Pessoas a: pess) {
			System.out.println();
			System.out.println(a.imprimeDados());
		}
	}
}
