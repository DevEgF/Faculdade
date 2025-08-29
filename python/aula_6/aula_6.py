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
        for index in range(len(fruits)):
            print(f"{index + 1} - {fruits[index]}")

def appendFruit(fruits):
    fruit = input("Digite o nome da fruta: ").capitalize()
    fruits.append(fruit)
    print(f"\n{fruit} adicionada com sucesso!")

def deleteFruit(fruits):

    index = input("Digite o índice da fruta para remover: ")
    if not index.isdigit():
        print("\nÍndice inválido!")
        return
    index = int(index) - 1
    if index < 0 or index >= len(fruits):
        print("\nÍndice inválido!")
        return
    fruit = fruits.pop(index)
    print(f"\n{fruit} removida com sucesso!")

def searchFruit(fruits):

    index = input("Digite o índice da fruta: ")
    if not index.isdigit():
        print("\nÍndice inválido!")
        return
    index = int(index) - 1
    if index < 0 or index >= len(fruits):
        print("\nÍndice inválido!")
        return
    fruit = fruits[index]
    print(f"\nFruta encontrada: {fruit}")