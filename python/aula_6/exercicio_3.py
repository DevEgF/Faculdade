# Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue a pedir até que o
# usuario informe um valor válido.

nota = -1
while nota < 0 or nota > 10:
    nota = float(input("Digite uma nota entre 0 e 10: "))
    if nota < 0 or nota > 10:
        print("Nota inválida. Tente novamente.")

# Faça um programa que leia um nome de usuario e a sua senha e não aceite a senha igual ao nome do usuario, mostrando uma mensagem de
# erro e voltando a pedir as informações.

usuario = ""
senha = ""
while True:
    usuario = input("Digite o nome de usuário: ")
    senha = input("Digite a senha: ")
    if usuario == senha:
        print("Erro: A senha não pode ser igual ao nome de usuário. Tente novamente.")
    else:
        break
print("Usuário e senha cadastrados com sucesso.")

# Faça um programa que leia e valide as seguintes informações:
# • Nome: maior que 3 caracteres;
# • Idade: entre 0 e 150;
# • Salário: maior que zero;
# • Sexo: 'f' ou 'm';
# • Estado Civil: 's', 'c', 'v', 'd’;

nome = ""
while len(nome) <= 3:
    nome = input("Digite um nome (mais de 3 caracteres): ")
    if len(nome) <= 3:
        print("Nome inválido. Tente novamente.")

idade = -1
while idade < 0 or idade > 150:
    idade = int(input("Digite a idade (entre 0 e 150): "))
    if idade < 0 or idade > 150:
        print("Idade inválida. Tente novamente.")

salario = -1
while salario <= 0:
    salario = float(input("Digite o salário (maior que zero): "))
    if salario <= 0:
        print("Salário inválido. Tente novamente.")

sexo = ""
while sexo not in ['f', 'm']:
    sexo = input("Digite o sexo ('f' ou 'm'): ").lower()
    if sexo not in ['f', 'm']:
        print("Sexo inválido. Tente novamente.")

estado_civil = ""
while estado_civil not in ['s', 'c', 'v', 'd']:
    estado_civil = input("Digite o estado civil ('s', 'c', 'v', 'd'): ").lower()
    if estado_civil not in ['s', 'c', 'v', 'd']:
        print("Estado civil inválido. Tente novamente.")

print("Dados cadastrados com sucesso.")

#Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% e que a população de
# B seja 200000 habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o número de anos necessários
# para que a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.

populacao_a = 80000
taxa_crescimento_a = 0.03
populacao_b = 200000
taxa_crescimento_b = 0.015
anos = 0

while populacao_a < populacao_b:
    populacao_a += populacao_a * taxa_crescimento_a
    populacao_b += populacao_b * taxa_crescimento_b
    anos += 1
print(f"Serão necessários {anos} anos para que a população do país A ultrapasse ou iguale a população do país B.")

#Altere o programa anterior permitindo ao usuario informar as populações e as taxas de crescimento iniciais. Valide a entrada e permita
# repetir a operação.


def readPopulation(country):
    while True:
        try:
            value = float(input(f"Digite a população do país {country} (maior que 0): "))
            if value > 0:
                return value
            print("População inválida. Tente novamente.")
        except ValueError:
            print("Valor inválido. Tente novamente.")

def readGrowthRate(country):
    while True:
        try:
            tax = float(input(f"Digite a taxa de crescimento do país {country} (em %): ")) / 100
            if tax >= 0:
                return tax
            print("Taxa de crescimento inválida. Tente novamente.")
        except ValueError:
            print("Valor inválido. Tente novamente.")

def calculateYears(populationA, growthRateA, populationB, growthRateB):
    years = 0
    while populationA < populationB:
        populationA += populationA * growthRateA
        populationB += populationB * growthRateB
        years += 1
    return years

def main():
    while True:
        populationA = readPopulation("A")
        growthRateA = readGrowthRate("A")
        populationB = readPopulation("B")
        growthRateB = readGrowthRate("B")

        years = calculateYears(populationA, growthRateA, populationB, growthRateB)
        print(f"Serão necessários {years} anos para que a população do país A ultrapasse ou iguale a população do país B.")

        repeat = input("Deseja repetir a operação? (s/n): ").lower()
        if repeat != 's':
            break

    print("Programa encerrado.")

main()

#Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro. Depois modifique o programa para que ele mostre os
# números um ao lado do outro.

for i in range(1, 21):
    print(i)
print("\n")

for i in range(1, 21):
    print(i, end=' ')
print()

#Faça um programa que leia 5 números e informe o maior número.
numeros = []
for _ in range(5):
    num = float(input("Digite um número: "))
    numeros.append(num)

maior_numero = max(numeros)
print(f"O maior número é: {maior_numero}")

#Faça um programa que leia 5 números e informe a soma e a média dos números.
soma = sum(numeros)
media = soma / len(numeros)
print(f"A soma dos números é: {soma}")
print(f"A média dos números é: {media}")

#Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.
for i in range(1, 51):
    if i % 2 != 0:
        print(i, end=' ')
print()

#Faça um programa que receba dois números inteiros e gere os números inteiros que estao no intervalo compreendido por eles.
num1 = int(input("Digite o primeiro número inteiro: "))
num2 = int(input("Digite o segundo número inteiro: "))

if num1 > num2:
    num1, num2 = num2, num1
for i in range(num1 + 1, num2):
    print(i, end=' ')
print()

#Altere o programa anterior para mostrar no final a soma dos números.
soma_intervalo = 0
for i in range(num1 + 1, num2):
    print(i, end=' ')
    soma_intervalo += i
print(f"\nA soma dos números no intervalo é: {soma_intervalo}")

#Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuario deve informar de qual
#numero ele deseja ver a tabuada.

num = int(input("Digite um número inteiro entre 1 e 10 para ver a tabuada: "))
if 1 <= num <= 10:
    print(f"Tabuada de {num}:")
    for i in range(1, 11):
        print(f"{num} x {i} = {num * i}")
else:
    print("Número inválido. Tente novamente.")

#Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao segundo número. Não utilize a
# função de potência da linguagem

base = int(input("Digite a base (número inteiro): "))
expoente = int(input("Digite o expoente (número inteiro): "))
resultado = 1
for _ in range(expoente):
    resultado *= base
print(f"{base} elevado a {expoente} é igual a {resultado}")

#Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números impares.
pares = 0
impares = 0
for _ in range(10):
    num = int(input("Digite um número inteiro: "))
    if num % 2 == 0:
        pares += 1
    else:
        impares += 1
print(f"Quantidade de números pares: {pares}")
print(f"Quantidade de números ímpares: {impares}")

#Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120
num = int(input("Digite um número inteiro para calcular o fatorial: "))
fatorial = 1
for i in range(1, num + 1):
    fatorial *= i
print(f"O fatorial de {num} é {fatorial}")

#Faça um programa que, dado um conjunto de N números, determine o menor valor, o maior valor e a soma dos valores

n = int(input("Quantos números você deseja informar? "))
numeros = []
for _ in range(n):
    num = float(input("Digite um número: "))
    numeros.append(num)
menor_valor = min(numeros)
maior_valor = max(numeros)
soma_valores = sum(numeros)
print(f"O menor valor é: {menor_valor}")
print(f"O maior valor é: {maior_valor}")
print(f"A soma dos valores é: {soma_valores}")

