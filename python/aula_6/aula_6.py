#Sistema para adicionar, listar, deletar e pesquisar frutas na lista.

def main():
    fruits = ["Uva", "Kiwi", "Maçã"]

    while True:
        print("\n------------------------------------")
        print("\n1) Listar \n2) Adicionar \n3) Deletar \n4) Pesquisar \n5) Sair\n")
        print("------------------------------------\n")

        option = int(input("\nEscolha uma opção: "))

        if option == 1:
            list_fruits(fruits)

        elif option == 2:
            append_fruit(fruits)

        elif option == 3:
            delete_fruit(fruits)

        elif option == 4:
            search_fruit(fruits)

        elif option == 5:
            break

        else:
            print("\nOpção inválida, escolha uma opção válida")
            continue

    print("\nObrigado por usar o App")

def list_fruits(fruits):
    if len(fruits) == 0:
        print("\nNenhuma fruta cadastrada")
    else:
        print("Frutas cadastradas: \n")
        for index in range(len(fruits)):
            print(f"{index + 1} - {fruits[index]}")

def append_fruit(fruits):
    fruit = input("Digite o nome da fruta: ").capitalize()
    fruits.append(fruit)
    print(f"\n{fruit} adicionada com sucesso!")

def delete_fruit(fruits):

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

def search_fruit(fruits):

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