using System;

namespace Calculadora
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Calculadora");

            // Solicitar ao usuário que insira os números
            Console.WriteLine("Digite o número 'a':");
            double num1 = double.Parse(Console.ReadLine());

            Console.WriteLine("Digite o número 'b':");
            double num2 = double.Parse(Console.ReadLine());

            // Exibir o menu de opções
            Console.WriteLine("Escolha a operação:");
            Console.WriteLine("1. Soma (+)");
            Console.WriteLine("2. Subtração (-)");
            Console.WriteLine("3. Multiplicação (*)");
            Console.WriteLine("4. Divisão (/)");
            Console.WriteLine("5. Potenciação (a^b)");
            Console.WriteLine("6. Radiciação (raiz(a))");
            Console.WriteLine("7. Fatorial (a!)");
            Console.WriteLine("8. Logaritmo (log(a))");
            Console.WriteLine("9. Seno");
            Console.WriteLine("10. Cosseno");
            Console.WriteLine("11. Tangente");

            int opcao = int.Parse(Console.ReadLine());
            double resultado = 0;

            // Executar a operação selecionada
            switch (opcao)
            {
                case 1:
                    resultado = Soma(num1, num2);
                    break;
                case 2:
                    resultado = Subtracao(num1, num2);
                    break;
                case 3:
                    resultado = Multiplicacao(num1, num2);
                    break;
                case 4:
                    resultado = Divisao(num1, num2);
                    break;
                case 5:
                    resultado = Potenciacao(num1, num2);
                    break;
                case 6:
                    resultado = Radiciacao(num1);
                    break;
                case 7:
                    resultado = Fatorial(num1);
                    break;
                case 8:
                    resultado = Logaritmo(num1);
                    break;
                case 9:
                    resultado = Seno(num1);
                    break;
                case 10:
                    resultado = Cosseno(num1);
                    break;
                case 11:
                    resultado = Tangente(num1);
                    break;
                default:
                    Console.WriteLine("Opção inválida");
                    return;
            }

            // Exibir o resultado
            Console.WriteLine("Resultado: " + resultado);
        }

        // Funções para as operações básicas
        static double Soma(double a, double b)
        {
            return a + b;
        }

        static double Subtracao(double a, double b)
        {
            return a - b;
        }

        static double Multiplicacao(double a, double b)
        {
            return a * b;
        }

        static double Divisao(double a, double b)
        {
            return a / b;
        }

        // Funções para as operações científicas
        static double Potenciacao(double a, double b)
        {
            return Math.Pow(a, b);
        }

        static double Radiciacao(double a)
        {
            return Math.Sqrt(a);
        }

        static double Fatorial(double a)
        {
            if (a == 0 || a == 1)
                return 1;
            else
                return a * Fatorial(a - 1);
        }

        static double Logaritmo(double a)
        {
            return Math.Log(a);
        }

        // Funções para as operações trigonométricas
        static double Seno(double a)
        {
            return Math.Sin(a);
        }

        static double Cosseno(double a)
        {
            return Math.Cos(a);
        }

        static double Tangente(double a)
        {
            return Math.Tan(a);
        }
    }
}