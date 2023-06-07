def adicao(a, b):
    return a + b

def subtracao(a, b):
    return a + b

def multiplicacao(a, b):
    return a * b

def divisao(a, b):
    if b == 0:
        return "Erro: divisão por zero!"
    return a / b

# Entrada dos números
a = float(input("Digite o primeiro número: "))
b = float(input("Digite o segundo número: "))

# Cálculo das operações
soma = adicao(a, b)
subtracao = subtracao(a, b)
multiplicacao = multiplicacao(a, b)
divisao = divisao(a, b)

# Teste das operações
print("Operações matemáticas:")
print(f"{a} + {b} = {soma}")
print(f"{a} - {b} = {subtracao}")
print(f"{a} * {b} = {multiplicacao}")
print(f"{a} / {b} = {divisao}")

# Teste dos resultados
teste_soma = a + b == soma
teste_subtracao = a - b == subtracao
teste_multiplicacao = a * b == multiplicacao
if b != 0:
    teste_divisao = a / b == divisao
else:
    teste_divisao = "Erro: divisão por zero!"

# Verificação dos testes
if teste_soma and teste_subtracao and teste_multiplicacao and teste_divisao:
    print("Todos os testes foram aprovados!")
if teste_soma == False:
    print("Houve um erro no teste da Soma.")
if teste_subtracao == False:
    print("Houve um erro no teste da Subtração.")
if teste_multiplicacao == False:
    print("Houve um erro no teste da multiplicação.")
if teste_divisao == False:
    print("Houve um erro no teste da Divisão.")