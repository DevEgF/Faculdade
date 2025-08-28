#Sistema para adicionar, listar, deletar e pesquisar frutas na lista.

def main():
    fruits = ["Uva", "Kiwi", "Maçã"]

    while True:
        print("\n------------------------------------")
        print("\n1) Listar \n2) Adicionar \n3) Deletar \n4) Pesquisar \n5) Sair\n")
        print("------------------------------------\n")

        option = int(input("\nEscolha uma opção: "))

        if option == 1:
            enumerateFruits(fruits)

        elif option == 2:
            appendFruit(fruits)

        elif option == 3:
            deleteFruit(fruits)

        elif option == 4:
            searchFruit(fruits)

        elif option == 5:
            break

        else:
            print("\nOpção inválida, escolha uma opção válida")
            continue

    print("\nObrigado por usar o App")

def enumerateFruits(fruits):
    if len(fruits) == 0:
        print("\nNenhuma fruta cadastrada")
    else:
        print("Frutas cadastradas: \n")
        for index, item in enumerate(fruits):
            print(f"{index} - {item}")

def appendFruit(fruits):
    fruit = input("Digite o nome da fruta: ").capitalize()
    fruits.append(fruit)
    print(f"\n{fruit} adicionada com sucesso!")

def deleteFruit(fruits):
    if not fruits:
        print("\nA lista está vazia!")
        return

    try:
        index = int(input("Digite o índice da fruta para remover: "))
        fruit = fruits.pop(index)
        print(f"\n{fruit} removida com sucesso!")
    except (ValueError, IndexError):

        print("\nÍndice inválido!")

def searchFruit(fruits):
    if not fruits:
        print("\nA lista está vazia!")
        return

    try:
        index = int(input("Digite o índice da fruta: "))
        fruit = fruits[index]
        print(f"\nFruta encontrada: {fruit}")
    except (ValueError, IndexError):
        print("\nÍndice inválido!")