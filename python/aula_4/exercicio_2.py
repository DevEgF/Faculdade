#Faça um Programa que mostre a mensagem "Alo mundo" na tela.
message = "Alo mundo"
print(message)

# • Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
number = int(input("Digite um numero: "))
print([number])

# • Faça um Programa que peça dois números e imprima a soma.
number1 = int(input("Digite um numero: "))
number2 = int(input("Digite um numero: "))

soma = number1 + number2
print(soma)

# • Faça um Programa que peça as 4 notas bimestrais e mostre a média.
nota1 = float(input("Digite a nota 1: "))
nota2 = float(input("Digite a nota 2: "))
nota3 = float(input("Digite a nota 3: "))
nota4 = float(input("Digite a nota 4: "))
media = (nota1 + nota2 + nota3 + nota4) / 4
media = round(media, 2)

print("A média é:", media)

# • Faça um Programa que converta metros para centímetros.
metros = float(input("Digite a medida em metros: "))
centimetros = metros * 100

print(centimetros)

# • Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
raio = float(input("Digite o raio da circunferencia: "))
pi = 3.14
area = pi * (raio * 2)
print("A area da circunferencia é:", area)

# • Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
lado = float(input("Digite o lado do quadrado: "))
area = lado ** 2

dobro = area * 2
print("O dobro da area do quadrado é:", dobro)

# • Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
# • Calcule e mostre o total do seu salário no referido mês.
valorHora = float(input("Quanto você ganha por hora? "))
horasTrabalhadas = float(input("Quantas horas você trabalha por mês? "))
salario = valorHora * horasTrabalhadas
print("Seu salário é:", salario)

# • Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
# • C = 5 * ((F-32) / 9).
fahrenheit = float(input("Digite a temperatura em Fahrenheit: "))
celsius = 5 * ((fahrenheit - 32) / 9)
celsius = round(celsius, 2)
print("A temperatura em Celsius é:", celsius)

# • Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
# • F = C * 9/5 + 32
celsius = float(input("Digite a temperatura em Celsius: "))
fahrenheit = celsius * 9 / 5 + 32
fahrenheit = round(fahrenheit, 2)
print("A temperatura em Fahrenheit é:", fahrenheit)

# • Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
# • o produto do dobro do primeiro com metade do segundo .
# • a soma do triplo do primeiro com o terceiro.
# • o terceiro elevado ao cubo.
num1 = int(input("Digite o primeiro numero inteiro: "))
num2 = int(input("Digite o segundo numero inteiro: "))
num3 = float(input("Digite um numero real: "))

produto = (num1 * 2) * (num2 / 2)
soma = (num1 * 3) + num3
cubo = num3 ** 3
print("O produto do dobro do primeiro com metade do segundo é:", produto)
print("A soma do triplo do primeiro com o terceiro é:", soma)
print("O terceiro elevado ao cubo é:", cubo)

# • Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
# (72.7*altura) –58
altura = float(input("Digite sua altura em metros: "))
peso_ideal = (72.7 * altura) - 58
peso_ideal = round(peso_ideal, 2)
print("Seu peso ideal é:", peso_ideal)

# Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
# • Para homens: (72.7*h) –58
# • Para mulheres: (62.1*h) -44.7
altura = float(input("Digite sua altura em metros: "))
sexo = input("Digite seu sexo (M/F): ").upper()
if sexo == "M":
    peso_ideal = (72.7 * altura) - 58
    peso_ideal = round(peso_ideal, 2)
    print("Seu peso ideal é:", peso_ideal)
elif sexo == "F":
    peso_ideal = (62.1 * altura) - 44.7
    peso_ideal = round(peso_ideal, 2)
    print("Seu peso ideal é:", peso_ideal)
else:
    print("Sexo inválido")

# João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda vez que
# ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa
# de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso.

# Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. Imprima os
# dados do programa com as mensagens adequadas.

peso_ideal = 50
multa_por_kg = 4.00

peso = float(input("Digite o peso dos peixes em quilos: "))
if peso > peso_ideal:
    excesso = peso - peso_ideal
    multa = multa_por_kg * excesso
    print("Você excedeu o peso ideal em", excesso, "kg e deve pagar uma multa de R$", multa)
else:
    print("Peso dentro do limite. Não há multa.")

# • Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu
# salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
# programa que nos dê:
# • salário bruto.
# • quanto pagou ao INSS.
# • quanto pagou ao sindicato.
# • o salário líquido.
# • calcule os descontos e o salário líquido, conforme a tabela à direita

valor_hora = float(input("Digete o valor que você ganha por hora: "))
horas_trabalhadas = float(input("Digite o número de horas trabalhadas no mês: "))

salario_bruto = valor_hora * horas_trabalhadas
desconto_irrf = salario_bruto * 0.11
desconto_inss = salario_bruto * 0.08
desconto_sindicato = salario_bruto * 0.05
total_descontos = desconto_irrf + desconto_inss + desconto_sindicato

salario_liquido = salario_bruto - total_descontos

print("Valor pago ao IRRF: R$", round(desconto_irrf, 2))
print("Valor pago ao INSS: R$", round(desconto_inss, 2))
print("Valor pago ao Sindicato: R$", round(desconto_sindicato, 2))
print("Salário bruto: R$", round(salario_bruto, 2))
print("Total de descontos: R$", round(total_descontos, 2))
print("Salário líquido: R$", round(salario_liquido, 2))