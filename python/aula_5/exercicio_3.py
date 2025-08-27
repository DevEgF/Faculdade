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