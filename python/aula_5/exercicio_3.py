#Faça um Programa que peça dois números e imprima o maior deles.
number1 = float(input("Digite o primeiro numero: "))
number2 = float(input("Digite o segundo numero: "))

if number1 > number2:
    print("O maior numero é:", number1)
elif number2 > number1:
    print("O maior numero é:", number2)

#Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo
number = float(input("Digite um numero: "))
if number > 0:
    print("O numero é positivo")
elif number < 0:
    print("O numero é negativo")
else:
    print("O numero é zero")

#Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
gender = input("Digite o sexo (M/F): ")
if gender == "M":
    print("Masculino")
elif gender == "F":
    print("Feminino")
else:
    print("Sexo inválido")

#Faça um Programa que verifique se uma letra digitada é vogal ou consoante
letter = input("Digite uma letra: ").lower()
if letter in "aeiou":
    print("A letra é uma vogal")
elif letter.isalpha():
    print("A letra é uma consoante")
else:
    print("Não é uma letra válida")

#Faça um Programa que leia três números e mostre o maior deles
num1 = float(input("Digite o primeiro numero: "))
num2 = float(input("Digite o segundo numero: "))
num3 = float(input("Digite o terceiro numero: "))

if num1 >= num2 and num1 >= num3:
    print("O maior numero é:", num1)
elif num2 >= num1 and num2 >= num3:
    print("O maior numero é:", num2)
else:
    print("O maior numero é:", num3)

#Faça um Programa que leia três números e mostre o maior e o menor deles.
num1 = float(input("Digite o primeiro numero: "))
num2 = float(input("Digite o segundo numero: "))
num3 = float(input("Digite o terceiro numero: "))

maior = num1
menor = num1

if num2 > maior:
    maior = num2
if num3 > maior:
    maior = num3
if num2 < menor:
    menor = num2
if num3 < menor:
    menor = num3
print("O maior numero é:", maior)
print("O menor numero é:", menor)

#Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre
#pelo mais barato.

preco1 = float(input("Digite o preço do primeiro produto: "))
preco2 = float(input("Digite o preço do segundo produto: "))
preco3 = float(input("Digite o preço do terceiro produto: "))

priceList = [preco1, preco2, preco3]

if priceList[0] <= priceList[1] and priceList[0] <= priceList[2]:
    print("Você deve comprar o primeiro produto")
elif priceList[1] <= priceList[0] and priceList[1] <= priceList[2]:
    print("Você deve comprar o segundo produto")
else:
    print("Você deve comprar o terceiro produto")

#Faça um Programa que leia três números e mostre-os em ordem decrescente.

num1 = float(input("Digite o primeiro numero: "))
num2 = float(input("Digite o segundo numero: "))
num3 = float(input("Digite o terceiro numero: "))

numbers = [num1, num2, num3]
numbers.sort(reverse=True)
print("Números em ordem decrescente:", numbers)

#Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutinoou V-Vespertinoou N-Noturno. Imprima a
# mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.

turn = input("Em que turno você estuda? (M/V/N): ").upper()
if turn == "M":
    print("Bom Dia!")
elif turn == "V":
    print("Boa Tarde!")
elif turn == "N":
    print("Boa Noite!")
else:
    print("Valor Inválido!")

#Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2-Segunda, etc.), se digitar outro valor deve
# aparecer valor inválido

dias_semana = [
    "Domingo",
    "Segunda-feira",
    "Terça-feira",
    "Quarta-feira",
    "Quinta-feira",
    "Sexta-feira",
    "Sábado"
]

try:
    day = int(input("Digite um número (1-7) para o dia da semana: "))
    if 1 <= day <= 7:
        print(dias_semana[day - 1])
    else:
        print("Valor inválido")
except ValueError:
    print("Valor inválido")

#Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe se este ano é ou não bissexto.

def eh_bissexto(ano):
    return (ano % 4 == 0 and ano % 100 != 0) or (ano % 400 == 0)

ano = int(input("Digite um ano: "))

if eh_bissexto(ano):
    print(f"O ano {ano} é bissexto")
else:
    print(f"O ano {ano} não é bissexto")

#Faça um Programa que peça uma data no formato dd/mm/aaaae determine se a mesma é uma data válida
def is_valid_date(date_str):
    try:
        day, month, year = map(int, date_str.split("/"))
    except ValueError:
        return False

    if year < 1 or month < 1 or month > 12 or day < 1:
        return False

    if month in [1, 3, 5, 7, 8, 10, 12]:
        return day <= 31
    elif month in [4, 6, 9, 11]:
        return day <= 30
    elif month == 2:
        is_leap = (year % 4 == 0 and year % 100 != 0) or (year % 400 == 0)
        return day <= 29 if is_leap else day <= 28
    return False

date = input("Digite uma data no formato dd/mm/aaaa: ")
if is_valid_date(date):
    print("Data válida!")
else:
    print("Data inválida!")