# 1. Realiza a leitura de 2 floats e imprime as seguintes operações: soma, subtração, multiplicação, divisão e resto da divisão.
number1 = float(input("Digite o primeiro número: "))
number2 = float(input("Digite o segundo número: "))

soma = number1 + number2
print("A soma é: ", soma)

subtracao = number1 - number2
print("A subtração é: ", subtracao)

multiplicacao = number1 * number2
print("A multiplicação é: ", multiplicacao)

divisao = number1 / number2
print("A divisão é: ", divisao)

resto = number1 % number2
print("O resto da divisão é: ", resto)

#2 Realiza a leitura de 1 int e imprime o seu antecessor e o seu sucessor
num = int(input("Digite um número inteiro: "))

sucessor = num + 1
print("Seu sucessor é ",sucessor)

antecessor = num - 1
print("Seu antecessor é: ", antecessor)

#3 Realiza a leitura de 1 int e imprime o dobro,triplo e metade do valor lido.
leitura = int(input("Digite um número inteiro: "))

dobro = leitura * 2
triplo = leitura * 3
metade = leitura / 2

print("O dobro do valor lido é ", dobro)
print("O triplo do valor lido é ", triplo)
print("A metade do valor lido é ", metade)

#4 Realiza a leitura de 3 floats e imprime a média aritmética
nota1 = float(input("Digite a primeira nota: "))
nota2 = float(input("Digite a segunda nota: "))
nota3 = float(input("Digite a terceira nota: "))

media = (nota1 + nota2 + nota3) / 3
media = round(media, 2)

print(media)

#5 Realiza a leitura de 1 float referente ao valor de um produto e imprime o valor com descontos de 10%, 20% e 50%.
productValue = float(input("Digite o valor do produto: "))
discount1 = productValue * 0.9
print(discount1)
discount2 = productValue * 0.8
print(discount2)
discount3 = productValue * 0.5
print(discount3)

#6 Realiza a leitura de 1 float referente ao salário do cidadão e apresenta o salário com reajuste de 10% da inflação.
salary = float(input("Digite o salario: "))
correction = salary * 1.10
print(round(correction, 2))

#7 Realiza a leitura de 1 int e apresenta se ele é par ou ímpar
numero = int(input("Digite um número inteiro: "))

if numero % 2 == 0:
    print("Esse número é par")
else:
    print("Esse número é ímpar")

#8 Faça um programa que pede duas notas de um aluno. Em seguida ele deve calcular a média do aluno e dar o seguinte
#  resultado:
# • A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
# • A mensagem "Reprovado", se a média for menor do que sete;
# • A mensagem "Aprovado com Distinção", se a média for igual a dez

nota1Aluno1 = float(input("Digite a primeira nota: "))
nota2Aluno1 = float(input("Digite a segunda nota: "))

media = (nota1Aluno1 + nota2Aluno1) / 2
media = round(media, 2)

if media > 10 or media < 0:
    print("Nota inválida")
elif media == 10:
    print("Aprovado com Distinção")
elif media >= 7:
    print("Sua nota é:",media)
    print("Aprovado")
else:
    print("Reprovado")

#9 Faça um Programa que leia dois números inteiros e mostre o maior deles

number1 = int(input("Digite o primeiro número: "))
number2 = int(input("Digite o segundo número: "))

if number1 > number2:
    print("O maior número é: ", number1)
elif number1 < number2:
    print("O maior número é: ", number2)
else:
    print("números iguais")

# 10 Faça um programa que pede dois inteiro e armazene em duas variáveis. Em seguida, troque o valor das variáveis e
# exiba na tela

var1 = int(input("Digite o primeiro número: "))
var2 = int(input("Digite o segundo número: "))

aux = var1

var1 = var2
print("Variável1 ", var1)

var2 = aux
print("Variável2", var2)

#11 As Organizações Hamurabi Medeiros resolveram dar um aumento de salário aos seus colaboradores e lhe contrataram
# para desenvolver o programa que calculará os reajustes.
# • Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no
# salário atual:
# • salários até R$ 280,00 (incluindo) : aumento de 20%
# • salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
# • salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
# • salários de R$ 1500,00 em diante : aumento de 5%
# • Após o aumento ser realizado, informe na tela:
# • o salário antes do reajuste;
# • o percentual de aumento aplicado;
# • o valor do aumento;
# • o novo salário, após o aumento.

salario = float(input("Digite o salário do colaborador: "))
if salario <= 280:
    percentual = 20
elif salario <= 700:
    percentual = 15
elif salario <= 1500:
    percentual = 10
else:
    percentual = 5

valor_aumento = salario * percentual / 100
novo_salario = salario + valor_aumento

print("Salário antes do reajuste: R$", round(salario, 2))
print("Percentual de aumento aplicado:", f"{percentual}%")
print("Valor do aumento: R$", round(valor_aumento, 2))
print("Novo salário, após o aumento: R$", round(novo_salario, 2))

#12 Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, e
# calcule a sua média. A atribuição de conceitos deve obedecer à tabela acima

nota1 = float(input("Digite a primeira nota: "))
nota2 = float(input("Digite a segunda nota: "))
media = (nota1 + nota2) / 2
media = round(media, 2)

print("A média é:", media)

conceito = ""

if media >= 9.0 and media <= 10.0:
    conceito = "A"
elif media >= 7.5 and media <= 9.0:
    conceito = "B"
elif media >= 6.0 and media <= 7.5:
    conceito = "C"
elif media >= 4.0 and media <= 6.0:
    conceito = "D"
elif media >= 0.0 and media <= 4.0:
    conceito = "E"

if conceito != "":
    print("O conceito é:", conceito)
