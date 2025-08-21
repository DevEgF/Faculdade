
name = input("Digite seu nome: ")
age = int(input("Digite sua idade: "))
salary = float(input("Digite seu salário: "))

print(
f"""
_________________________________________________________
Nome: {name} \nIdade: {age} \nSalário: R$ {salary:.2f}
_________________________________________________________
"""
)